/*
Faça um programa que receba duas notas de um aluno, calcule a média
aritmética das notas e a mensagem: média 0 até 3. Reprovado, 
3 até 7 Exame 7 até 10 Aprovado.
*/
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1; 
        double nota2;

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("CALCULADORA ARITMÉTICA");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("-----------------RESULTADO-----------------");

        double media = (nota1 + nota2) / 2;
        String status;

        if(media >= 7){
            status = " Aprovado!";
        }
        else if(media >= 3){
            status = " Exame!";
        }
        else {
            status = " Reprovado!";
        }
        System.out.println("\nSua média foi "+ media + status + "\n");    
        
        sc.close();
    }
    
}
