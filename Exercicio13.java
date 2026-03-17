/* Faça um programa que calcule e mostre a tabuada de um número
digitado pelo usuário.
*/

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("VAMOS CALCULAR A TABUADA :D\n");

        System.out.print("Digite um número: ");
        num = sc.nextInt();
        int zero = num * 0;
        int um = num * 1;
        int dois = num * 2;
        int tres = num * 3;
        int quatro = num * 4;
        int cinco = num * 5;
        int seis = num * 6;
        int sete = num * 7;
        int oito = num * 8;
        int nove = num * 9;
        int dez = num * 10;

        System.out.println("O resultado da sua tabuada é: \n" +
        zero + "\n" + um + "\n"+ dois + "\n" + tres + "\n" + 
    quatro + "\n"+ cinco + "\n"+ seis + "\n"+ sete + "\n"+ 
    oito + "\n" + nove + "\n" + dez + "\n");

    sc.close();
    }
}
