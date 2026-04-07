/* Um banco concederá um crédito especial aos seus clientes, de acordo
com o saldo médio no último ano. Faça um programa que receba o saldo médio
de um cliente e calcule o valor do crédito:
                            saldo médio
Acima de R$ 400,00          30% 
R$ 400,00 -> R$ 300,00      25%
R$ 300,00 -> R$ 200,00      20%
R$ 200,00                   10% 
Mostre o saldo médio e o valor
do crédito.
*/

import java.util.Scanner;
public class Exercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double saldo, credito;
        System.out.print("Digite o valor do saldo médio R$ ");
        saldo = sc.nextDouble();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        if (saldo > 400){
            credito = saldo * 0.30;
        }else if(saldo > 300){
            credito = saldo * 0.25;
        }else if(saldo > 200){
            credito = saldo * 0.20;
        }else{
            credito = saldo * 0.10;
        }
        System.out.printf("O saldo médio é R$ %.2f", saldo);
        System.out.printf("\nO valor do crédito é de R$ %.2f", credito);
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        sc.close();
    }
}
