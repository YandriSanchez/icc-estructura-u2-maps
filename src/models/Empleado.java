package models;

import java.util.Objects;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }
    public Empleado(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return id == empleado.id;
        //&& Objects.equals(name, empleado.name) && Objects.equals(position, empleado.position)
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
        //return Objects.hash(id, name, position);
    }

    @Override
    public int compareTo(Empleado o) {
        int resp = Integer.compare(id, o.id);
        //if (resp != 0) resp = name.compareTo(o.name);
        return resp;
    }
}