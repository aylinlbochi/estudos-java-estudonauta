/* Exe 029: Programa que leia o início, o fim e o 
	incremento de uma contagem, mostrando em seguida
	os valores na tela, de forma gradativa.
	Autora: Aylin Bochi
	Empresa: Estudonauta
*/
import java.util.Scanner;
public class Exercicio44 {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM - VINDO A SUA CONTAGEM PERSONALIZADA");
        System.out.println("----------------------------------------\n");
        
        int comeco, fim, intervalo;

        System.out.print("Onde começa a contagem? ");
        comeco = sc.nextInt();
        System.out.print("Onde termina a contagem? ");
        fim = sc.nextInt();
        System.out.print("Qual vai ser o incremento? ");
        intervalo = sc.nextInt();
        System.out.println("----------------------------------------\n");
        
        while (comeco <= fim) {
            Thread.sleep(500);
            System.out.print(comeco + "  ");
            comeco += intervalo;
        }
        
        System.out.println("Fim");
        sc.close();
    }
}
