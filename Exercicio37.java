/*Faça um programa que receba o salário bruto de um funcionário,
calcule e mostre o valor a receber. Sabe-se que este é composto
pelo salário bruto acrescido de gratificação e descontando
o imposto de 7% sobre o salário.

|Salário                |Gratificação |
|-----------------------|------------:|
|Até R$ 350,00          |   R$ 100,00 |
|R$ 350,00 -> R$ 600,00 |   R$ 75,00  |
|R$ 600,00 -> R$ 900,00 |   R$ 50,00  |
|Acima de R$ 900,00     |   R$ 35,00  |
 */
import java.util.Scanner;
public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario, imposto, novo_salario;
        System.out.print("Informe o valor do salário bruto do funcionário: R$ ");
        salario = sc.nextDouble();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        imposto = salario * 0.07;
        if(salario <= 350){
            novo_salario = (salario - imposto) + 100;
        }else if (salario <= 600){
            novo_salario = (salario - imposto) + 75;
            
        }else if(salario <= 900){
            novo_salario = (salario - imposto) + 50;
        }else{
            novo_salario = (salario - imposto) + 35;
        }
        System.out.printf("\nO funcionário irá receber R$ %.2f", novo_salario);
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        sc.close();
    }
}
