/*  Ex:030: Programa que leia um número qualquer e 
	conte de 1 até ele, só que fazendo o jogo do PIN,
	onde os múltiplos de 4 são substituídos pela
	palavra "PIN"
	Autora: Aylin
	Empresa: Estudonauta
 */
import java.util.Scanner;
public class Exercicio45 {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

        System.out.println("\n BEM - VINDO AO GAME DO PIN!!");
        System.out.println("O jogo funciona assim, os números multiplos de 4");
        System.out.println("Não podem ser falados. Então no lugar ficaria a palvra PIN");
        System.out.println("---------------------------------------------------------");
        
        int comeco, cont = 0;
        System.out.print("Quer contar até que número? ");
        comeco = sc.nextInt();

        while (cont < comeco) {
            cont ++;
        if(cont % 4 == 0){
            System.out.print(" PIN! ");
        }
        else{
            System.out.print(cont + " - ");
        }
        Thread.sleep(300);
        }
        System.out.println(" FIM!");
        sc.close();
    }      
    
}
