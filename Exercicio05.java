/* Faça um programa que receba o preço de um produto, calcule e mostre o novo 
preço, sabendo-se que este sofreu um desconto de 10%.
*/
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double preco;

        System.out.print("Qual o preço do produto? R$ ");
        preco = sc.nextDouble();

        double desconto = preco * 0.10;
        double novo_preco = preco - desconto;
        

        System.out.println("O produto custa R$ " + preco + " com desconto de 10% " +
        "ele vai custar R$ " + novo_preco);

        sc.close();

    }
}