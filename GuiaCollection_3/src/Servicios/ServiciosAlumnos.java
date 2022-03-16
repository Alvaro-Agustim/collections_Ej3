/*
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.
 */
package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class ServiciosAlumnos {
    
    String respuesta;
    
    Scanner leer = new Scanner(System.in);
    
    public Alumno altaAlumno() {
        Alumno a1 = new Alumno();
        System.out.println("Ingrese el nombre del alumno");
        a1.setNombre(leer.next());
        System.out.println("Ingrese las tres notas");
        ArrayList<Integer> notas = new ArrayList();
        for (int i = 0; i < 3; i++) {
            notas.add(leer.nextInt());
        }
        a1.setNotas(notas);
        return a1;
    }
    
    public ArrayList<Alumno> llenarListaAlumnos() {
        
        ArrayList<Alumno> alumnos = new ArrayList();
        alumnos.add(altaAlumno());
        System.out.println("Desea agregar otro alumno?");
        while (true) {
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("No") || respuesta.equalsIgnoreCase("n")) {
                break;
            } else if (respuesta.equalsIgnoreCase("Si") || respuesta.equalsIgnoreCase("s")) {
                alumnos.add(altaAlumno());
            } else {
                System.out.println("Debe ingresar si o no");
            }
            
        }
        return alumnos;
    }
    
    public void enLista(ArrayList<Alumno> alumnos) {
        System.out.println("¿De que alumno desea calcular la nota final?");
        respuesta = leer.next();
        for (Alumno nombre : alumnos) {
            if (nombre.getNombre().equalsIgnoreCase(respuesta)) {
                System.out.println("Su nota final es: " + notaFinal(nombre.getNotas()));
            } else {
                System.out.println("El alumno no existe en la lista");
            }
        }
        
    }
    
    public double notaFinal(ArrayList<Integer> notas) {
        double total = 0;
        for (int nota : notas) {
            total += nota;
        }
        total /= 3;
        return total;
    }
}
