/* O preço ao consumidor de um carro novo é a soma do custo de fábrica
com a porcentagem do distribuidor e dos impostos, ambos aplicados
ao custo de fábrica. Faça um programa que receba o custo de fábrica de um 
carro e mostre o preço ao consumidor.
Custo de fábrica                   % do distribuidor       %dos impostos
Até R$12.000,00                           5                   isento
Entre R$ 12.000,00 e R$25.000,00          10                    15
Acima de R$ 25.000,00                     15                    20
*/
import java.util.Scanner;
public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("BEM-VINDO A CONCESSIONÁRIA BOCHI!!");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    
        double custo_fabrica, distri, impostos,  valor_final;
        System.out.print("Qual o custo de fábrica? R$ ");
        custo_fabrica = sc.nextDouble();

        if(custo_fabrica <= 12000){
            distri = custo_fabrica * 0.05;
            valor_final = custo_fabrica + distri ;
        }else if (custo_fabrica <= 25000) {
            distri = custo_fabrica * 0.1;
            impostos =  custo_fabrica * 0.15;
            valor_final = distri + impostos + custo_fabrica;
        }else{
            distri = custo_fabrica * 0.15; 
            impostos = custo_fabrica * 0.20;
            valor_final = distri + impostos + custo_fabrica;
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.printf("O valor que o cliente vai pagar é de R$ %.2f ",valor_final);
        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        sc.close();
    }
}
