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
public class Es_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner NN = new Scanner(System.in);
        
        System.out.print("Número 01: ");
        int n1 = NN.nextInt();
        System.out.print("Número 02: ");
        int n2 = NN.nextInt();
        
        int n3 = n1*n2;
        
        System.out.println(n3);
    }
    
}
