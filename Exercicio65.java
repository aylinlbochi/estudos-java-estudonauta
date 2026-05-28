/* Ex040: Faça um programa que leia dois operandos de uma
	expressão e mostre um menu que permita o usuário escolher
	que operação realizar:
	[1] ADIÇÃO
	[2] SUBTRAÇÃO
	[3] MULTIPLICAÇÃO
	[4] ENTRAR COM NOVOS DADOS
	[5] SAIR
	Autora: Aylin
	Empresa: Guanabara
	*/

import java.util.Scanner;
public class Exercicio65 {

    public static void main(String[] args)throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        
        int operando1, operando2, opc = 0, resp = 0; 
        
    System.out.print(Cores.CYAN + "Operando 1: " + Cores.RESET);
    operando1 = sc.nextInt();
    System.out.print(Cores.PINK + "Operando 2: " + Cores.RESET);
    operando2 = sc.nextInt();

    while (opc != 5) {
        System.out.println(Cores.YELLOW + "======== ESCOLHA SUA OPÇÃO =========" + Cores.RESET);
        System.out.println(Cores.GREEN + "[1] ADIÇÃO" + Cores.RESET);
        System.out.println(Cores.GREEN + "[2] SUBTRAÇÃO" + Cores.RESET);
        System.out.println(Cores.GREEN + "[3] MULTIPLICAÇÃO" + Cores.RESET);
        System.out.println(Cores.GREEN + "[4] ENTRAR COM NOVOS DADOS" + Cores.RESET);
        System.out.println(Cores.GREEN + "[5] SAIR" + Cores.RESET);
        System.out.print(">>>>> Sua opção: ");
        opc = sc.nextInt();
    
        switch (opc) {
            case 1:
                resp = operando1 + operando2;
                System.out.println(Cores.YELLOW +"------------------------"+ Cores.RESET);
                System.out.printf("Calculando %d + %d = %d\n", operando1, operando2, resp);
                System.out.println(Cores.YELLOW +"------------------------"+ Cores.RESET);
                break;
            case 2:
                resp = operando1 - operando2;
                System.out.println(Cores.YELLOW +"------------------------"+ Cores.RESET);
                System.out.printf("Calculando %d - %d = %d\n", operando1, operando2, resp);
                System.out.println(Cores.YELLOW +"------------------------"+ Cores.RESET);
                break;
            case 3:
                resp = operando1 * operando2;
                System.out.println(Cores.YELLOW +"------------------------"+ Cores.RESET);
                System.out.printf("Calculando %d * %d = %d\n", operando1, operando2, resp);
                System.out.println(Cores.YELLOW +"------------------------"+ Cores.RESET);
                break;
            case 4:
                System.out.print(Cores.CYAN + "Operando 1: " + Cores.RESET);
                operando1 = sc.nextInt();
                System.out.print(Cores.PINK + "Operando 2: " + Cores.RESET);
                operando2 = sc.nextInt();
                break;
            case 5:
                System.out.println("======== Saindo ========");
                break;
            default:
                System.out.println(Cores.RED + "Opção inválida" + Cores.RESET);
                break;
        }
        Thread.sleep(2000);
    }
    System.out.println("======== Volte sempre ========");
    sc.close();
    }
}