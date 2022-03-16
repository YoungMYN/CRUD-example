<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRUD</title>
    <link rel="icon" type="image/png" sizes="32x32" href="../pictures/favicon-32x32.png">
    <link href="css/home.css" rel="stylesheet">
</head>
<body>
    <center>
        <h1>CRUD Demo</h1>
    </center>


<form class = "formm" action="addUser">
    <div class = "divform">
        CREATE/UPDATE <br><br>
    </div>
        <input  type="text" name="id" placeholder="User ID" autocomplete="off"><br>
        <input  type="text" name="name" placeholder="Username" autocomplete="off"><br>
        <input type="text" name="location" placeholder="Location" autocomplete="off"><br>
        <button type="submit">send</button><br>
</form>

<center>
    <form action="deleteUser">
        <div style = "color:#191970;">
            <br>DELETE <br>
        </div>
            <input  type="text" name="id" placeholder="Delete by ID" autocomplete="off"><br>
            <button type="submit">delete</button><br>
    </form>
</center>

<table width = "40%" border="6" bordercolor = " #d4efdf" bgcolor = "#e9f7ef" cellspacing = "1"
    style = "position: absolute;top: 100px;right: 20px;table-layout: fixed;">
    <tr>
        <th width = "10%">ID</th>
        <th width = "60%">Name</th>
        <th width = "30%">Location</th>
   </tr>
    <c:forEach var = "i" items="${users}">
        <tr>
            <td>${i.id}</td>
            <td>${i.name}</td>
            <td>${i.location}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>