/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calpdesc;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Calpdesc {

    public static void main(String[] args) {
    double precio, descuento10, descuento20, descuento25,  precioDes;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el precio ");
        precio = teclado.nextInt();
        if (precio <= 100) {
            System.out.println("no hay descuento");
        }
        if (precio > 100 && precio <= 200 ) {
            descuento10 = precio * 0.1;
            precioDes = precio - descuento10;
            System.out.println("Precio con el descuento del 10% es de: ");
            System.out.println(precioDes);
        }
        if (precio > 200 && precio <= 500) {
            descuento20 = precio * 0.2;
            precioDes = precio - descuento20;
            System.out.println("Precio con el  20% de descuento es de:");
            System.out.println(precioDes);
        }
        if (precio > 500) {
            descuento25 = precio * 0.25;
            precioDes = precio - descuento25;
            System.out.println("Precio con el 25% de descuento es de: ");
            System.out.println(precioDes);
        }
    }
}
