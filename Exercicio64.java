/*Ex:039: Faça um programa que leia vários números (O valor 9999 faz o programa parar)
	no final de tudo, mostre na tela: 
	- Quantos valores foram digitados.
	- A soma entre eles
	- A média dos valores
	- Qual foi o maior valor digitado.
	OBS: Não considere nunca o FLAG como parte dos dados.
	Autora: Aylin
	Empresa: Estudonauta.
	*/
import java.util.Scanner;
public class Exercicio64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0, cont = 0, soma = 0, maior = 0;
        double media = 0.0;
        System.out.println(Cores.RED + "PARA PARAR DIGITE 9999" + Cores.RESET);

        while (numero != 9999) {
            System.out.println(Cores.YELLOW + "---------------------------------------" + Cores.RESET);
            System.out.println((cont + 1) + "ª valor");
            System.out.println(Cores.YELLOW + "---------------------------------------" + Cores.RESET);
            System.out.print("Número: ");
            numero = sc.nextInt();
            if(numero != 9999){
                soma += numero;
                    if(cont == 0){
                        maior = numero;
                    }
                    else{
                        if(numero > maior){
                            maior = numero;
                        }
                    }
                cont++;
            }
            
        }
        media = (double) soma / cont;
        System.out.println(Cores.YELLOW + "===========FLAG DIGITADO============" + Cores.RESET);
        System.out.println(Cores.CYAN + "Ao todo você digitou "+ cont+" valores." + Cores.RESET);
        System.out.println(Cores.GREEN + "A soma entre eles foi "+ soma + Cores.RESET);
        System.out.printf("E a média foi %.2f\n", media);
        System.out.println(Cores.PURPLE+ "O maior valor digitado foi "+ maior + Cores.RESET);
        sc.close();
    }
}
