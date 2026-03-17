/* Faça um programa que calcule e mostre a área de um quadrado
Sabe-se que: A = lado * lado ou lado**2
*/
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double lado;

        System.out.println("Todos os lados de um quadrado são iguais.\n");
        
        System.out.print("Digite um dos lados do quadrado: ");
        lado = sc.nextDouble();

        double area = lado * lado;
        
        System.out.println("A área do quadrado é " + area);

        sc.close();

    }
}
