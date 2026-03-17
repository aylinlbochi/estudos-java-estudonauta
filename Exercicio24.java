/* Faça um programa que receba a quantidade de dinheiro em reais que uma pessoa
que vai viajar possui.Ela vai passar por vários países e precisa converter
seu dinheiro em dólares, marco alemão e libra esterlina. Sabe-se que a cotação
do dólar é de R$ 1,80; do marco alemão é de R$ 2,00 e da libra esterlina 
é de R$ 3,57.
O programa deve fazer as conversões e mostrá-las.
*/
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dinheiro_reais;

        System.out.println("Quantos reais você possui para a viagem? R$ ");
        dinheiro_reais = sc.nextDouble();

        double dolar = dinheiro_reais / 1.80;
        double marco_alemao = dinheiro_reais / 2;
        double libra_esterlina = dinheiro_reais / 3.57;

        System.out.println("O valor de R$ " + dinheiro_reais + 
        " convertido em dolar é $ "+ dolar);
        System.out.println("O valor de R$ " + dinheiro_reais + 
        " convertido em marco alemão é € "+ marco_alemao);
        System.out.println("O valor de R$ " + dinheiro_reais + 
        " convertido em libra esterlina é £ "+ libra_esterlina);
        sc.close();
    }
}
