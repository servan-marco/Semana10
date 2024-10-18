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
public class Pregunta02 {

    public static void main(String[] args) {
        //DECLARAR VARIABLE
        int i, vta1, vta2, vta3, tv, vMenor;
        String opc, vendedor, mVendedor;

        Scanner lectura = new Scanner(System.in);

        mVendedor = "";
        vMenor = 0;
        i = 0;

        do {
            System.out.print("Ingrese el nombre del vendedor: ");
            vendedor = lectura.next();

            System.out.print("Ingrese Vta 1: ");
            vta1 = lectura.nextInt();

            System.out.print("Ingrese Vta 2: ");
            vta2 = lectura.nextInt();

            System.out.print("Ingrese Vta 3: ");
            vta3 = lectura.nextInt();

            tv = vta1 + vta2 + vta3;

            if (i == 0) {
                vMenor = tv;
                mVendedor = vendedor;
                i++;
            }

            if (vMenor > tv) {
                vMenor = tv;
                mVendedor = vendedor;
            }
            System.out.print("¿Quieres continuar (si/no)?: ");
            opc = lectura.next();

        } while (opc.equalsIgnoreCase("SI"));

        System.out.println();
        System.out.println("Vendedor= " + mVendedor);
        System.out.println("total= " + vMenor);
    }
}
