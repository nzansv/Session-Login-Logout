package com.example.session_lab.url_rewrite;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class FirstServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try{

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String n=request.getParameter("userName");
            out.print("<p>Welcome "+n+"<p>");

            out.print("<a href='url2?uname="+n+"'>visit</a>");

            out.close();

        }catch(Exception e){System.out.println(e);}
    }

}
