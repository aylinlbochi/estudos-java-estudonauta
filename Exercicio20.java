/* Faça um programa que receba a medida do ângulo formado por uma escada apoiada
no chão e a distância em que a escada está da parede, calcule e mostre a medida
da escada para que se possa alcançar a sua ponta.
*/
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double angulo;
        double distancia;

        System.out.print("Qual a medida do ângulo formado pela escada apoiada no chão? ");
        angulo = sc.nextDouble();
        
        System.out.print("Qual a distância em que a escada está da parede? ");
        distancia = sc.nextDouble();

        double escada = distancia / Math.cos(Math.toRadians(angulo));

        System.out.println("A medida da escada para que se possa " + 
    " alcançar a sua ponta é " + escada);
    sc.close();
    }
}
