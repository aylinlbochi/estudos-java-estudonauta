/* Faça um programa que receba uma hora (uma variável para hora e outra para minutos),
calcule e mostre:
a) a hora digitada convertida em minutos;
b) o total dos minutos, ou seja, os minutos digitados mais a conversão anterior;
c) o total de minutos convertidos em segundos.
*/
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double hora;
        double minuto;

        System.out.print("Me informe a hora: ");
        hora = sc.nextDouble();

        System.out.print("Me informe os minutos: ");
        minuto = sc.nextDouble();

        double a_minutos = hora * 60;
        double b_total_minutos =  a_minutos + minuto;
        double c_segundos = b_total_minutos * 60;

        System.out.println("A hora digitada convertida em minutos é " + a_minutos);
        System.out.println("O total dos minutos é " + b_total_minutos);
        System.out.println("O total de minutos convertidos em segundos é " + c_segundos);
        sc.close();
    
    }
}