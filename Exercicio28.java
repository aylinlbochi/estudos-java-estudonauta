/* Faça um programa que receba dois números e mostre o menor.
*/
import java.util.Scanner;
public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number_1, number_2;

        System.out.print("Digite um número: ");
        number_1 = sc.nextInt();
        System.out.print("Digite um outro número: ");
        number_2 = sc.nextInt();
        System.out.println("------------RESULTADO-----------");
        if(number_1 < number_2){
            System.out.println("O número "+ number_1 + " é menor.");
        }
        else {
            System.out.println("O número "+ number_2 + " é menor.");
        }
        sc.close();
    }
}
