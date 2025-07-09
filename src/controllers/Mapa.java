package controllers;

import models.Empleado;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapa {
    public Mapa() {
    }
    public void ejemploConHashMap(){
        Map<String,String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Peru","Lima");
        capitales.put("Colombia","Bogota");
        System.out.println("Capitales: "+ capitales.keySet());

        for(String pais : capitales.keySet()){
            System.out.println("La capital de "+pais+" es: "+capitales.get(pais));
        }
        String capital = capitales.get("Ecuador");
        System.out.println("La capital de - Ecuador - es: "+capital);

        System.out.println("**".repeat(20));

        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3,new Empleado(3,"Pedro","Tester"));
        empleados.put(1, new Empleado(1,"Ana","Dev"));
        empleados.put(2, new Empleado(2,"Luis","Diseñador"));
        empleados.put(1,new Empleado(3,"Pedro","Tester"));

        for(Map.Entry<Integer, Empleado> entry : empleados.entrySet()){
            System.out.println("Clave: "+entry.getKey()+", Valor: "+entry.getValue());
        }

        System.out.println("**".repeat(20));

        Map<Empleado,Integer> empleadosDos = new HashMap<>();
        empleadosDos.put(new Empleado(1,"Pedro","Tester"),1000);
        empleadosDos.put(new Empleado(2,"Ana","Dev"),1200);
        empleadosDos.put(new Empleado(3,"Ana","Dev"),1500);
        empleadosDos.put(new Empleado(3,"Ana","Dev"),1500);

        for(Map.Entry<Empleado,Integer> entry : empleadosDos.entrySet()){
            System.out.println(entry.getKey()+", => "+entry.getValue());
        }
    }
    public void ejemploConLinkedHashMap(){
        Map<String,Integer> productos = new LinkedHashMap<>();
        productos.put("Manzana", 1);
        productos.put("Pera", 2);
        productos.put("Coco", 3);
        productos.put("Banana", 4);
        productos.put("Fresa", 5);

        for(String producto : productos.keySet()){
            System.out.println("La cantidad de "+producto+" es: "+productos.get(producto));
        }
    }
    public void ejemploConTreeMap(){
        Map<Integer,String> persona = new TreeMap<>();
        persona.put(1,"Juan");
        persona.put(2,"Pedro");
        persona.put(3,"Ana");
        persona.put(4,"Luis");
        persona.put(5,"Maria");

        for(Integer key : persona.keySet()){
            System.out.println("La la persona con id "+key+" es: "+persona.get(key));
        }
        System.out.println("**".repeat(20));

        Map<Empleado,Integer> empleadosDos = new TreeMap<>();
        empleadosDos.put(new Empleado(1,"Pedro","Tester"),1000);
        empleadosDos.put(new Empleado(2,"Ana","Dev"),1200);
        empleadosDos.put(new Empleado(3,"Ana","Dev"),1500);
        empleadosDos.put(new Empleado(3,"Ana","Dev"),1500);

        for(Map.Entry<Empleado,Integer> entry : empleadosDos.entrySet()){
            System.out.println(entry.getKey()+", => "+entry.getValue());
        }
    }
}
