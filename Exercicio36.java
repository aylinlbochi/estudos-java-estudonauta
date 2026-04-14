/*  Faça um programa que receba o sálario atual de um funcionário, 
calcule e mostre o valor do aumento e o novo salário.

|Salário             |  Percentual de aumento|
|--------------------|----------------------:|
|Até R$300,00        |          15%      |
|R$300 -> R$600,00   |          10%      |
|R$600-> R$900,00    |          5%       |
|Acima de R$900,00   |          0%       |
*/
import java.util.Scanner;
public class Exercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario, aumento, novo_salario;
        System.out.print("Qual o valor do sálario do funcionário? R$ ");
        salario = sc.nextDouble();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        if(salario <= 300){
            aumento = salario * 0.15;
            novo_salario = salario + aumento;
            System.out.printf("O valor do aumento foi de R$ %.2f", aumento);
            System.out.printf("\nO valor do novo salário é de R$ %.2f", novo_salario);
        }else if(salario <= 600){
            aumento = salario * 0.10;
            novo_salario = salario + aumento;
            System.out.printf("O valor do aumento foi de R$ %.2f", aumento);
            System.out.printf("\nO valor do novo salário é de R$ %.2f", novo_salario);
        }else if(salario <= 900){
            aumento = salario * 0.05;
            novo_salario = salario + aumento;
            System.out.printf("O valor do aumento foi de R$ %.2f", aumento);
            System.out.printf("\nO valor do novo salário é de R$ %.2f", novo_salario);
        }else{
            System.out.println("Esse funcionário não tem direito a aumento");
        }
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        sc.close();
    }
}
