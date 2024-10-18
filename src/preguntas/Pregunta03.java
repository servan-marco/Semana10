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
public class Pregunta03 {

    public static void main(String[] args) {

        //DECLARAR VARIABLE
        int i;
        double compra, tc, pc, menor; //tc: total de compras ; pc: promedio de compras

        Scanner lectura = new Scanner(System.in);

        tc = 0;
        menor = 0;

        for (i = 1; i <= 12; i++) {
            System.out.print("compra" + i + ": ");
            compra = lectura.nextDouble();

            tc += compra;

            if (i == 1) {
                menor = compra;
            }

            if (menor > compra) {
                menor = compra;
            }
        }

        pc = tc / 12;

        //SALIDA DE DATOS
        System.out.println();
        System.out.println("totalcompras: " + tc);
        System.out.println("promediocompras: " + pc);
        System.out.println("menor: " + menor);

    }
}
