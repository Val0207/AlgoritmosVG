/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.monedas;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Monedas {

    public static void main(String[] args) {
     int opcion;
    double cantidadM, cantConv;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una cantidad en pesos mexicanos");
        cantidadM = teclado.nextInt();
        System.out.println("Menu de opciones a convertir: ");
        System.out.println("1. Dolar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dolar Australiuano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dolar Canadiense (CAD)");
        System.out.println("9. Bolivares (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.println("Escriba la opcion que necesite");
        opcion = teclado.nextInt();
        
        switch(opcion){
            case 1:
                cantConv = cantidadM * 0.050;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
            
            case 2:
                cantConv = cantidadM * 0.046;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
            
            case 3:
                cantConv = cantidadM * 1.70;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
            
            case 4:
                cantConv = cantidadM * 7.56;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
            
            case 5:
                cantConv = cantidadM * 69.31;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
            
            case 6:
                cantConv = cantidadM * 0.075;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
            
            case 7:
                cantConv = cantidadM * 0.19;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
            
            case 8:
                cantConv = cantidadM * 0.069;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
            
            case 9:
                cantConv = cantidadM * 2.21;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
            
            case 10:
                cantConv = cantidadM * 50.02;
                System.out.println("La conversion es de :");
                System.out.println(cantConv);
            break;
                
        }
    }
}
