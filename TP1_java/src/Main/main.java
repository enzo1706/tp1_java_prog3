package Main;


import Entidades.Estudiante;
import Entidades.Persona;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        // Creamos los estudiantes y los metemos en el array
        estudiantes.add(new Estudiante("Julian ", 19, "Programacion "));
        estudiantes.add(new Estudiante("Roberto ", 27, "Ingenieria Quimica "));
        estudiantes.add(new Estudiante("Julieta ", 22, "Hotelería y Turismo "));


        // Mostramos la lista de estudiantes por pantalla
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }

    }
}
