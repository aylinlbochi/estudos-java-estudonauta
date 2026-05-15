/*Uma loja utiliza o código V para transação a vista
e P para transação a prazo. Faça um programa que receba
o código e o valor de quinze transações, calcule e mostre:
- O valor total das compras à vista;
- O valor total das compras a prazo;
- O valor total das compras efetuadas;
- E o valor da primeira prestação a prazo juntas,
sabendo-se que serão pagas em três vezes.
Autora: Aylin
Empresa: 
 */
import java.util.Scanner;

public class Exercicio57 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Cores.CYAN + "\tSISTEMA FINANCEIRO CAPIVARA"+Cores.RESET);
        System.out.println(Cores.YELLOW + "----------------------------------------------------"+Cores.RESET);
        System.out.println(Cores.RED + "V = PAGAMENTOS À VISTA, P = PAGAMENTOS A PRAZO"+ Cores.RESET);
        System.out.println(Cores.RED + "PAGAMENTOS A PRAZO SÃO PARCELADOS SOMENTE EM 3 VEZES"  + Cores.RESET);
        System.out.println(Cores.YELLOW + "----------------------------------------------------"+Cores.RESET);
        
        char codigo ;
        double valor, valorAprazo = 0, valorAvista = 0;

        for(int cont = 1; cont <= 15; cont++){
            System.out.print(Cores.PINK + "Qual o código do pagamento? "+ Cores.RESET);
            codigo = sc.next().toUpperCase().charAt(0);
            
            while (codigo != 'V' && codigo != 'P') {
                System.out.println(Cores.RED + "CÓDIGO INVÁLIDO! DIGITE V OU P" + Cores.RESET);
                System.out.print(Cores.PINK + "Qual o código do pagamento? "+ Cores.RESET);
                codigo = sc.next().toUpperCase().charAt(0);
            }
            
            
            System.out.print(Cores.GREEN + "Qual o valor da compra? " + Cores.RESET);
            valor = sc.nextDouble();
        
            switch (codigo) {
                case 'V':
                
                    valorAvista += valor  ;
                    
                    break;
                
                case 'P':
                    
                    valorAprazo += valor;
                
                    break;
                
            }
        }
        System.out.println(Cores.YELLOW + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-"+Cores.RESET);
        double tot = valorAvista + valorAprazo;
        double prestacao = valorAprazo / 3;
        System.out.printf( "O total à vista foi de %.2f\n" ,valorAvista);
        System.out.printf( "O total à prazo foi de %.2f\n" ,valorAprazo);
        System.out.printf( "O total das compras foi de %.2f\n", tot);
        System.out.printf( "O valor da primeira prestação é de  %.2f\n", prestacao);
        sc.close();
    }
}