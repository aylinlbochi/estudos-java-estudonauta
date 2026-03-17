/* Faça um programa que receba dois números, calcule e mostre a divisão
do primeiro número pelo segundo. Sabe-se que o segundo número não pode ser zero,
portanto não é necessário se preocupar com validações.
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1;
        double number2;

        System.out.println("Vamos dividir!! O segundo número não pode ser zero\n");

        System.out.print("Digite o primeiro número: ");
        number1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        number2 = sc.nextDouble();
        
        double divisao = number1 / number2;

        System.out.println("A divisão entre " + number1 + " e " + number2 + " é " + divisao);
        sc.close();
    }
}
