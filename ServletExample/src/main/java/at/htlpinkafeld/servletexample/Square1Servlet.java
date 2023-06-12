package at.htlpinkafeld.servletexample;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Square1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    double len, area, circum;

    String lenStr;
    lenStr = request.getParameter("length");
        PrintWriter out = response.getWriter();
    if(lenStr != null){
        len = Double.parseDouble(lenStr);
        area = len*len;
        circum = 4*len;
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
        out.println("<title>Square</title></head>");
        out.println("<body>");
        out.println("<div class=\"card shadow p-3 mt-3\" style=\"width: 25rem; margin: 0 auto;\">");
        out.println("<h3 class=\"card-header mt-3\">Square Calculation: Results</h3>");
        out.println("<div class=\"card-body mt-3\">");
        out.println("Area = "+area);
        out.println("<br>");
        out.println("Perimeter = "+circum);
        out.println("<br>");
        out.println("<div class=\"d-flex justify-content-around mt-3\">");
        out.println("<a class=\"btn btn-primary\" href='square.html'>Back</a><br>");
        out.println("<a class=\"btn btn-success\" href='index.html'>Home</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html");
    }
    out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
