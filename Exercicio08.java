/* Faça um programa que receba o peso de uma pessoa, em quilos,
calcule e mostre esse peso em gramas.
*/
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso;

        System.out.print("Digite seu peso em Kg ");
        peso = sc.nextDouble();

        double novo_peso = peso * 1000;

        System.out.println("Seu peso em gramas é " + novo_peso + " g");
        
        sc.close();
    }
}
