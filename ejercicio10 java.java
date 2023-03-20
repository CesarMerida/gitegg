
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.

        Scanner leer = new Scanner(System.in);
        int num = -100;
        int suma = 0;
        int num1;

                do {
                  System.out.println("Ingrese un valor positivo");
                 num = leer.nextInt();  
                    do {
                        System.out.println("Ingrese otro numero positivo para sumar");
                        num1 = leer.nextInt();
                        suma = suma + num1;
                        System.out.println("la suma es: " + suma);
                        
                    } while (suma< num);
                    System.out.println("El resultado es: " + suma);

                } while (num<=0);
        


        
        

    }
    
}
