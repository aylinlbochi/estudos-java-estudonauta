/*Faça um programa que receba dez números, calcule e mostre
a soma dos números pares e a soma dos números primos.
Autora: Aylin
Empresa: 
 */
import java.util.Scanner;
public class Exercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, somaPares = 0, somaPrimos = 0;
    
        for(int c = 1; c <= 10; c++){
            System.out.print("Digite um número: ");
            number = sc.nextInt();
            int  contPrimos = 0;
            if(number % 2 == 0){
                somaPares += number;
            }
            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    contPrimos++;
                }
            }
            if(contPrimos == 2){
                somaPrimos += number;
            } 
        
        }
        System.out.printf("A soma dos números pares é %d", somaPares);
        System.out.printf("\nA soma dos números primos é %d", somaPrimos);
        
        sc.close();
    }
}

