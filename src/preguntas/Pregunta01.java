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
public class Pregunta01 {

    public static void main(String[] args) {
        //DECLARAR VARIABLE
        int cantidad, digito, dmy;

        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese la cantidad: ");
        cantidad = lectura.nextInt();

        dmy = 0;
        while (cantidad != 0) {
            cantidad = cantidad / 10;
            digito = cantidad % 10;

            if (dmy < digito) {
                dmy = digito;
            }
        }

        System.out.println("");
        System.out.println("dmy= " + dmy);
    }

}
