package at.htlpinkafeld.servletexample;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        /*The side will be updatet every second - Attention: This is a problem with
         the input below*/
        //response.setHeader("Refresh", "1");
        PrintWriter out = response.getWriter();


        /* output page here*/
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
        out.println("<title>Demo</title></head>");
        out.println("<body>");
        out.println("<div class=\"card shadow p-3 mt-3\" style=\"width: 25rem; margin: 0 auto;\">");
        out.println("<div class=\"card-body mt-3\">");
        out.println("<h3>Hello Servlet at " + request.getContextPath() +
                " from client " + request.getRemoteHost() + "</h3>");
        out.println("<form action='demo' method='get'>");  // von hello auf demo geändert
        out.println("Input: <input class=\"mt-3\" type='text' name='textfield' value='Mutzi'/>");
        out.println("<br>");
        out.println("<input class=\"btn btn-primary mt-3 mb-3\" type='submit' name='submitbutton' value='Print'/>");
        out.println("<br>");
        out.println("Print: ");
        if (request.getParameter("textfield")!= null)
            out.println(request.getParameter("textfield"));
        /*Print form, which calls servlet with submit button*/
        out.println("</form>");
        out.println("<a class=\"btn btn-success mt-3\" href=index.html>Home</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request,response);
    }
}
