/* Faça um programa que receba o raio, calcule e mostre:
A) O comprimimento de uma esfera; sabe-se que C = 2 * π R; 
B) A área de uma esfera; sabe-se que A = π R²;
C) O volume de uma esfera; sabe-se que V = ¾ * π R³
*/
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio;

        System.out.print("Qual o raio da esfera? ");
        raio = sc.nextDouble();

        double c = 2 * Math.PI*raio;
        double a = Math.PI * Math.pow(raio, 2);
        double v = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.println("O comprimimento da esfera é " + c);
        System.out.println("A área da esfera é " + a);
        System.out.println("O volume da esfera " + v);

        sc.close();
    }
}
