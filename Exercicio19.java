/* Sabe-se que, para iluminar de maneira correta os cômodos
de uma casa, para cada m², deve-se usar 18W de potência. 
Faça um programa que receba as duas dimensões de um cômodo
em metros, calcule e mostre a sua área em m² e a potência de iluminação
que deverá ser utilizada.
*/
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double comprimento;
        double largura;

        System.out.print("Qual o comprimento do cômodo? ");
        comprimento = sc.nextDouble();

        System.out.print("Qual a largura do cômodo? ");
        largura = sc.nextDouble();

        double area = comprimento * largura;
        double potencia = area * 18;

        System.out.println("A área em m² é " + area);
        System.out.println("A potência a ser utilizada é " + potencia);
        sc.close();
    }
}
