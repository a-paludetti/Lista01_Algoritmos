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
public class Es_11 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.println("digite um número.");
        double n1 = NN.nextDouble();

        if (n1 < 0) {
            System.out.printf("%.2f é um número negativo", n1);
        } else {
            System.out.printf("%.2 é um número positivo", n1);
        }
    }
}
