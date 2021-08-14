package org.zerock.m2.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.m2.dto.MemberDTO;
import org.zerock.m2.service.MemberService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Log4j2
@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String mid = request.getParameter("mid");
        String mpw = request.getParameter("mpw");

        try{
            MemberDTO memberDTO = MemberService.INSTANCE.login(mid,mpw);
            HttpSession session = request.getSession();
            session.setAttribute("member", memberDTO);

            response.sendRedirect("/msg/list");
        } catch (IOException e) {
            log.error("Login Fail..."+ e.getMessage());
            response.sendRedirect("/login?result-fail");
        }
    }
}
