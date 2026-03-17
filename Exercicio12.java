/* Faça um programa que receba o valor do salário mínimo
e o valor do salário de um funcionário, calcule e mostre
a quantidade de salários mínimos que esse funcionário ganha.
*/

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double salario;
        double salario_funcionario;

        System.out.print("Qual o salário mínio atual? R$ ");
        salario = sc.nextDouble();

        System.out.print("Qual o salário do funcionário? R$ ");
        salario_funcionario = sc.nextDouble();

        double total_salario = salario_funcionario / salario;

        System.out.println("O funcionário recebe " + total_salario + " salários mínimos ");

        sc.close();
    }
}
