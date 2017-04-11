/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista01_algoritmo;

import java.util.Scanner;

/**
 *
 * @author Wynter
 */
public class Es_07 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Lado 1: ");
        double n1 = NN.nextDouble();
        System.out.print("Lado 2: ");
        double n2 = NN.nextDouble();

        double n3 = Math.sqrt(Math.pow(n1, 2) + Math.pow(n2, 2));
        System.out.printf("Hipotenusa %.2f", n3);
        System.out.println("");
    }
}
