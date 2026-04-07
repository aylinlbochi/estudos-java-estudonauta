/* Uma empresa decide dar um aumento de 30% aos funcionários 
com salários inferiores a R$ 500,00. Faça um programa que
receba o salário do funcionário e mostre o valor do
salário reajustado ou uma mensagem caso ele não tenha direito ao aumento.
*/
import java.util.Scanner;
public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salario;
        System.out.print("Qual o salário do funicionário? R$ ");
        salario = sc.nextDouble();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        if (salario < 500){
            double reajuste = (salario * 0.3) + salario;
            System.out.printf("O salário com o reajuste é de R$ %.2f\n",reajuste);

        }else{
            System.out.println("Funcionário não tem direito ao aumento");
        }System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        sc.close();
    }
}
