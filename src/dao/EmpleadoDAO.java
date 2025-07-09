package dao;
import models.Empleado;

public interface EmpleadoDAO {
    void add(Empleado empleado);

    void list();

    void remove(int id);
}
