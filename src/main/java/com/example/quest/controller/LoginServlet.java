package com.example.quest.controller;

import com.example.quest.entity.User;
import com.example.quest.service.UserService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/logIn")
public class LoginServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(LoginServlet.class);
    UserService userRepository = UserService.getUserRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object user = session.getAttribute("User");
        if (user != null) {
            logger.info("before forward");
            response.sendRedirect("/yourChoice");
        }else {
            logger.info("before forward login.jsp");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");

        HttpSession currentSession = request.getSession();

        Optional<User> user = userRepository.find(name);

        if(!user.isPresent()){
            logger.error("invalid login or password");
            request.setAttribute("isValidName", "Неправильные имя или пароль");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

        boolean isValidate = userRepository.checkUser(user.get(), pass);

        if(!isValidate){
            logger.error("invalid login or password");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }

        logger.info("successful login");
        currentSession.setAttribute("User", user.get());
        response.sendRedirect("/yourChoice");
    }

    private boolean isNull(String... dats){
        for (String data: dats){
            if(data == null) return true;
        }
        return false;
    }
}
