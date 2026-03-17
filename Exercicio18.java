/* Faça um programa que receba uma temperatura em Celsius, calcule
e mostre essa temperatura em Fahrenheit. Sabe-se que F = 180 * (C + 32) / 100.
*/
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Celsius;

        System.out.print("Qual a temperatura em Celsius? ");
        Celsius = sc.nextDouble();

        double Fahrenheit = 1.8 * Celsius + 32;

        System.out.println("A temperatura de Celsius para Fahrenheit é de " + Fahrenheit);
        sc.close();
}
}