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
public class Es_08 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Número 1: ");
        int n1 = NN.nextInt();
        System.out.print("Número 2: ");
        int n2 = NN.nextInt();
        System.out.print("Número 3: ");
        int n3 = NN.nextInt();
        System.out.print("Número 4: ");
        int n4 = NN.nextInt();

        int n5 = (n1 + n2 + n3 + n4) / 4;
        System.out.println("média: " + n5);
    }
}
