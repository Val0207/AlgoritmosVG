/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grados;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Grados {

    public static void main(String[] args) {
    int opcion;
    double grados, F, K;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa los grados en Celsius");
        grados = teclado.nextInt();
        System.out.println("Menu de opciones a convertir: ");
        System.out.println("1. Grados Fahrenheit");
        System.out.println("2. Grados Kelvin");
        System.out.println("Escriba la opcion que necesite");
        opcion = teclado.nextInt();
    
        switch (opcion){
        case 1: 
          F = (grados * 1.8) + 32;
            System.out.println("La conversion es: ");
            System.out.println(F);
          break;
        case 2: 
          K = grados + 273.15;
            System.out.println("La conversion es: ");
            System.out.println(K);
          break;
    }
    }
}
