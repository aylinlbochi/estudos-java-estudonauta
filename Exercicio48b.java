/*Esse exercício é outra forma de fazer o mesmo exercício
Só que de um jeito mais prático.

 */
import java.util.Scanner;
public class Exercicio48b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        System.out.println("     BEM - VINDO, AO TEATRO CAPIVARA COMPANY");
        System.out.println(" Um lugar de lazer para você e toda a sua família.");
        System.out.println("----------------------------------------------------");
        
        double preco = 5;
        int ingresso = 120;
        
        while (preco >= 0.5) {
            double lucro = (preco * ingresso) - 200;
            System.out.printf("O lucro máximo esperado é de R$ %.2f ", lucro,"\n");
            System.out.printf("\nO valor do ingresso é de R$ %.2f", preco,"\n");
            System.out.println("\nQuantidade de ingressos vendidos foi de " + ingresso);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

            preco -= 0.5;
            ingresso += 26;
        }
        sc.close();
    }
}
