/* Faça um programa que receba dois números e execute uma das 
operações listadas a seguir, de acordo com a escolha do usuário.
Se for digitada uma opção inválida, mostre uma mensagem de erro
e termine a execução do programa. As opções são:
A) O primeiro número elevado ao segundo número.
B) Raiz quadrada de cada um dos números.
C) Raiz cúbica de cada um dos números.
*/
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num_1, num_2;
        System.out.print("Digite o primeiro número: ");
        num_1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        num_2 = sc.nextDouble();

        int opcao;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("ESCOLHA UMA DAS TRÊS OPÇÕES");
        System.out.println("1 - O primeiro número elevado ao segundo número");
        System.out.println("2 - Raiz quadrada de cada um dos números");
        System.out.print("3 - Raiz cúbica de cada um dos números: ");
        opcao = sc.nextInt();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        switch (opcao) {
            case 1:
                double pote = Math.pow(num_1, num_2);
                System.out.println("O número " + num_1+ " elevado a "+ num_2+ " é "+ pote);
                break;
            case 2:
                double raiz_quad1 = Math.sqrt(num_1);
                double raiz_quad2 = Math.sqrt(num_2);
                System.out.printf("A raiz quadrada de %.1f é %.2f\n", num_1, raiz_quad1 );
                System.out.printf("A raiz quadrada de %.1f é %.2f\n", num_2, raiz_quad2);
                break;
            case 3:
                double cubica = Math.cbrt(num_1);
                double cubic = Math.cbrt(num_2);
                System.out.printf("A raiz cúbica de %.1f é %.2f\n", num_1,cubica);
                System.out.printf("A raiz cúbica de %.1f é %.2f\n", num_2,cubic);
                break;
            default:
                System.out.println("Erro: opção inválida, escolha uma das 3 opções.");
                break;
        }
        sc.close();
    }
}
