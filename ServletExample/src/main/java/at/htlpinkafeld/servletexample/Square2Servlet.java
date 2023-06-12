package at.htlpinkafeld.servletexample;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Square2Servlet extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
        out.println("<title>Square</title></head>");
        out.println("<body>");
        out.println("<div class=\"card shadow p-3 mt-3\" style=\"width: 25rem; margin: 0 auto;\">");
        out.println("<h3 class=\"card-header mt-3\">Calculate area and perimeter of a square</h3>");
        out.println("<div class=\"card-body mt-3\">");
        out.println("<form method=\"get\" action=\"square2\" name=\"Calculate\">");
        out.println("Side length: <input type=\"number\" name=\"length\">");
        out.println("<input class=\"btn btn-primary mt-3\" type='submit' value='Calculate'>");
        out.println("</form>");

        double lenStr = Double.parseDouble(request.getParameter("length"));

        out.println("<hr>");
        out.println("<p>Perimeter = " + lenStr*4 + "</p>");
        out.println("<p>Area = " + lenStr*lenStr + "</p>");
        out.println("<hr>");

        out.println("<a class=\"btn btn-success\" href='index.html'>Home</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    processRequest(request, response);
    }
}



