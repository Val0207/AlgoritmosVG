/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calccalif;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Calccalif {

    public static void main(String[] args) {
    double calParcial, calProyecto, calExamen, calFinal;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion del parcial");
        calParcial = teclado.nextInt();
        System.out.println("Ingresa tu calificacion del proyecto");
        calProyecto = teclado.nextInt();
        System.out.println("Ingresa tu calificacion del examen");
        calExamen = teclado.nextInt();
        
        calParcial = calParcial * 0.4;
        calProyecto = calProyecto * 0.3;
        calExamen = calExamen * 0.3;
        calFinal = calParcial + calProyecto + calExamen;
        System.out.println("Tu calificacion final es de: ");
        System.out.println(calFinal);
    }
}
