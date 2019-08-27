package controller;


import model.Login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Inicio",urlPatterns = {"/Inicio"})
public class Inicio extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String user  = request.getParameter("nombreUsuario");
        String pass = request.getParameter("password");

        Login lo = new Login();

        if (lo.autentificacion(user,pass)){
            HttpSession sesionOk = request.getSession();
            sesionOk.setAttribute("email", user);
            // redireccion al home.jsp
            request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);
        }else {

            // en caso de usuario y contraseña invalido
            String error = "usuario o contraseña incorrecta";
            request.setAttribute("error", error);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
