/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author arete
 */
@WebServlet(name = "mostrarResultado", urlPatterns = {"/mostrarResultado"})
public class mostrarResultado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if (request.getAttribute("flag") != null){
                request.setAttribute("flag", 1);
                request.getRequestDispatcher("/calculo.jsp").forward(request, response);
            } else {
            String num1= request.getParameter("numero1");
            String num2= request.getParameter("numero2");
            model.Triangulo tri= new model.Triangulo();
            tri.AREA(num1, num2);
            tri.PERIMETRO(num1);
            Cookie ck;
            ck = new Cookie("AREA", tri.getResultadoA() + "");
            response.addCookie(ck);
            ck = new Cookie("PERIMETRO", tri.getResultadoP() + "");
            response.addCookie(ck);
            int resultadoA = tri.getResultadoA();
            int resultadoP = tri.getResultadoP();
            request.setAttribute("hola", tri);
            request.getRequestDispatcher("/MostrarTriangulo.jsp").forward(request, response);
            
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}