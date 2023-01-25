package com.example.quest.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

@WebServlet("/endOr")
public class EndServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(EndServlet.class);
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("end", request.getSession().getAttribute("end"));
        logger.info("before forward end.jsp");
        getServletContext().getRequestDispatcher("/WEB-INF/end.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
