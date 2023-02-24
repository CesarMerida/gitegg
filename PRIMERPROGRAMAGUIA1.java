/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramaguia1;

import java.util.Scanner;

/**
 *
 * @author Tachi
 */
public class PRIMERPROGRAMAGUIA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String nombre = "Mariano";
        
        //boolean bandera = false;
        
        char a;
        int x = 48 ;
        
        double decimales = 3.55;
        short u;
        long w;
        float q;
        
        int num1 = 5;
        int num2 = 2;
        String nombre;
        
       Scanner leer = new Scanner(System.in);
        
        int suma = num1 + num2;
        double division = num1 / num2;
        boolean bandera = num2 < num1;
        num1++;
        num1++;
        //num1--;
        
        System.out.println("la suma de num1 y num2 es: " + suma);
        System.out.println(suma);
        System.out.println(division);
        System.out.println(num1);
         
        suma = num1 + num2;
        division = num1 / num2;
        bandera = num2 < num1;
        
        System.out.println("la suma de num1 y num2 es: " + suma);
        System.out.println(suma);
        System.out.println(division);
        System.out.println(num1);    
        
        System.out.print("Hola ");    
        System.out.println("Mundo ");    
        //System.out.println("");    
        
        System.out.println("Introduce tu nombre");
        nombre= leer.nextLine();
        System.out.println("Mi nombre es "+nombre);
        
        System.out.println("Introduce tu edad");
        int edad = leer.nextInt();
        System.out.println("Mi edad es "+ edad);
        
       
        
        
    }
    
}
