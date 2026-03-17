/* Faça um programa que receba quatro notas de um aluno, 
calcule a média aritmética das notas e a mensagem de aprovado 
ou reprovado, considerando a aprovação média 7.
*/
import java.util.Scanner;
public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1; 
        double nota2;
        double nota3;
        double nota4;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("CALCULADORA ARITMÉTICA");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = sc.nextDouble();

        System.out.print("Digite a quarta nota: ");
        nota4 = sc.nextDouble();

        System.out.println("-----------------RESULTADO-----------------");

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String status;

        if(media >= 7){
            status = " Aprovado!";
        }
        else if(media >= 5){
            status = " Recuperação!";
        }
        else {
            status = " Reprovado!";
        }
        System.out.println("\nSua média foi "+ media + status + "\n");    
        
        sc.close();
    }
    
}
