/* Faça um programa para calcular e mostrar o salário reajustado de 
um funcionário. Salário até R$ 300,00 percentual de aumento é de 
35%, Acima de R$ 300,00 percentual de aumento de 15%
*/
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario, reajuste;
        System.out.print("Qual o salário do funcionário? R$ ");
        salario = sc.nextDouble();

        if(salario <= 300){
             reajuste = (salario * 0.35) + salario;

        }else{
             reajuste = (salario * 0.15) + salario;
            
        }
        System.out.printf("O funcionário recebia R$ %.2f ", salario);
        System.out.printf("\nCom o reajuste vai receber R$ %.2f" , reajuste);
        sc.close();
    }
}
