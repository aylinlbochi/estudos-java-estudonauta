/*Ex:035 - Faça um programa que pergunte quantas pessoas serão
	cadastradas e o peso de referência a se considerar.
	Depois disso, pergunte o peso e o sexo de cada pessoa
	e analise se cada uma está dentro do limite de peso ou não.
	No final de tudo, mostre quantos homens e quantas mulheres
	estão acima do limite de referência.
	Autora: Aylin
	Empresa: Estudonauta.
*/
import java.util.Scanner;
public class Exercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int pessoa, feminino = 0, masculino = 0;
        double peso, ref; //ref == Referência
        char sexo;

        System.out.print("Quantas pessoas vamos cadastrar? ");
        pessoa = sc.nextInt();
        System.out.print("Qual é o peso de referência? (Kg) ");
        ref = sc.nextDouble();
        if(pessoa <= 0){
            System.out.println("Erro! Tente novamente.");
        }
        else{

        for(int cont = 1; cont <= pessoa; cont++){
            System.out.println("-----------------------");
            System.out.printf("  Pessoa %d de %d \n", cont, pessoa );
            System.out.println("-----------------------");
            
            System.out.print("PESO: (Kg) ");
            peso = sc.nextDouble();
            System.out.print("SEXO: [M/F] ");
            sexo = sc.next().toLowerCase().charAt(0);

            if(peso > ref){
                System.out.println("Peso Acima do limite de referência");
                if(sexo == 'f'){
                    feminino++;
                }
                else if(sexo == 'm'){
                    masculino++;
                }
                else{
                    System.out.println("Erro! Tente novamente.");
                }
                
            }
            else{
                System.out.println("Peso dentro do limite de (" + ref + " Kg)");
            }
        }
        System.out.println("------------------ RESULTADO ---------------------");
        System.out.printf("Ao todo, temos %d homens e %d mulheres acima do peso de referência!\n",masculino, feminino);
        }
        sc.close();
    }
}