package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoContoller {
    private EmpleadoDAO empleadoDAO;
    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }
    public void agregarEmpleado(Empleado empleado) {
        empleadoDAO.add(empleado);
    }
    public void eliminarEmpleado(int id) {
        empleadoDAO.remove(id);
    }
    public void listarEmpleados() {
        empleadoDAO.list();
    }
}