package Ejercicio01_POO;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Estudiantes> listEstudiantes = new ArrayList<>();
        // oobjetos
        Estudiantes estudiante1 = new Estudiantes("Juan", 18, 4.5);
        Estudiantes estudiante2 = new Estudiantes("Felipe", 14, 6.0);
        Estudiantes estudiante3 = new Estudiantes("Jairo", 17, 2.9);

        listEstudiantes.add(estudiante1);
        listEstudiantes.add(estudiante2);
        listEstudiantes.add(estudiante3);

        estudiante1.mostrarDetalles();
        estudiante1.esAprobado();
        estudiante2.mostrarDetalles();
        estudiante2.esAprobado();
        estudiante3.mostrarDetalles();
        estudiante3.esAprobado();
        
    }
}