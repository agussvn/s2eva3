package ej5;

import java.util.Random;
import java.util.Set;

public class main {
    public static void main(String[] args){

        String[] catalogoAsignaturas = {"Matemáticas", "Historia", "Programación", "Física", "Inglés"};
        Random random = new Random();

        Estudiante John = new Estudiante("John");
        Estudiante Wick = new Estudiante("Wick");

        for (String asig: catalogoAsignaturas){
            John.cursarAsignatura(asig,random.nextBoolean());
            Wick.cursarAsignatura(asig, random.nextBoolean());
        }

        John.mostrarEstudiante();
        Wick.mostrarEstudiante();

        System.out.println("\n Actualizando a Wick");
        Set<String> suspensasWick = Wick.getPendientes();

        if(!suspensasWick.isEmpty()){
            String asignaturaParaAprobar = suspensasWick.iterator().next();
            System.out.println("Aprobando: " +asignaturaParaAprobar);

            Wick.cursarAsignatura(asignaturaParaAprobar,true);

            System.out.println("Nuevas aprobadas de Wick: " + Wick.getAprobadas());
        } else {
            System.out.println("Wick no tiene asignaturas pendientes");
        }
    }
}
