/*Faça um programa que receba o preço de um produto, calcule e 
mostre, o novo preço e a classificação.
## Percentual de aumento
|Preço                        | %  |
|-----------------------------|---:|
|Até R$ 50,00                 | 5  |
|Entre R$ 50,00 e R$ 100,00   | 10 |
|Acima de R$ 100,00           | 15 |

## Classificações
|Novo preço                             |   Classificação|
|---------------------------------------|---------------:|
|Até R$ 80,00                           |      Barato    |
|Entre R$ 80,00 e  R$ 120,00(inclusive) |      Normal    |
|Entre R$ 120 e R$ 200,00(inclusive)    |      Caro      |
|Maior que R$ 200,00                    |      Muito caro|
 */
import java.util.Scanner;
public class Exercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double preco, novo_preco;
        String classific;
        System.out.print("Informe o preço do produto: R$ ");
        preco = sc.nextDouble();
        if(preco <= 50){
            novo_preco = (preco * 0.05) + preco;
        }else if (preco <= 100){
            novo_preco = (preco * 0.10) + preco;
        }else{
            novo_preco = (preco * 0.15) + preco;
        }
        if(novo_preco <= 80){
            classific = "Barato";
        }else if (novo_preco <= 120){
            classific = "Normal";
        }else if (novo_preco <= 200){
            classific = "Caro";
        }else{
            classific = "Muito caro";
        }
        System.out.println("=-=-=-=-=-=-=-=-RESULTADO=-=-=-=-=-=-=-=");
        System.out.printf("O novo preço é de R$ %.2f",novo_preco);
        System.out.println("\nA classificação do produto é "+ classific);
        System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        sc.close();
    }
}