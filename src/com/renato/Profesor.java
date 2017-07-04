package com.renato;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by IT DASA on 04/07/2017.
 */
public class Profesor {
    private String nombre;
    private String especialidad;
    private List<Estudiante> estudiantes;

    public Profesor() {
        estudiantes=new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(Estudiante e){

        estudiantes.add(e);
    }

    public Estudiante estudianteMejorPromedio(){

        float promedio=0;
        Estudiante estudiante= new Estudiante();

        for (Estudiante e:estudiantes
                ) {
            if(promedio<e.promedioNotas()){
                promedio=e.promedioNotas();
                estudiante=e;
            }
        }
        return estudiante;
    }
}
