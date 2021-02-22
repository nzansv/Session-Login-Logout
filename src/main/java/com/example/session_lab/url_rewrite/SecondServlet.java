package com.example.session_lab.url_rewrite;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)  {
        try{

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<a href=\"index.html\">Cookie</a>|");
        out.print("<a href=\"hidden.html\">Hidden Forms</a>|");
        out.print("<a href=\"url.html\">URL Rewrite</a>|");
        out.print("<a href=\"http_session.html\">HTTP Session</a>");
        String n=request.getParameter("uname");
        out.print("<p>Hello "+n+"<p>");

        out.close();

    }catch(Exception e){System.out.println(e);}
}


}
