package at.htlpinkafeld.listofpersons;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/person")
public class PersonList extends HttpServlet {
    private List<Person> personList;

    @Override
    public void init() throws ServletException {
        super.init();
        personList = new ArrayList<>();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");

        Person person = new Person(id, name);
        personList.add(person);

        response.sendRedirect(request.getContextPath() + "/person");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        StringBuilder html = new StringBuilder();
        html.append("<html><head><title>Personenverwaltung</title></head><body>");
        html.append("<h2>Personenverwaltung</h2>");

        // Eingabeformular
        html.append("<form method=\"post\" action=\"person\">");
        html.append("ID: <input type=\"text\" name=\"id\"><br>");
        html.append("Name: <input type=\"text\" name=\"name\"><br>");
        html.append("<input type=\"submit\" value=\"Add\">");
        html.append("</form>");

        // Tabelle mit Personen
        html.append("<br>");
        html.append("<table>");
        html.append("<tr><th>ID</th><th>Name</th></tr>");
        for (Person person : personList) {
            html.append("<tr><td>").append(person.getId()).append("</td><td>").append(person.getName()).append("</td></tr>");
        }
        html.append("</table>");

        html.append("</body></html>");

        response.getWriter().write(html.toString());
    }
}
