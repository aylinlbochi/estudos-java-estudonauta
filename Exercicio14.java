/* Faça um programa que receba o ano de nascimento de uma pessoa
e o ano atual, calcule e mostre:
A) A idade dessa pessoa em anos;
B A idade dessa pessoa em meses;
C) A idade dessa pessoa em dias;
D) A idade dessa pessoa em semanas.
*/

import java.util.Scanner;
import java.time.LocalDate;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ano_nascimento;
        
        System.out.print("Em que ano você nasceu? ");
        ano_nascimento = sc.nextInt();

        int ano_atual = LocalDate.now().getYear();

        int idade = ano_atual - ano_nascimento;
        int idade_meses = (ano_atual - ano_nascimento) * 12;
        int idade_dias = (ano_atual - ano_nascimento) * 365;
        int idade_semanas = (ano_atual - ano_nascimento) * 52;

        System.out.println("Sua idade em anos é " + idade);
        System.out.println("Sua idade em meses é " + idade_meses);
        System.out.println("Sua idade em dias é " + idade_dias);
        System.out.println("Sua idade em semanas é " + idade_semanas);
        sc.close();
    }
}
