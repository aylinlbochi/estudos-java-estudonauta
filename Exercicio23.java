/* Faça um programa que receba a medida de dois ângulos de um triângulo, calcule
e mostre a medida do terceiro ângulo. Sabe-se que a soma dos ângulos de um 
triângulo é 180 graus.
*/
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angulo_1;
        double angulo_2;

        System.out.print("Informe o primeiro angulo: ");
        angulo_1 = sc.nextDouble();

        System.out.print("Informe o segundo angulo: ");
        angulo_2 = sc.nextDouble();

        double soma = angulo_1 + angulo_2;
        double angulo_3 = 180 - soma;

        System.out.println("A medida do terceiro ângulo é " + angulo_3);
        sc.close();
        }
    }
    
