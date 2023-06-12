<%@ page import="at.htlpinkafeld.listofpersons.PersonList" %>
<%@ page import="at.htlpinkafeld.listofpersons.Person" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <title>List of Persons</title>
</head>
<body>
<div class="card shadow w-50 p-3 m-3">
    <div class="card-header">
        <h2>List of Persons</h2>
    </div>
    <div class="card-body">
        <form method="post">
            <div class="mb-3">
                <label for="id" class="form-label">ID: </label>
                <input type="number" class="form-control" id="id" placeholder="ID">
            </div>
            <div class="mb-3">
                <label for="name" class="form-label">Name: </label>
                <input type="text" id="name" class="form-control" placeholder="Full name">
            </div>
            <button class="btn btn-success mt-2" type="submit" onclick="addPerson()">Add</button>
        </form>
    </div>
</div>

<div class="card shadow w-50 p-3 m-3">
    <div class="card-header">
        <h3>Added Info</h3>
    </div>
    <div class="card-body">
        <table>
            <tr>
                <th>Name</th>
                <th>Age</th>
            </tr>
            <% for (Person person: personList ) { %>
            <tr>
                <td><%= person.getId() %></td>
                <td><%= person.getName() %></td>
            </tr>
            <% } %>
        </table>
        <script>
            function addPerson() {
                var id = document.getElementById("id").value;
                var name = document.getElementById("name").value;

                // Erstelle das Person-Objekt
                var person = {id: id, name: name};

                // Füge die Person der Tabelle hinzu
                var table = document.getElementById("personTable");
                var row = table.insertRow(table.rows.length);
                var cell1 = row.insertCell(0);
                var cell2 = row.insertCell(1);
                cell1.innerHTML = id;
                cell2.innerHTML = name;

                // Leere die Eingabefelder
                document.getElementById("id").value = "";
                document.getElementById("name").value = "";
            }
        </script>
    </div>
</div>
</body>
</html>