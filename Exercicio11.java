/* Faça um programa que calcule e mostre a área de um losango
Sabe-se que: A = (diagonal maior * diagonal menor) / 2.
*/
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dig_maior; // Dig é abreviação para diagonal
        double dig_menor;
        
        System.out.println("Calculo da área de um losango\n");

        System.out.print("Digite a diagonal maior: ");
        dig_maior = sc.nextDouble();

        System.out.print("Digite a diagonal menor: ");
        dig_menor = sc.nextDouble();

        double area = (dig_maior * dig_menor) / 2;
        
        System.out.println("A área do losango é " + area);
        
        sc.close();
    }
}
