package Ejercicio01_POO;

public class Estudiantes {
    public String nombre;
    public int edad;
    public double promedio;
    
    // CONTRUCTOR VACIO
    public Estudiantes(){

    }


    // PRIMER  CONTRUCTOR
    public Estudiantes(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // METODOS
    public void mostrarDetalles(){
        System.out.println("ESTUDIANTE:\nNombre:" +nombre+ "\nEdad:"+edad+"\nPromedio:"+promedio);
    }

    public void esAprobado(){
        if (promedio >= 3) {
            System.out.println("El estudiante: " +nombre+ " se encuentra APROBADO");
        } else {
            System.out.println("El estudiante: " +nombre+ " se encuentra DESAPROBADO");
        }
    }
}

