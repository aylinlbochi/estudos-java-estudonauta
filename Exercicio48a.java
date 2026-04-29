/* Uma companhia de teatro deseja montar uma série de espetáculos.
A direção calcula que, a R$ 5,00 o ingresso, serão vendidos
120 ingressos, e que as despesas serão de R$ 200,00. Diminuindo-se
em R$0,50 o preço do ingressos, espera-se que as vendas aumentem em
26 ingressos. Faça um programa que escreva uma uma tabela de valores
de lucros esperados em função do preço do ingresso, fazendo-se variar
esse preço de R$5,00 R$1,00, R$0,50, em R$0,50 escreva, ainda, para cada
novo preço de ingresso, o lucro máximo esperado, o preço do ingresso e a
quantidade de ingressos vendidos para a obtenção desse lucro máximo.
Empresa:
Autora: Aylin
 */
import java.util.Scanner;
public class Exercicio48a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("     BEM - VINDO, AO TEATRO CAPIVARA COMPANY");
        System.out.println(" Um lugar de lazer para você e toda a sua família.");
        System.out.println("----------------------------------------------------");
        
        int cont = 0;
        
        while (cont < 10) {
            double preco;
            
            System.out.print("Digite o preço do ingresso: ");
            preco = sc.nextDouble();
        
            double lucro = 0, ingresso = 0;
        if(preco == 5){
            ingresso = 120;
        }
        else if(preco == 4.50){
            ingresso = 120 + 26; // Foi add os 26 como estimativa de aumento de vendas. 
        }
        else if(preco == 4){
            ingresso = 52 + 120; // Foi add mais 26 aos ingressos dando o valor de 52.
        }
        else if(preco == 3.50){
            ingresso = 78 + 120;
        }
        else if(preco == 3){
            ingresso = 104 + 120;
        }
        else if (preco == 2.5){
            ingresso = 130 + 120 ;
        }
        else if (preco == 2){
            ingresso = 156 + 120;
        }
        else if(preco == 1.5){
            ingresso = 182 + 120;
        }
        else if(preco == 1){
            ingresso = 208 + 120;
        }   
        else{
        ingresso = 234 + 120 ;
        }
        cont ++;
        lucro = (preco * ingresso) - 200;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.printf("O lucro máximo esperado é de R$ %.2f ", lucro,"\n");
        System.out.printf("\nO valor do ingresso é de R$ %.2f", preco,"\n");
        System.out.println("\nQuantidade de ingressos vendidos foi de " + ingresso);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
        sc.close();
    }
}
