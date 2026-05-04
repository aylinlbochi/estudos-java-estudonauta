/*Faça um programa que receba um número, calcule e mostre a 
tabuada desse número.
Autora: Aylin
Empresa: 
 */
import java.util.Scanner;
public class Exercicio52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("   CALCULADORA DE TABUADA");
        System.out.println("----------------------------------");
        
        int number ;
        System.out.print("Digite um número para ver a sua tabuada: ");
        number = sc.nextInt();

        for(int cont = 1; cont <= 10; cont++){
            
            System.out.println(number + " X " + cont + " = " + (number * cont));
        }
        sc.close();
    }
}
