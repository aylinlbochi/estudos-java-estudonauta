/*  Faça um programa que receba o valor de um carro e mostre uma tabela
    com os seguintes dados: preço final, quantidade de parcelas e 
    valor da parcela. Considere o seguinte:
    - O preço final para compra à vista tem desconto de 20%;
    - A quantidade de parcelas pode ser 6,12,18,24,30,36,42,48,54 e 60;
    - E os percentuais de acréscimos encontram - se na tabela a seguir:
    
    | QUANTIDADE  | PERCENTUAL DE ACRÉSCIMO|
    | DE PARCELAS | SOBRE O PREÇO FINAL    |
    |-------------|-----------------------:|
    |       6     |            3%          |
    |       12    |            6%          |
    |       18    |            9%          |
    |       24    |            12%         |
    |       30    |            15%         |
    |       36    |            18%         |
    |       42    |            21%         |
    |       48    |            24%         |
    |       54    |            27%         |
    |       60    |            30%         |

    Autora: Aylin
    Empresa: 
 */
import java.util.Scanner;
public class Exercicio66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor_car, juros = 0, porcentagem = 0, parcelas = 0;

        System.out.println(Cores.YELLOW + "\t------------------------" + Cores.RESET);
        System.out.println(Cores.RED+ "\tCONCESSIONÁRIA CAPIVARA" + Cores.RESET );
        System.out.println(Cores.YELLOW + "\t------------------------" + Cores.RESET);

        System.out.print(Cores.PURPLE + "\nInforme o valor do carro: " + Cores.RESET);
        valor_car = sc.nextDouble();
        System.out.println(Cores.YELLOW + "----------------------------------" + Cores.RESET);
        
        double aVista =  valor_car - (0.2 * valor_car);
        System.out.println(Cores.GREEN + "Valor a vista R$ " + aVista + Cores.RESET);
        System.out.println(Cores.YELLOW + "----------------------------------" + Cores.RESET);
        
        for(int c = 6; c <= 60; c += 6){
            juros = c / 2.0;
            porcentagem = (juros / 100) * valor_car ;
            double precoFinal = porcentagem + valor_car;
            parcelas = precoFinal / c; 

            System.out.println(Cores.CYAN + "Preço total é R$ " + precoFinal + Cores.RESET);
            System.out.println(Cores.PINK + "Parcelas: " + c + Cores.RESET);
            System.out.printf( "Valor das parcelas: R$ %.2f" , parcelas);
            System.out.println(Cores.YELLOW + "\n----------------------------------" + Cores.RESET);
            
        }
        sc.close();
    }
}
