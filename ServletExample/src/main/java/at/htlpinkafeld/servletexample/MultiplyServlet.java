package at.htlpinkafeld.servletexample;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiplyServlet extends HttpServlet {

    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // liest den aktuellen Produktwert aus der Sitzung
        HttpSession session = request.getSession();
        Integer product = (Integer) session.getAttribute("product");
        if (product == null) {
            product = 1;
        }

        // Lese den aktuellen Faktorwert aus der Anfrage
        String factorString = request.getParameter("factor");
        int factor = 1;
        if (factorString != null && !factorString.isEmpty()) {
            factor = Integer.parseInt(factorString);
        }

        // Überprüfe, welcher Button gedrückt wurde
        String button = request.getParameter("button");
        if (button != null && button.equals("Multiply")) {
           product *= factor;                                    // Multipliziere das Produkt mit dem Faktor
        } else if (button != null && button.equals("Reset")) {
           product = 1;                                          // Setze das Produkt auf 1 zurück
        }

        // Speichere das aktualisierte Produkt in der Sitzung
        session.setAttribute("product", product);

        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
        out.println("<title>Multiplier</title></head>");
        out.println("<body>");
        out.println("<div class=\"card shadow p-3 mt-3\" style=\"width: 25rem; margin: 0 auto;\">");
        out.println("<h3 class=\"card-header mt-3\">Simple Multiplier</h3>");
        out.println("<div class=\"card-body mt-3\">");
        out.println("<form method='get'>");
        out.println("Factor: <input type='text' name='factor' value='" + factor + "'>");
        out.println("<div class=\"d-flex justify-content-between mt-3\">");
        out.println("<input class=\"btn btn-primary mt-3\" type='submit' name='button' value='Multiply'>");
        out.println("<input class=\"btn btn-danger mt-3\" type='submit' name='button' value='Reset'>");
        out.println("</div>");
        out.println("</form>");
        out.println("<p class=\"mt-4 mb-3\">Product: " + product + "</p>");
        out.println("<a class=\"btn btn-success mt-3\" href=index.html>Home</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
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
}

