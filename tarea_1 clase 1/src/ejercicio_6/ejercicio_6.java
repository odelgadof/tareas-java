/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author Orvin
 */
public class ejercicio_6 {
     public static void main(String[] args) {
        int numFilas;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Introduzca numero de filas: ");
            numFilas = sc.nextInt();
        }
 
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
