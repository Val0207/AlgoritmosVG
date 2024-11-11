/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.info;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Info {

    public static void main(String[] args) {
    int opcion;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Conocer la Sinopsis de: ");
        System.out.println("1. COCO");
        System.out.println("2. Intensamente");
        System.out.println("3. Mulan");
        System.out.println("4. Moana");
        System.out.println("5. La princesa y el sapo");
        System.out.println("6. Luca");
        System.out.println("Elige una pelicula");
        opcion = teclado.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Migueal viaja a la magica tierra de sis antepasados");
                break;
                
            case 2:
                System.out.println("Las cinco emociones deben trabajar horas extras cuando una joven se muda a una nueva ciudad");
                break;
                
            case 3:
                System.out.println("Una joven oculta su identidad para tomar el lugar de su padre en el ejercito imperial");
                break;
                
            case 4:
                System.out.println("Moana y Maui se embarcan en un viaje a traves del oceano para salvar el mundo");
                break;
                
            case 5:
                System.out.println("Un fatidico beso a una rana envia a Tiana a una aventura mistica");
                break;
                
            case 6:
                System.out.println("Luca es un joven monstruo marino que pasara en verano inolvidable en la costa italiana");
                break;    
        
    }
}
}
