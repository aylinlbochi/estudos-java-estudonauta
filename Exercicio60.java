/* Ex037: Faça um programa que leia o NOME e a IDADE de 5 pessoas.
	No final mostre os dados da pessoa mais JOVEM e da pessoa mais VELHA.
	Autor: Aylin
	Empresa: Estudonauta
	*/
    import java.util.Scanner;
    public class Exercicio60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int idade, maiorIdade = 0, menorIdade = 0;
        String nome, velho = "", novo = "";
        
        for(int c = 1; c <= 5; c++){
            System.out.println(Cores.YELLOW + "--------------------------------------" + Cores.RESET);
            System.out.println(Cores.PURPLE +"\t"+ c + "ª PESSOA" + Cores.RESET);
            System.out.println(Cores.YELLOW + "--------------------------------------" + Cores.RESET);

            System.out.print("NOME: "); 
            nome = sc.nextLine();
            System.out.print("IDADE: ");
            idade = sc.nextInt();

            sc.nextLine();

            if(c == 1){
                menorIdade = idade;
                maiorIdade = idade;
                novo = nome;
                velho = nome;
            }
            else{
                if(idade < menorIdade){
                    menorIdade = idade;
                    novo = nome;
                }
                if(idade > maiorIdade){
                    maiorIdade = idade;
                    velho = nome;
                }
            }
            }
        System.out.println(Cores.YELLOW + "=======================================================" + Cores.RESET);
        System.out.println("A pessoa mais jovem é " + novo + " que tem " + menorIdade + " anos.");
        System.out.println("A pessoa mais velha é " + velho + " que tem " + maiorIdade + " anos.");
        System.out.println(Cores.YELLOW + "=======================================================" + Cores.RESET);sc.close();
        }

    }
        
        


