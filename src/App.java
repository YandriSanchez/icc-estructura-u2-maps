import controllers.*;

import dao.EmpleadoDAO;
import models.Empleado;
import controllers.Ejercicios;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoDAO empleadoDAOHashMap = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDAOHashMap);

        EmpleadoDAO empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTreeMap);

        Empleado emp1 = new Empleado(5,"Pedro","Dev");
        Empleado emp2 = new Empleado(3,"Juan","Dev");
        Empleado emp3 = new Empleado(1,"José","Dev");
        Empleado emp4 = new Empleado(2,"Pedro","Dev");
        Empleado emp5 = new Empleado(4,"Pedro","Dev");

        empleadoContoller.agregarEmpleado(emp1);
        empleadoContoller.agregarEmpleado(emp2);
        empleadoContoller.agregarEmpleado(emp3);
        empleadoContoller.agregarEmpleado(emp4);
        empleadoContoller.agregarEmpleado(emp5);

        empleadoContoller2.agregarEmpleado(emp1);
        empleadoContoller2.agregarEmpleado(emp2);
        empleadoContoller2.agregarEmpleado(emp3);
        empleadoContoller2.agregarEmpleado(emp4);
        empleadoContoller2.agregarEmpleado(emp5);

        empleadoContoller.listarEmpleados();
        System.out.println("--".repeat(20));
        empleadoContoller2.listarEmpleados();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        System.out.println("--".repeat(20));
        mapa.ejemploConLinkedHashMap();
        System.out.println("--".repeat(20));
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
        boolean resultado1 = Ejercicios.areAnagrams("listen", "silent");
        System.out.println("¿Las palabras'listen' y 'silent' son anagramas?: " + resultado1);

        boolean resultado2 = Ejercicios.areAnagrams("hello", "bello");
        System.out.println("¿Las palabras 'hello' y 'bello' son anagramas?: " + resultado2);

        Ejercicios ej = new Ejercicios();
        int[] nums = {9, 2, 3, 6};
        int[] indices = ej.sumatoriaDeDos(nums, 5);
        if (indices != null) {
            System.out.println("Índices con suma 5: [" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No se encontraron índices con suma 5");
        }

        System.out.print("Frecuencia de caracteres en 'hola': ");
        ej.contarCaracteres("hola");

        boolean resultado3 = ej.sonAnagramas("roma", "amor");
        System.out.println("¿Las palabras 'roma' y 'amor' son anagramas?: " + resultado3);
    }
}
