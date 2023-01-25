package com.example.quest.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebFilter(filterName = "userLoginFilter", servletNames = "ChoiceServlet")
public class LoginFilter implements Filter {


    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        System.out.println("#INFO " + "Сработал фильтр сервлета выбора варианта");
        chain.doFilter(request, response);
    }
}
