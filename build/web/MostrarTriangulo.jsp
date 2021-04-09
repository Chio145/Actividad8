<%-- 
    Document   : MostrarTriangulo
    Created on : 8 abr 2021, 15:30:02
    Author     : arete
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Triangulo" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>RESULTADO:</h1>
        <%
            Triangulo tres= (Triangulo) request.getAttribute("hola");
             int resultadoA = tres.getResultadoA();
             int resultadoP = tres.getResultadoP();
            %>
            <p> ÁREA: <%=resultadoA%></p>
            <p> PERÍMETRO: <%=resultadoP%></p>
            
            <a href="calculo.jsp">
                <button type="button">Regresar</button>
                
            </a>
    </body>
</html>
