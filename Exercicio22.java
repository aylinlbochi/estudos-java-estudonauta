/* Faça um programa que receba o número de lados de um polígono convexo, calcule
e mostre o número de diagonais desse polígono. Sabe-se que ND = N*(N -3)/2, em que
N é o número de lados do polígono.
*/
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lados;

        System.out.print("Informe o número de lados de um polígono convexo: ");
        lados = sc.nextInt();

        int numero_diagonais =  lados * (lados - 3) / 2;

        System.out.println("O número de diagonais desse polígono é " + numero_diagonais);
        sc.close();
    }    
}
