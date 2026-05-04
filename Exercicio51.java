/* Ex:33 - Faça um programa que pergunte quantos números números
    o usuário quer sortear. Em seguida, sorteie a quantidade de números
    solicitados, mostre-os na tela e no final mostre a soma entre eles.
    Autor: Aylin
    Empresa: Estudonauta.
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Exercicio51 {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        
        int nu, cont = 1, soma = 0;
        System.out.print("Quantos números você quer que eu sortei? ");
        nu = sc.nextInt();
        
        System.out.println("---------------------------------------------");
        while (cont <= nu) {
            int sorteio;
            sorteio = ThreadLocalRandom.current().nextInt(1,11);
            soma += sorteio;
            System.out.println("O " + cont + "° sorteado foi " + sorteio);
            cont ++;
            Thread.sleep(400);
        }
        System.out.println("---------------------------------------------");
        System.out.println("A soma entre todos esses valores é igual a " +  soma);
        sc.close();
    }
    
}