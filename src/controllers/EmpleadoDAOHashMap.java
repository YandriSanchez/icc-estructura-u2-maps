package controllers;
import java.util.HashMap;
import java.util.Map;

import dao.EmpleadoDAO;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    Map<Empleado, Empleado> empleados;
    public EmpleadoDAOHashMap() {
        empleados = new HashMap<>();
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
