/* Faça um programa que receba o número de horas trabalhadas, o valor do salário
mínimo e o número de horas extras trabalhadas, calcule e mostre o salário a receber,
de acordo com as regras a seguir.
a) a hora trabalhada vale 1/8 do salário mínimo;
b) a hora extra vale 1/4 do salário mínimo;
c) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor 
da hora trabalhada;
d) a quantia a receber pelas horas extras equivale ao número de horas extras 
trabalhadas multiplicado pelo valor da hora extra;
e) o salário a receber equivale ao salário bruto mais a quantia a receber pelas
horas extras.
*/
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double horas_trabalhadas;
        double salario_minimo;
        double horas_extras;

        System.out.print("Informe o número de horas trabalhadas: ");
        horas_trabalhadas = sc.nextDouble();

        System.out.print("Qual o valor do salário mínimo? ");
        salario_minimo = sc.nextDouble();

        System.out.print("Informe o número de horas extras trabalhadas: ");
        horas_extras = sc.nextDouble();

        double a = salario_minimo / 8;
        double b = salario_minimo / 4;
        double c = horas_trabalhadas * a;
        double d = horas_extras * b;
        double e = c + d;

        System.out.println("A hora trabalhada vale R$ " + a);
        System.out.println("A hora extra trabalhada vale R$ " + b);
        System.out.println("O salário bruto equivale a R$ " + c);
        System.out.println("A quantia a receber pelas horas extras equivale R$ " + d);
        System.out.println("O total a receber equivale a R$ " + e);
        sc.close();
    }
}
