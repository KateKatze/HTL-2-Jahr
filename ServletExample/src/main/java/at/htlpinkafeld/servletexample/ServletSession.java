package at.htlpinkafeld.servletexample;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletSession extends HttpServlet {

    private int globalCtr = 0;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int sessCtr;

        this.globalCtr++;

        HttpSession sess = request.getSession();

        if( sess.getAttribute("sCtr") == null ){  //Servlet überprüft, ob das Attribut("sCtr" in der aktuellen Sitzung existiert; wenn Attribut nicht vorhanden - wird die Variable "sessCtr" of 0 gesetzt; andernfalls wird der Wert des Attributs "sCtr"! in die Variable "sessCtr" zugewiesen
            sessCtr = 0;
        } else {
            sessCtr = (Integer)sess.getAttribute("sCtr");
        }

        sessCtr++;                      //um 1 erhöht
        sess.setAttribute("sCtr", sessCtr);  //auf neuen Wert setzen

        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css\" integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
        out.println("<title>Session</title></head>");
        out.println("<body>");
        out.println("<div class=\"card shadow p-3 mt-3\" style=\"width: 25rem; margin: 0 auto;\">");
        out.println("<h3 class=\"card-header mt-3\">Number of accesses:</h3>");
        out.println("<div class=\"card-body mt-3\">");
        out.println("<p>Servlet: "+ this.globalCtr +"</p>");
        out.println("<p>Session: "+ sessCtr +"</p>");
        out.println("<a class=\"btn btn-success mt-3\" href=index.html>Home</a>");
        out.println("</div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        out.close();   //Printwriter schließen, um die Antwort abzuschließen
    }

    //Die Methoden "doGet" und "doPost" überschreiben die entsprechenden Methoden der Basisklasse und rufen die "processRequest"-Methode auf, um die Anfrage zu verarbeiten, unabhängig davon, ob es sich um eine GET- oder POST-Anforderung handelt.

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
