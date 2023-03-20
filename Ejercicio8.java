/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          Scanner leer = new Scanner(System.in);
            System.out.println("ingrese un numero entre 0 y 10 ");
         int num = leer.nextInt();
        while (num > 10 || num < 0 ) {
            System.out.println("ingrese un numero entre 0 y 10 ");
         num = leer.nextInt();
        }
        System.out.println("bien es correcto, su numero es "+num+" y esta entre 0 y 10");
    }
    
}
           
       
        
    }
    
}
