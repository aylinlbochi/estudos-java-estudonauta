/* Faça um programa que receba o peso de uma pessoa, calcule e mostre:
a) O novo peso, se a pessoa engordar 15% sobre o peso digitado;
b) O novo peso, se a pessoa emagrecer 20% sobre o peso digitado;
*/
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;
        
        System.out.print("Qual é o seu peso? ");
        peso = sc.nextDouble();

        double engordar = peso * 15 / 100;
        double novo_peso = peso + engordar;
        double emagrecer = peso * 20 / 100;
        double novo = peso - emagrecer;
        
        System.out.println("Seu novo peso se você engordar 15% " + novo_peso);
        System.out.println("Seu novo peso se você emagrecer 20% " + novo);
        sc.close();
    }
}
