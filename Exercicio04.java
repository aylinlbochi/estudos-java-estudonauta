/* Faça um programa que receba duas notas, calcule e mostre a média
ponderada dessas notas, considerando peso 2 para a primeira e peso 3 para a segunda.
*/
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        double nota1;
        double nota2;
        
        System.out.print("Qual a primeira nota? ");
        nota1 = sc.nextDouble();

        System.out.print("Qual a segunda nota? ");
        nota2 = sc.nextDouble();
        
        double media = (nota1 * 2 + nota2 * 3) / (2+3);

        System.out.println("A media de "+ nota1+ " e " + nota2 + " é " + media);
        
        sc.close();
    }
}