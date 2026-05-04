/*  EX:032 Programa que leia cinco números inteiros e, no final,
    mostre qual foi a soma dos números pares e a soma dos números 
    impares digitados.
    Empresa: Estudonauta
    Autora: Aylin
 */
import java.util.Scanner;
public class Exercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 1, nu = 0; 
        int par = 0, impar = 0;
        
        while (cont <= 5) {
            System.out.print("Digite o " + cont + "° valor: ");
            nu = sc.nextInt();
            cont ++;
        if(nu % 2 == 0){
            par += nu;
        }
        else{
            impar += nu;
        }
        }
        System.out.println("--------------RESULTADO------------------");
        System.out.println("Somando todos os valores pares, temos " + par);
        System.out.println("Somando todos os valores impares, temos " + impar);
        sc.close();
    }
}
