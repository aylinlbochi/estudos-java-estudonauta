/* Faça um programa que receba o valor dos catetos de um 
triângulo, calcule e mostre o valor da hipotenusa.
*/
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double cateto1;
        double cateto2;
        
        System.out.print("Qual o valor do cateto a? ");
        cateto1 = sc.nextDouble();

        System.out.print("Qual o valor do cateto b? ");
        cateto2 = sc.nextDouble();

        double hipo = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("O valor da hipotenusa é " + hipo);
        sc.close();
    }
}
