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
public class Es_12 {
    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        
        System.out.print("Digite o Lado do Quadrado: ");
        double L = NN.nextDouble();
        System.out.print("Digite o Raio do circulo: ");
        double R = NN.nextDouble();
        
        double areaL = Math.pow(L, 2);
        double areaR = Math.PI * Math.pow(R,2);
        
        if (areaL<areaR){
            System.out.println("Círculo");
        } else {
            System.out.println("Quadrado");
        }
    }
}
