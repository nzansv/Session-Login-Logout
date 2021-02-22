package com.example.session_lab.http_session;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session=request.getSession(false);
        String n=(String)session.getAttribute("uname");
            out.print("<a href=\"index.html\">Cookie</a>|");
            out.print("<a href=\"hidden.html\">Hidden Forms</a>|");
            out.print("<a href=\"url.html\">URL Rewrite</a>|");
            out.print("<a href=\"http_session.html\">HTTP Session</a>");
            out.print("<a href=\"sindex.html\">HTTP Session (Login Logout)</a>");
            out.print("<p>Hello "+n+"<p>");

        out.close();

    }catch(Exception e){System.out.println(e);}
}


}
