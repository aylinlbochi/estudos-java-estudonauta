/* Faça um programa que receba o preço, a categoria
(1- limpeza; 2 - alimentação; ou 3 - vestuário) e a 
situação (R - produtos que necessitam de refrigerações;
e N - produtos que não necessitam de refrigeração).
Calcule e mostre:
O valor do aumento, usando as regras que se seguem.

| PREÇO| CATEGORIA| PERCENTUAL DE AUMENTO|
|-----------------|---------------------:|
|<=25   |    1    |        5%            |
|       |    2    |        8%            |
|       |    3    |        10%           |
|-------|---------|---------------------:|
|>25    |    1    |        12%           |
|       |    2    |        15%           |
|       |    3    |        18%           |

O valor do imposto, usando as regras a seguir.
O produto que preencher pelo menos um dos seguintes requisitos pagará
imposto equivalente a 5% do preço; caso contrário, pagará 8%. Os requisitos são:
Categoria: 2
Situação: R
O novo preço, ou seja, o preço mais aumento menos imposto.
A classificação, usando as regras a seguir.

| NOVO PREÇO                |  CLASSIFICAÇÃO|
|---------------------------|--------------:|
|<= R$ 50,00                |  BARATO       |
|ENTRE R$ 50,00 E R$ 120,00 |  NORMAL       |
|>= R$ 120,00               |  CARO         |
 */

import java.util.Scanner;
public class Exercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SISTEMA DE GESTÃO DE ESTOQUE CAPIVARA");
        System.out.println("Bem - vindo ao Painel Administrativo");
        System.out.println("--------------------------------------");

        double preco;
        System.out.print("Digite o valor do produto R$ ");
        preco = sc.nextDouble();
        System.out.println("----------------------------------------------------");
        System.out.println("        SITUAÇÃO DO PRODUTO");
        System.out.println("R - para produtos que precise de refrigeração.");
        System.out.println("N - para  produtos que não necessitam de refrigeração.");
        System.out.println("----------------------------------------------------");
        
        char sit;
        System.out.print("Qual a situação do produto? ");
        sit = sc.next().toLowerCase().charAt(0);
        System.out.println("----------------------------------------------------");
        
        int categ;
        System.out.println("    ESCOLHA A CATEGORIA DO PRODUTO");
        System.out.println("1 - LIMPEZA ");
        System.out.println("2 - ALIMENTAÇÃO ");
        System.out.print("3 - VESTUÁRIO ");
        categ = sc.nextInt();
        double aumento = 0, preco_aumento = 0, imposto = 0, novo_preco;

        switch (categ) {
            case 1:
                if(preco <= 25 ){
                    aumento = preco * 0.05;
                    preco_aumento = aumento + preco;
                    imposto = preco_aumento* 0.08;
                }
                else{
                    aumento = preco * 0.12;
                    preco_aumento = aumento + preco;
                    imposto = preco_aumento * 0.08;
                }
                
                break;
            case 2:
                if(preco <= 25){
                    aumento = preco * 0.08;
                    preco_aumento = aumento + preco;
                }
                else{
                    aumento = preco * 0.15;
                    preco_aumento = aumento + preco;
                }
                if(sit == 'r'){
                    imposto = preco_aumento * 0.05;
                }
                else{
                    imposto = preco_aumento * 0.08;
                }
                break;
            case 3:
                if(preco <= 25){
                    aumento = preco * 0.10;
                    preco_aumento = aumento + preco;
                    imposto = preco_aumento * 0.08;
                }
                else{
                    aumento = preco * 0.18;
                    preco_aumento = aumento + preco;
                    imposto = preco_aumento * 0.08;
                }
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
        }
        novo_preco = preco_aumento - imposto;
        
        String status; // Como class é uma palavra reservada, troquei para status,
        if (novo_preco <= 50){// para a representar classificação.
            status = "Barato";
        }
        else if(novo_preco < 120){
            status = "Normal";
        }
        else{
            status = "Caro";
        }
        System.out.printf("\nO valor do aumento foi de R$ %.2f", aumento);
        System.out.printf("\nO preço mais o aumento R$ %.2f", preco_aumento);
        System.out.printf("\nO valor do imposto é de R$ %.2f", imposto);
        System.out.printf("\nO novo preço do produto é de R$ %.2f", novo_preco);
        System.out.print("\nA classificação do produto é "+ status);
        sc.close();
    }
}