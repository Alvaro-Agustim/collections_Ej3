/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiacollection_3;

import Servicios.ServiciosAlumnos;

/**
 *
 * @author alvaro
 */
public class GuiaCollection_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosAlumnos sa = new ServiciosAlumnos();
        sa.enLista(sa.llenarListaAlumnos());
    }

}
