/*Faça um programa que receba a altura e o gênero de uma pessoa e calcule
e mostre seu peso ideal, utilizando as seguintes formulas, onde H é altura.
para homens = (72.7 * H) - 58
para mulheres = (62.1 * H ) - 44.7
 */
import java.util.Scanner;
public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura,peso = 0;
        String genero;

        System.out.print("Digite seu gênero biológico: ");
        genero = sc.nextLine();
        System.out.print("Digite sua altura ");
        altura = sc.nextDouble();
        System.out.println("=-=-=-=-CALCULANDO SEU PESO IDEAL=-=-=-=-=-=-=-");
        if(genero.toLowerCase().equals("masculino")){
            peso = (72.7 * altura) - 58;
        }else if(genero.toLowerCase().equals("feminino")){
            peso = (62.1 * altura) - 44.7;  
        }else{
            System.out.println("Erro! Tente novamente.");
        }
            System.out.printf("O seu peso ideal é %.2f",peso);

        sc.close();
    }
}

