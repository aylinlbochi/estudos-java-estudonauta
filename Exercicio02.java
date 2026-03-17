/* Faça um programa que receba três números, calcule e mostre a 
multiplicação desses números.
*/
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int number1;
        int number2;
        int number3;

        System.out.print("Digite o primeiro número: ");
        number1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        number2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        number3 = sc.nextInt();

        int multiplic = number1 * number2 * number3;

        System.out.println("A multiplicação entre " + number1 +  ", " + number2 +
        ", " + number3 + " é " + multiplic);

        sc.close();


    }
}
