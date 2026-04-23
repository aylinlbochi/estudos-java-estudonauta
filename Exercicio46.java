/*Ex:031: Programa que leia o limite inicial de uma contagem regressiva
	e um número desejado para mútiplos. O programa deverá contar do primeiro
	valor até zero, marcando os números que forem múltiplos do segundo valor
	informado.
	Autora: Aylin
	Empresa: Estudonauta
 */
import java.util.Scanner;
public class Exercicio46 {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-------------------------------------");
        System.out.println("         CONTAGEM REGRESSIVA ");
        System.out.println("-------------------------------------\n");
        
        // ENTRADA DE DADOS
        int comeco, mult;
        System.out.print("Sua contagem regressiva vai começar em? ");
        comeco = sc.nextInt();
        System.out.print("Marcar os multiplos de ");
        mult = sc.nextInt();

        // CONTAGEM
        int cont = comeco;

        while (cont >= 0) {
        if(cont % mult == 0){
            System.out.printf(" [ %d ] - " , cont);
        }
        else{
            System.out.print(cont + " - ");
        }cont --;
        Thread.sleep(400);
        }
        System.out.println(" FIM");
        sc.close();
    }
}
