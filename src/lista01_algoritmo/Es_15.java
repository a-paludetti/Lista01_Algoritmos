/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01_algoritmo;

import java.util.Scanner;

/**
 *
 * @author aline.poliveira3
 */
public class Es_15 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        System.out.print("variavel A: ");
        double A = NN.nextDouble();
        System.out.print("variavel B: ");
        double B = NN.nextDouble();
        System.out.print("variavel C: ");
        double C = NN.nextDouble();

        double raiz1 = (-B + Math.sqrt((Math.pow(B, 2) - 4 * A * C))) / (2 * A);
        double raiz2 = (-B - Math.sqrt((Math.pow(B, 2) - 4 * A * C))) / (2 * A);

        if (raiz1 < 0 || raiz2 < 0) {
            System.out.println("Impossível calcular");
        } else {
            System.out.println("Raiz 1: " + raiz1
                    + "\nRaiz 2: " + raiz2);
        }
    }
}
