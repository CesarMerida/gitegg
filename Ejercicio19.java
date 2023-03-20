/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7_ex6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        System.out.println("La Matriz 1 es: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                int numero = (int) (Math.random() * 100);
                matriz[i][j] = numero;
                System.out.print(matriz[i][j] + " ");
            }
        }
        int[][] matriz2 = new int[4][4];
        System.out.println("La Matriz 1 es: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 4; j++) {
                matriz2[i][j] = matriz[j][i];
                System.out.print(matriz2[i][j] + " ");

            }

        }
    }
}
