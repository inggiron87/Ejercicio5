package com.renato;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Profesor p=new Profesor();

        Estudiante e1=new Estudiante();
        e1.setNombre("Renato");
        e1.setEdad(28);
        e1.addAsignatura(new Asignatura("Fisica",91,5));
        e1.addAsignatura(new Asignatura("Calculo",90,5));
        e1.addAsignatura(new Asignatura("Algebra",87,5));
        e1.addAsignatura(new Asignatura("Base de datos",54,5));
        e1.addAsignatura(new Asignatura("Java",65,5));
        Estudiante e2=new Estudiante();
        e2.setNombre("Esteban");
        e2.setEdad(29);
        e2.addAsignatura(new Asignatura("Base de datos",100,5));
        e2.addAsignatura(new Asignatura("Fisica",77,5));
        e2.addAsignatura(new Asignatura("Java",84,5));
        e2.addAsignatura(new Asignatura("Calculo",100,5));
        e2.addAsignatura(new Asignatura("Algebra",99,5));
        Estudiante e3=new Estudiante();


        p.addEstudiante(e1);
        p.addEstudiante(e2);


        System.out.println(p.estudianteMejorPromedio().getNombre());

    }
}
