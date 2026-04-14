/*Faça um programa que receba: o código do produto;
e a quantidade comprada do produto.
Calcule e mostre:
- O preço unitário do produto, seguindo a Tabela I;
- O preço  total da nota, 
- O valor do desconto, seguindo a Tabela II e aplicado sobre 
- O preço total da nota, e o preço final da nota depois do desconto.
## TABELA I

| CÓDIGO  | PREÇO     |
|:-------:|:---------:|
| 1 A 10  | R$ 10,00  |
| 11 A 20 | R$ 15,00  |
| 21 A 30 | R$ 20,00  |
| 31 A 40 | R$ 30,00  |  

## TABELA II

| PREÇO TOTAL DA NOTA         | % DE DESCONTO |
|----------------------------|---------------:|
| ATÉ R$ 250,00              | 5%            |
| ENTRE R$ 250,00 E R$ 500,00| 10%           |
| ACIMA DE R$ 500,00         | 15%           |

*/
import java.util.Scanner;
public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codigo, quantidade;

        System.out.println("    SEJA BEM-VINDO AO MERCADO CAPIVARA!!");
        System.out.println("-------------------------------------------");
        System.out.print("Informe o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Informe a quantidade do produto: ");
        quantidade = sc.nextInt();

        double preco_unit, preco_total;
        if(codigo >= 1 && codigo <= 10){
            preco_unit = 10;
        }else if(codigo >= 11 && codigo <= 20){
            preco_unit = 15;
        }else if(codigo >= 21 && codigo <= 30){
            preco_unit = 20;
        }else{
            preco_unit = 30;
        }
        preco_total = quantidade * preco_unit;
            
        double desc, valor_final; // Desc == desconto.
            if (preco_total <= 250){//Eu usei dois double para o código ficar organizado.
            desc = preco_total * 0.05;
        }else if(preco_total <= 500){
            desc = preco_total * 0.10;
        }else{
            desc = preco_total * 0.15;
        }
        valor_final = preco_total - desc;

        System.out.println("-----------------DESCRIÇÃO-----------------");
        System.out.printf("O preço unitário é de R$ %.2f",preco_unit);
        System.out.printf("\nO valor total da nota é R$ %.2f",preco_total);
        System.out.printf("\nO cliente recebeu um desconto de R$ %.2f",desc);
        System.out.printf("\nO valor total da nota é de R$ %.2f",valor_final);
        System.out.println("\n-------------------------------------------");
        sc.close();
    }
}
