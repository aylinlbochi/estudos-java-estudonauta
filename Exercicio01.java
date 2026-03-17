/* Faça um programa que receba dois números, calcule e mostre a subtração
do primeiro número pelo segundo
*/
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        numero2 = sc.nextInt();

        int subtracao = numero1 - numero2 ;

        System.out.println("A subração de " + numero1 + " por " + 
        numero2 + " é " + subtracao);

        sc.close();
    }
}
