/*Faça um programa que receba dez idades, pesos e alturas,
calcule e mostre: 
- A média das idades das dez pessoas;
- A quantidade de pessoas com peso superior a 90 Kg
e altura inferior a 1,50 metro;
- A porcentagem de pessoas com idade entre 10 e 30
anos entre as pessoas que medem mais de 1,90 m.
Autora: Aylin
Empresa: 
 */
import java.util.Scanner;
public class Exercicio62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade, somaIdade = 0, quantidade = 0; 
        double peso, altura,tot = 0.0, contAltura = 0.0;

        for(int c = 1; c <= 10; c++){
            System.out.print(Cores.PINK + "IDADE: " + Cores.RESET);
            idade = sc.nextInt();
            System.out.print(Cores.CYAN + "PESO: " + Cores.RESET);
            peso = sc.nextDouble();
            System.out.print(Cores.PURPLE + "ALTURA: " + Cores.RESET);
            altura = sc.nextDouble();
    
            somaIdade += idade;
            if(peso > 90 && altura < 1.50){
                quantidade++;
            }
            if(altura > 1.90){
                contAltura++;
            }
            if(idade >= 10 && idade <= 30 && altura > 1.90){
                tot ++;
            }
            }
        double media, porcentagem;
        
        System.out.println(Cores.YELLOW + "--------------------------------------------------------------" + Cores.RESET);
        
        media = (double)somaIdade / 10;
        System.out.println("A média das idades das 10 pessoas é de " + media);
        
        if(contAltura > 0){
            porcentagem = (tot * 100) / contAltura;
            System.out.println("A porcentagem de pessoas com idade entre 10 e 30 anos ");
            System.out.println("entre as pessoas que medem mais de 1,90 m é " + porcentagem + "%");
        }
        else{
            System.out.println("Não houve nenhuma pessoa maior de 1,90 m cadastrada");
        }
        System.out.println("A quantidade de pessoas com peso superior a 90 Kg e ");
        System.out.println("altura inferior a 1,50 metros é " + quantidade);
        sc.close();
    }
}

        
