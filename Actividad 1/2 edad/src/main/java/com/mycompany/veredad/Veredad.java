/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.veredad;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Veredad {

    public static void main(String[] args) {
    int edad;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        edad = teclado.nextInt();
        if (edad >= 18) {
            System.out.println("Eres elegible para votar");
        }
        
    }
}
