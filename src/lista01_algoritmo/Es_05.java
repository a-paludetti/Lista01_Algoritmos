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
public class Es_05 {
    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        
        System.out.print("Número 01: ");
        double n1 = NN.nextInt();

        double area = Math.pow(n1,2);
        
        System.out.println("área: "+area);
    }
}
