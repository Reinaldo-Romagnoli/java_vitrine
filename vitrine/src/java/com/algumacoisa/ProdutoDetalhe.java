package com.algumacoisa;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Produto;


public class ProdutoDetalhe extends HttpServlet {
    
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Produto</title>");            
            out.println("</head>");
            out.println("<body>");
            
            int id = Integer.parseInt(request.getParameter("id"));
            Produto p = Produto.dados.get(id);
            
            out.println("<h1>O Produto  " + p.getNome()+ "</h1>");
            out.println("<br>");
            out.println("<h1>O Preço é  " + p.getPreco()+ "</h1>");
            out.println("<br>");
            out.println("<h1>Descrição:  " + p.getDescricao()+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
