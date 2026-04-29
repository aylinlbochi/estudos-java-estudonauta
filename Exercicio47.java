/*Faça um programa que leia cinco grupos de quatro valores (A,B,C,D)
e mostre-os na ordem lida. Em seguida, organize-os em ordem 
crescente e decrescente.
Empresa: 
Autora: Aylin
 */
import java.util.Arrays;
import java.util.Scanner;
public class Exercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        while(cont < 5){
            cont ++;
            int [] number = new int [4];
            
            System.out.print("Digite o primeiro número: ");
            number [0] = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            number[1] = sc.nextInt();
            System.out.print("Digite o terceiro número: ");
            number[2] = sc.nextInt();
            System.out.print("Digite o quarto número: ");
            number[3]= sc.nextInt();
        System.out.println("---------------------------------------------------------");
        System.out.println("Ordem lida: " + number[0] +" - "+ number[1] +" - " +number[2] +" - "+ number[3] +" - ");
        Arrays.sort(number);
        System.out.println("Seus números em ordem crescente é " + Arrays.toString(number));
        System.out.println("Seus números em ordem descresnte é " + number[3]+" - " + number[2] +" - " + number[1] +" - " + number[0] );
        System.out.println("---------------------------------------------------------");
    }
        sc.close();
        }
    }
