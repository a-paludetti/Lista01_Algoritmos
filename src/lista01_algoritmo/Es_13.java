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
public class Es_13 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Número 1: ");
        int N1 = NN.nextInt();
        System.out.print("Número 2: ");
        int N2 = NN.nextInt();
        System.out.print("Número 3: ");
        int N3 = NN.nextInt();

        if (N1 < N2 && N2 < N3) {
            System.out.println("número " + N3);
        } else if (N2 < N3 && N3 < N1) {
            System.out.println("número " + N1);
        } else {
            System.out.println("número " + N2);
        }

    }
}
