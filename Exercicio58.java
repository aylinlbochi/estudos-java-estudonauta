/*Faça um programa que receba a idade, a altura e o peso 
de cinco pessoas, calcule e mostre:
- A quantidade de pessoas com idade superior a 50 anos;
- A média das alturas das pessoas com idade entre 10 e 20 anos;
- A porcentagem de pessoas com peso inferior a 40 kg entre 
todas as pessoas analisadas.
Autora: Aylin
Empresa: 
 */

import java.util.Scanner;
public class Exercicio58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, peso, somaAltura = 0;
        int idade, quantidade = 0, contAltura = 0, contPeso = 0;

        for(int i = 1; i <= 5; i++){
        System.out.print(Cores.CYAN + "Idade: " + Cores.RESET);
        idade = sc.nextInt();
        System.out.print(Cores.GREEN + "Altura: " + Cores.RESET);
        altura = sc.nextDouble();
        System.out.print(Cores.PINK + "Peso: " + Cores.RESET);
        peso = sc.nextDouble();

        if (idade > 50){
            quantidade ++;
        }
        if(idade >= 10 && idade <= 20){
            somaAltura += altura; 
            contAltura++;
        }
        if(peso < 40){
            contPeso++;
        }
        }
        System.out.println(Cores.YELLOW + "-----------------------------------------------------------------"+ Cores.RESET);
        double media, porcentagem;
        if(contAltura > 0){
            media = somaAltura / contAltura;
            System.out.printf("A média das alturas das pessoas com idade entre 10 e 20 anos %.2f\n", media);
        }
        else{
            System.out.println(Cores.RED + "Não foi possível calcular a média." + Cores.RESET);
        }
        porcentagem = (contPeso * 100.0) / 5;
        
        System.out.printf("A quantidade de pessoas com idade superior a 50 anos é de %d pessoas\n",quantidade);
        System.out.println("A porcentagem de pessoas com peso inferior a 40 kg entre");
        System.out.println("Todas as pessoas analisadas " + porcentagem + "%");
        System.out.println(Cores.YELLOW + "-----------------------------------------------------------------"+ Cores.RESET);
        sc.close();
    }
}
