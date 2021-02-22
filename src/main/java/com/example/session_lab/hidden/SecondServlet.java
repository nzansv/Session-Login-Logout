package com.example.session_lab.hidden;

import java.io.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)  {
        try{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n=request.getParameter("uname");
        out.print("<a href=\"index.html\">Cookie</a>|");
        out.print("<a href=\"hidden.html\">Hidden Forms</a>|");
        out.print("<a href=\"url.html\">URL Rewrite</a>|");
        out.print("<a href=\"http_session.html\">HTTP Session</a>");
        out.print("<p>Hello "+n+"<p>");

        out.close();
    }catch(Exception e){System.out.println(e);}
}
}
