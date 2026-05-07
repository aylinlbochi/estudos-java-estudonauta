/*  Ex:034 - Faça um programa que leia 5 números
	e mostre, no final de tudo, quantos números pares 
	e ímpares foram digitados. Mostre também a média de 
	todos os valores pares e a média dos ímpares.
	Autora: Aylin
	Empresa: Estudonauta
*/
import java.util.Scanner;
public class Exercicio54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double number = 0.0, mediaPares = 0.0, mediaImpares = 0.0; 
        int par = 0, impar = 0, somaPares = 0, somaImpares = 0;

        for(int cont = 1; cont <= 5; cont++){
            System.out.print("Digite o " + cont + "º valor: ");
            number = sc.nextDouble();
            if(number % 2 == 0){
                par++;
                somaPares += number;
            }
            else{
                impar++;
                somaImpares += number;
            }
        }
        System.out.println("-------------------------------------------------");
        if(par > 0){
            mediaPares = (double) somaPares / par;
            System.out.printf("Você digitou %d números pares. A média é %.2f", par, mediaPares);
        }
        else{
            System.out.println("\nVocê não digitou nenhum número par.");
        }
        if(impar > 0){
            mediaImpares = (double) somaImpares/ impar;
        System.out.printf("\nVocê digitou %d números ímpares. A média é %.2f", impar, mediaImpares);
        }
        else{
            System.out.println("\nVocê não digitou nenhum número ímpar");
        }
        sc.close();
    }
}