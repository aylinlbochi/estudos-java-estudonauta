/*  Faça um programa que receba 10 números inteiros e mostre
    a quantidade de números primos dentre os números que foram
    digitados.
    Autora: Aylin
    Empresa: 
 */
import java.util.Scanner;
public class Exercicio67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number, totalPrimos = 0;
        
        for(int c = 1; c <= 10; c++){
        
            System.out.println();
            System.out.print(Cores.PINK +"Digite um número inteiro: "+ Cores.RESET);
            number = sc.nextInt();
            
            int contPrimos = 0;
            
            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    contPrimos++;
                }
            }
            if(contPrimos == 2){
                totalPrimos++;
            }
        }    
        System.out.println(Cores.RED + "================================" + Cores.RESET);
        System.out.println(Cores.CYAN + "O total de números primos é " + totalPrimos + Cores.RESET);
        sc.close();
    }
}
