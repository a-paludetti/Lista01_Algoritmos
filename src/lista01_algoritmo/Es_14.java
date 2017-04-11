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
public class Es_14 {
    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        
        System.out.print("Número 1: ");
        double N1 = NN.nextDouble();
        System.out.print("Número 2: ");
        double N2 = NN.nextDouble();
        double N3 = 0;
        
        if (N1 > N2){
            N3 = N1/N2;
            System.out.println(N3);
        } else {
            N3 = N2/N1;
            System.out.println(N3);
        }
    }
   
}
