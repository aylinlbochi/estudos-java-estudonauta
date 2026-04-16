/*Uma empresa decidiu dar uma gratificação de natal a seus
funcionários, baseada no número de horas extras e no número
de horas que o funcionário faltou ao trabalho. O valor
do prêmio é obtido pela consulta à tabela que se segue, na
qual: H = número de horas extras - (2/3 * (número de horas falta))

| H (MINUTOS)    | PRÊMIO (R$)|
|----------------|-----------:|
| >= 2.400       | 500,00     |
| 1.800 <- 2.400 | 400,00     |
| 1.200 <- 1.800 | 300,00     |
| 600   <- 1.200 | 200,00     |
| < 600          | 100,00     |

 */
import java.util.Scanner;
public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nDESEJAMOS A TODOS OS NOSSOS COLABORADORES");
        System.out.println("UM FELIZ NATAL E UM PRÓSPERO ANO NOVO!!");
        System.out.println("Um oferecimento do Mercado Capivara, seu amigão nos preços.");
        System.out.println("----------------------------------------------------------");

        double horas_extras, faltas, horas, gratif;
        String nome;
        System.out.print("Informe o nome do funcionário: ");
        nome = sc.nextLine().toUpperCase();
        System.out.println("=====================================");
        System.out.println("POR FAVOR COLOCAR AS HORAS EM MINUTOS. \nGRATA.");
        System.out.println("=====================================");
        System.out.print("Informe as horas extras trabalhadas: ");
        horas_extras = sc.nextDouble();
        System.out.print("Quantas horas de falta ele(a) teve? ");
        faltas = sc.nextDouble();

        horas = horas_extras - (2.0/3.0 * (faltas));

        if(horas >= 2400){
            gratif = 500;
        }
        else if(horas >= 1800 && horas < 2400){
            gratif = 400;
        }
        else if(horas >= 1200 && horas < 1800){
            gratif = 300;
        }
        else if(horas >= 600 && horas < 1200){
            gratif = 200;
        }
        else{
            gratif = 100;
        }
        System.out.println("----------------------------------------------------------");
        System.out.println("O funcionário " + nome + " fez o total de "+ horas_extras + " horas extras.");
        System.out.println(nome + " teve tantas faltas " + faltas );
        System.out.printf("O valor da gratificação a ser recebido é de %.2f", gratif);
        System.out.println("\n----------------------------------------------------------");
        sc.close();
    }    
}
