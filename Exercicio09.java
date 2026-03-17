/* Faça um programa que calcule e mostre a área de um trapézio
Sabe-se que: A = ((base maior + base menor)*altura)/2
*/
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double base_maior;
        double base_menor;
        double altura;
    
        System.out.print("Digite a base maior: ");
        base_maior = sc.nextDouble();

        System.out.print("Digite a base menor: ");
        base_menor = sc.nextDouble();

        System.out.print("Qual a altura do trapézio? ");
        altura = sc.nextDouble();

        double area = ((base_maior + base_menor) * altura)/2;

        System.out.println("A área do seu trapézio é " + area);

        sc.close();

        
    }
}
