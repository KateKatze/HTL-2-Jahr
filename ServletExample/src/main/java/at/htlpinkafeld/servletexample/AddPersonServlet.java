package at.htlpinkafeld.servletexample;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AddPersonServlet extends HttpServlet {
    public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
    HttpSession sess = request.getSession();
    PrintWriter out = response.getWriter();
    Object objPersonsList = sess.getAttribute("objPersonsList");
    ArrayList<Person> listOfPersons;

        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
        out.println("<title>Person List</title></head>");
        out.println("<body>");
        out.println("<div class=\"card shadow p-3 mt-3\" style=\"width: 25rem; margin: 0 auto;\">");
        out.println("<h3 class=\"card-header mt-3\">Add people</h3>");
        out.println("<div class=\"card-body mt-3\">");
        out.println("<form method=\"get\">");
        out.println("Name: <input type=\"text\" name=\"name\">");
        out.println("<br>");
        out.println("ID (num): <input class=\"mt-3\" type=\"number\" name=\"age\">");
        out.println("<br>");
        out.println("<input class=\"btn btn-primary mt-3\" type=\"submit\" name=\"add\" value=\"Add\">");
        out.println("<input class=\"btn btn-danger mt-3\" type=\"submit\" name=\"button\" value=\"Reset\">");
        out.println("</form>");

    try {
        listOfPersons = new ArrayList<>((ArrayList) objPersonsList);
    }catch (Exception e){
        listOfPersons = new ArrayList<>();
    }

    if(checkParam(request,"name") && checkParam(request, "age")) {
        listOfPersons.add(new Person(request.getParameter("name"), Integer.parseInt(request.getParameter("age"))));
    }

    String button = request.getParameter("button");
    if (button != null && button.equals("Reset")) listOfPersons.clear();

    if (!listOfPersons.isEmpty()){
        out.print("<hr>" + "<table class=\"table table-bordered table-striped\">" +
                "<tr>" +
                "   <th>Name</th>" +
                "   <th>ID</th>" +
                "</tr>");

        for (Person person: listOfPersons) {
            out.println("<tr>" +
                    person.toTable() +
                    "</tr>");
        }
        sess.setAttribute("objPersonsList", listOfPersons);
    }
    out.println("</table>" + "<hr>");
    out.println("<a class=\"btn btn-success\" href=\"index.html\">Home</a>");
    out.println("</div>");
    out.println("</div>");
    out.println("</body>" + "</html>");
    out.close();
}
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            processRequest(request, response);
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            processRequest(request, response);
        }

        private boolean checkParam(HttpServletRequest request, String string){
            return (request.getParameter(string) != null && !request.getParameter(string).isEmpty());
        }
}