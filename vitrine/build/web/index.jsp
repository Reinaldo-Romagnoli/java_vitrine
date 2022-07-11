<%-- 
    Document   : index
    Created on : 10/07/2022, 11:35:16
    Author     : Aluno
--%>

<%@page import="modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ofertas!!!</h1>
        
        <% for(Produto p: Produto.dados){  %>
         
        <div class="col-3">
            <div class="box">
                <%=p.getNome()%>
                <div>
                    Descrição:
                </div><%=p.getDescricao()%><br>
                <div>
                    Preço:
                </div><%=p.getPreco()%><br>
                <a href="Produto?id=<%=p.getId()%>">Detalhes</a>
            </div>
        </div>    
        <%} %>
        
    </body>
    <style>
        
        .box {
            width: 210px;
            border: 5px solid;
            padding: 30px;
            margin: 10px;
            font-size: 20px;
        }
        
    </style>
</html>