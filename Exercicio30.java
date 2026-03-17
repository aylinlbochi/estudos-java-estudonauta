/* Faça um programa que receba dois números e execute as seguintes operações:
1 - Média entre os números digitados
2 - Diferença do maior pelo menor
3 - Produto entre os números digitados
4 - Divisão do primeiro pelo segundo.
Se a opção digitada for inválida mostre uma mensagem de erro e 
termine a execução do programa. Lembre-se de que, na operação 4,
o segundo número deve ser diferente de zero.
*/

import java.util.Scanner;
public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double number_1, number_2;
        System.out.print("Digite um número: ");
        number_1 = sc.nextDouble();
        System.out.print("Digite um outro número: ");
        number_2 = sc.nextDouble();
        
        int opcao;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("ESCOLHA UMA OPÇÃO");
        System.out.println("1 - Média entre os números digitados");
        System.out.println("2 - Diferença do maior pelo menor");
        System.out.println("3 - Produto entre os números digitados");
        System.out.print("4 - Divisão do primeiro pelo segundo: ");
        opcao = sc.nextInt();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        
        switch (opcao) {
            case 1:
                double media = (number_1 + number_2) / 2;
                System.out.println("A média entre " + number_1 + 
                " e "+ number_2 + " é " + media );
                break;
            case 2:
                if(number_1 > number_2){
                    System.out.println("A diferença entre "+ number_1 + " e "+ number_2 + " é " + (number_1 - number_2));
                }else{
                    System.out.println("A diferença entre "+ number_2 + " e "+ number_1 + " é " + (number_2 - number_1));
                }
                break;
            case 3:
                double multi = number_1 * number_2;
                System.out.println("O Produto é " + multi);
                break;
            case 4:
                if (number_2 != 0){
                    double divi = number_1 / number_2;
                System.out.println("A divisão de "+ number_1+ " e " + number_2 + " é "+ divi);
                }else{
                    System.out.println("Erro: Não é possível dividir por zero");
                }
                
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
                break;
        }
        sc.close();
        
    }     
}