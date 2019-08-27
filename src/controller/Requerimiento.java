package controller;

import dao.*;
import model.Departamento;
import model.Gerencia;
import model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "Requerimiento", urlPatterns = {"/Requerimiento"})
public class Requerimiento extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        int valorG = Integer.parseInt(request.getParameter("comboGerencia"));
        int valorD =  Integer.parseInt(request.getParameter("comboDepartamento"));
        int valorA =  Integer.parseInt(request.getParameter("comboAsigna"));
        int valorU =  Integer.parseInt(request.getParameter("comboUsuario"));



        String comentarios = request.getParameter("comentarios");
        int estado = 1;

        AsignarRequerimientoDaoImpl req = new AsignarRequerimientoDaoImpl();
        req.guardar(comentarios, estado, valorU, valorD, valorA, valorG);
        request.getRequestDispatcher("menuPrincipal.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("holaaa");
        String valorG = request.getParameter("comboGerencia");
        String valorD = request.getParameter("comboDepartamento");
        String valorA = request.getParameter("comboAsigna");
        String valorU = request.getParameter("comboUsuario");

        request.setAttribute("valorG", valorG);
        request.setAttribute("valorD",valorD);
        request.setAttribute("valorA",valorA);
        request.setAttribute("valorU",valorU);

        CRUD gerencia = new GerenciaDaoImpl();


        ArrayList<Gerencia> list = (ArrayList<Gerencia>) gerencia.listarTodos();
        request.setAttribute("listaGer", list);

        if(valorG!=null){

            DepartamentoDaoImpl departamento =  new DepartamentoDaoImpl();
            ArrayList<Departamento> listDep = (ArrayList<Departamento>) departamento.listarPorId(Integer.parseInt(valorG));
            request.setAttribute("listaDep", listDep);
        }
        CRUD departamento =  new DepartamentoDaoImpl();
        ArrayList<Departamento> listA = (ArrayList<Departamento>) departamento.listarTodos();
        request.setAttribute("listaAsi", listA);

        if (valorA!=null){
            UsuarioDaoImpl Usuario = new UsuarioDaoImpl();
            ArrayList<model.Usuario> listU = (ArrayList<Usuario>) Usuario.listarPorId(Integer.parseInt(valorA));
            request.setAttribute("listaUse", listU);
        }


        request.getRequestDispatcher("ingresarRequerimiento.jsp").forward(request, response);


    }
}
