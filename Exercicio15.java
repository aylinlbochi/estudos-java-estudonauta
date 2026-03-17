/* João recebeu seu salário e precisa pagar duas contas
atrasadas. Em razão do atraso, ele deverá pagar multa
de 2% sobre cada conta. Faça um programa que calcule
e mostre quanto restará do salário do João.
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;
        double conta_1;
        double conta_2;
        
        System.out.print("Qual é o salário do João? R$ ");
        salario = sc.nextDouble();

        System.out.print("Qual o valor da primeira conta? R$ ");
        conta_1 = sc.nextDouble();

        System.out.print("Qual o valor da segunda conta? R$ ");
        conta_2 = sc.nextDouble();

        double contas1 = conta_1 * 0.02;
        double contas2 = conta_2 * 0.02;
        
        double juros = conta_1 + contas1;
        double juros2 = conta_2 + contas2;
        
        double total_contas = juros + juros2;

        double resto_salario = salario - total_contas; 
        
        System.out.println("O total das contas de João mais o valor da multa por atraso é R$ " + total_contas);
        System.out.println("Vai sobrar para o João o valor de R$ "+ resto_salario);
        sc.close();

    }
}
