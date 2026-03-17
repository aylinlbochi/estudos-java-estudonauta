/* Um funcionário recebe um salário fixo mais 4% de comissão sobre vendas.
Faça um programa que receba o salário fixo do funcionário e o valor de 
suas vendas, calcule e mostre a comissão e seu salário final.
*/
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario;
        double vendas;

        System.out.print("Qual o sálario do funcionário? R$ ");
        salario = sc.nextDouble();

        System.out.print("Qual o valor das vendas? R$ ");
        vendas = sc.nextDouble();

        double comissao = vendas * 4 / 100;
        double novo_salario = comissao + salario;

        System.out.println("O valor da sua comissão é R$ "+ comissao);
        System.out.println("Seu salário + comissão é de R$ " + novo_salario);

        sc.close();


    }
}
