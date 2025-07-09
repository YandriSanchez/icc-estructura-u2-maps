package controllers;

import dao.EmpleadoDAO;
import models.Empleado;

import java.util.Map;
import java.util.TreeMap;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    Map<Empleado, Empleado> empleados;
    public EmpleadoDAOTreeMap() {
        empleados = new TreeMap<>();
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    }

    @Override
    public void list() {
        for(Map.Entry<Empleado, Empleado> entry : empleados.entrySet()){
            System.out.println("Clave: "+entry.getKey()+" | Valor: "+entry.getValue());
        }
    }


    @Override
    public void remove(int id) {
        Empleado temp = new Empleado(id);
        empleados.remove(temp);
    }
}
