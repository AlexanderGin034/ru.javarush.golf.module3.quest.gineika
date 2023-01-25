package com.example.quest.controller;

import com.example.quest.entity.Answer;
import com.example.quest.entity.Question;
import com.example.quest.entity.Statistics;
import com.example.quest.entity.User;
import com.example.quest.service.GameService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

@WebServlet("/yourChoice")
public class ChoiceServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(ChoiceServlet.class);
    private GameService gameService;
    private InetAddress ip;

    @Override
    public void init() throws ServletException {
        super.init();
        gameService = new GameService();
        try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            logger.warn("IP is null");
            ip = null;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Question question = gameService.getQuestion(gameService.getGameCount()).get();
        request.setAttribute("question", question.getText());
        request.setAttribute("answer1", question.getAnswers().get(0).getText());
        request.setAttribute("answer2", question.getAnswers().get(1).getText());


        showStatistics((User) request.getSession().getAttribute("User"), request, ip);
        System.out.println("before forward");// log
        getServletContext().getRequestDispatcher("/WEB-INF/choice.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = request.getParameter("flexRadioDefault");
        HttpSession session = request.getSession();
        User user = (User) request.getSession().getAttribute("User");
        Statistics statistics = user.getStatistics();

        if(answer.equals("1")){
            if (gameService.getGameCount() == 3) {
                statistics.setCountGame();
                statistics.setWin();
                Question question = gameService.getQuestion(gameService.getGameCount()).get();
                Answer answerEnd = question.getAnswers().get(0);
                session.setAttribute("end", answerEnd.getResult());
                logger.info("before redirect endOr");
                response.sendRedirect("/endOr");
            }else {
                gameService.incrGameCount();
                logger.info("before redirect yourChoice");
                response.sendRedirect("/yourChoice");
            }
        }else{
            statistics.setLost();
            statistics.setCountGame();
            Question question = gameService.getQuestion(gameService.getGameCount()).get();
            Answer answerEnd = question.getAnswers().get(1);
            session.setAttribute("end", answerEnd.getResult());
            logger.info("before redirect endOr");
            response.sendRedirect("/endOr");
        }
    }

    private void showStatistics(User user, HttpServletRequest request, InetAddress ip) {
        request.setAttribute("name", user.getName());
        request.setAttribute("win", user.getStatistics().getWin());
        request.setAttribute("lost", user.getStatistics().getLost());
        request.setAttribute("game", user.getStatistics().getCountGame());
        request.setAttribute("ip", ip.getHostAddress());
    }
}
