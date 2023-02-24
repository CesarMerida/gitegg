/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author chech
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int numero;
        for (int i = 0; i < 4; i++) {
            do {        
                System.out.print("ingresar un numero: ");
                numero = input.nextInt();
                
            } while ((numero<1)||(numero>20));
            System.out.print(numero+""); 
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
   
              
    }
    
}
