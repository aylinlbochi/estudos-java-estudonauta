/* Faça um programa que receba três números e mostre o maior.
*/
import java.util.Scanner;
public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nu_1, nu_2, nu_3;

        System.out.print("Digite o primeiro número: ");
        nu_1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        nu_2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        nu_3 = sc.nextInt();

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-==-=-=");

        if(nu_1 == nu_2 && nu_2 == nu_3){
            System.out.println("Não existe maior, os números são iguais.");
        }
        else if (nu_1>= nu_2 && nu_1 >= nu_3 ){
            System.out.println("O maior é " + nu_1);
        }
        else if (nu_2 >= nu_1 && nu_2 >= nu_3){
            System.out.println("O maior é " + nu_2);
        }
        else{
            System.out.println("O maior é "+ nu_3);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-==-=-=");
    sc.close();
    } 
}
