/* Ex038: Faça um programa que leia o NOME, a IDADE e o SEXO de 5 pessoas.
	No final mostre os dados dos HOMENS e das MULHERES mais JOVENS
	e mais VELHOS, separadamente.
	Autor: Aylin
	Empresa: Estudonauta
	*/	
import java.util.Scanner;
public class Exercicio61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(Cores.YELLOW + "--------------------------------------------------------------" + Cores.RESET);
        System.out.println(Cores.RED + "ATENÇÃO PARA O SEXO DIGITAR: M = MASCULINO E F = PARA FEMININO" + Cores.RESET);
        System.out.println(Cores.YELLOW + "--------------------------------------------------------------" + Cores.RESET);
        
        int idade, menorIdadeF = 0, menorIdadeM = 0, maiorIdadeF = 0, maiorIdadeM = 0;
        int totF = 0, totM = 0;
        String nome, nomeJovemF = "", nomeJovemM = "", nomeVelha = "", nomeVelho = "";
        char sexo;

        for(int c = 1; c <= 5; c++){
            System.out.println(Cores.YELLOW + "--------------------------------------" + Cores.RESET);
            System.out.println(Cores.PURPLE +"\t"+ c + "ª PESSOA" + Cores.RESET);
            System.out.println(Cores.YELLOW + "--------------------------------------" + Cores.RESET);

            System.out.print(Cores.PINK + "NOME: " + Cores.RESET);
            nome = sc.nextLine();
            System.out.print(Cores.CYAN + "SEXO [M/F]: " + Cores.RESET);
            sexo = sc.next().toUpperCase().charAt(0);
            System.out.print(Cores.PURPLE + "IDADE: " + Cores.RESET);
            idade = sc.nextInt();

            sc.nextLine();
            if(sexo == 'F'){
                totF++;
                if(totF == 1){
                    maiorIdadeF = idade;
                    menorIdadeF = idade;
                    nomeJovemF = nome;
                    nomeVelha = nome;
                }
                else{
                    if(idade < menorIdadeF){
                        menorIdadeF = idade;
                        nomeJovemF = nome;
                    }
                    if(idade > maiorIdadeF){
                        maiorIdadeF = idade;
                        nomeVelha = nome;
                    }
                }
            }
            if(sexo == 'M'){
                totM++;
                if(totM == 1){
                    menorIdadeM = idade;
                    maiorIdadeM = idade;
                    nomeJovemM = nome;
                    nomeVelho = nome;
                }
                else{
                    if(idade < menorIdadeM){
                        menorIdadeM = idade;
                        nomeJovemM = nome;
                    }
                    if(idade > maiorIdadeM){
                        maiorIdadeM = idade;
                        nomeVelho = nome;
                    }
                }
            }
        }

        System.out.println(Cores.YELLOW + "=======================================================" + Cores.RESET);
        System.out.println("Ao todo tivemos "+ totM + " homens e " + totF + " mulheres cadastrados.");
        System.out.print("A mulher mais jovem é a " + nomeJovemF + " que tem " + menorIdadeF + " anos");
        System.out.print("\nA mulher mais velha é a " + nomeVelha + " que tem " + maiorIdadeF + " anos");
        System.out.print("\nO homem mais jovem é o " + nomeJovemM + " que tem " + menorIdadeM + " anos");
        System.out.print("\nO homem mais velho é o " + nomeVelho + " que tem " + maiorIdadeM+ " anos");
        sc.close();
    }
}
