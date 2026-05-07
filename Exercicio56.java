/*Ex036: Faça um programa que pergunte quantos números vamos
	sortear e faça o computador gerar esses números sozinho.
	No final, mostre quantos são maiores que cinco e quantos
	são divisíveis por três.
	Autora: Aylin
	Empresa: Estudonauta.
*/
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Exercicio56 {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        
        int number, maior = 0, divisiveis = 0;
        System.out.print("Quantos números vou sortear? ");
        number = sc.nextInt();
        
        System.out.println("-----------------------------------");
        System.out.printf("Sorteando %d valores: \n", number);
        
        for(int cont = 1; cont <= number; cont ++){
            int sorteando = ThreadLocalRandom.current().nextInt(1, 11);
            System.out.print(sorteando + " - ");
            Thread.sleep(500);
            if(sorteando > 5){
                maior++;
            }
            if(sorteando % 3 == 0){
                divisiveis++;
            }
        }
        System.out.println("Pronto");
        System.out.println("-----------------------------------");
        System.out.printf("Dos %d sorteados: \ntemos %d maiores que cinco", number, maior);
        System.out.printf("\ne %d divisíveis por três.", divisiveis);
        sc.close();
    }
}