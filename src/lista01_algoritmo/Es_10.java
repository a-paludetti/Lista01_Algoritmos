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
public class Es_10 {
    public static void main(String[] args) {
        Scanner NN = new Scanner(System.in);
        
        System.out.print("Nome do funcionario: ");
        String nome = NN.nextLine();
        System.out.print("Quantidade de horas trabalhadas: ");
        double horas = Double.parseDouble(NN.nextLine());
        System.out.print("Valor da hora: ");
        double valorHora = Double.parseDouble(NN.nextLine());

        double valorSalario = horas * valorHora;

        System.out.printf("O funcionario %S trabalhou %.0f horas por R$%.2f a hora e deve receber R$%.2f ", nome, horas, valorHora, valorSalario);
        System.out.println("");
    }
}
