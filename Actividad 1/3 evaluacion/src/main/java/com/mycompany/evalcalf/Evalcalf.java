/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evalcalf;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Evalcalf {

    public static void main(String[] args) {
    double calificacion;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion");
        calificacion = teclado.nextInt();
        if (calificacion >= 90 && calificacion <= 100) {
            System.out.println("Tu calificacion es A");
        }
        if (calificacion >= 80 && calificacion <= 89) {
            System.out.println("Tu calificacion es B");
        }
        if (calificacion >= 70 && calificacion <= 79) {
            System.out.println("Tu calificacion es C");
        }
        if (calificacion >= 60 && calificacion <= 69) {
            System.out.println("Tu calificacion D");
        }
        if(calificacion <= 60)
            System.out.println("Tu calificacion es F");
    
    }
}
