/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preguntas;

import java.util.Scanner;

/**
 *
 * @author servan Lozano
 */
public class Pregunta04 {

    public static void main(String[] args) {

        //DECLARAR VARIABLE
        int cantDatos, i, j;
        String nombre, mensaje;
        String[] aNombre;

        Scanner lectura = new Scanner(System.in);
        cantDatos = 5; //el problema indica que son 5 nombres de personas
        aNombre = new String[cantDatos];
        mensaje = "";

        //PROCESAMIENTO DE DATOS
        for (i = 0; i < cantDatos; i++) {
            System.out.print("Ingrese el nombre de la persona" + (i + 1) + ": ");
            nombre = lectura.next();
            aNombre[i] = nombre;
        }

        System.out.print("Ingrese el nombre de la persona a buscar: ");
        nombre = lectura.next();

        for (i = 0; i < cantDatos; i++) {
            if (aNombre[i].equalsIgnoreCase(nombre)) {
                mensaje = "Si existe " + nombre;
                break;
            } else {
                mensaje = "No existe " + nombre;
            }
        }
        //SALIDA DE DATOS
        System.out.println();
        System.out.println("Mensaje = " + mensaje);
    }
}
