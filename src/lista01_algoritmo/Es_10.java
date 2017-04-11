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
        System.out.print("Salario: ");
        double salario = Double.parseDouble(NN.nextLine());
        System.out.print("Vendas em R$: ");
        double vendas = Double.parseDouble(NN.nextLine());

        double vendasSalario = vendas + (vendas*.015);

        System.out.printf("O funcionario %S deve receber R$%.2f ", nome, vendasSalario);
        System.out.println("");
    }
}
