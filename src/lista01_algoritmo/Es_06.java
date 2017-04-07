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
public class Es_06 {

    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);

        System.out.print("Número 01: ");
        double A = NN.nextDouble();
        System.out.print("Número 02: ");
        double B = NN.nextDouble();
        System.out.print("Número 03: ");
        double C = NN.nextDouble();

        double n3;

        System.out.print("Escolha:\n"
                + "A -  a área do triângulo retângulo;\n"
                + "B -  a área do círculo;\n"
                + "C -  a área do trapézio;\n"
                + "D -  a área do quadrado;\n"
                + "E -  a área do retângulo;\n"
                + "F -  o perímetro do retângulo.");
        String escolha = NN.nextLine();

        switch (escolha) {
            case "A":
                n3 = (A * C) / 2;
                System.out.print("área do triangulo: " + n3);
                break;
            case "B":
                n3 = Math.PI * Math.pow(C, 2);
                System.out.printf("área do círculo: %.2f", n3);
                break;
            case "C":
                n3 = ((A + B) * C) / 2;
                System.out.printf("área do trapézio: %.2f", n3);
                break;
            case "D":
                n3 = Math.pow(B, 2);
                System.out.printf("área do quadrado: %.2f", n3);
                break;
            case "E":
                n3 = A * B;
                System.out.print("área do retangulo: " + n3);
                break;
            case "F":
                n3 = (A * 2) + (B * 2);
                System.out.print("perímetro do retangulo: " + n3);
                break;
        }

    }
}
