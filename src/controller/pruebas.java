package controller;

import dao.CRUD;
import dao.DepartamentoDaoImpl;
import dao.GerenciaDaoImpl;
import model.Departamento;

import java.util.ArrayList;

public class pruebas {
    public static void main(String[] args) {
        CRUD gerencia = new GerenciaDaoImpl();

//       gerencia.listarTodos().forEach(x-> System.out.println(x.g));
gerencia.listarTodos();
int a = 2;
DepartamentoDaoImpl departamento =  new DepartamentoDaoImpl();

        ArrayList<Departamento> listDep = (ArrayList<Departamento>) departamento.listarPorId(a);
        for (Departamento d:listDep) {
            System.out.println(d.getDescripcion());

        }
    }
}
