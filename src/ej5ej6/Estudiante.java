package ej5;

import java.util.HashSet;
import java.util.Set;

public class Estudiante {
    private String nombre;
    private Set<String> aprobadas;
    private Set<String> pendientes;

    public Estudiante(String nombre){
        this.nombre=nombre;
        this.aprobadas= new HashSet<>();
        this.pendientes= new HashSet<>();
    }

    public void cursarAsignatura(String asignatura,boolean aprobada){
        if(aprobadas.contains(asignatura)){
            System.out.println("Ya has cursado esta asignatura " + asignatura);
            return;
        }

        if(aprobada){
            aprobadas.add(asignatura);
            pendientes.remove(asignatura);
        } else {
            pendientes.add(asignatura);
        }
    }

    public void mostrarEstudiante(){
        System.out.println("Estudiante: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Aprobadas: " + aprobadas);
        System.out.println("Pendientes: " + pendientes);
    }

    public Set<String> getAprobadas(){
        return aprobadas;
    }
    public Set<String> getPendientes(){
        return pendientes;
    }
    public Set<String> getTodas(){
        Set<String> todas = new HashSet<>(aprobadas);
        todas.addAll(pendientes);
        return todas;
    }

}
