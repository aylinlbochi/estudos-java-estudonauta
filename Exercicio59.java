/*Faça um programa que receba a idade, o peso, a altura, a cor dos olhos
(A - azul; P - preto; V - verde e C - castanho) e a cor dos cabelos
(P - preto; C - castanho; L louro; e R - ruivo) de seis pessoas, e que
calcule e mostre;
- A quantidade de pessoas com idade superior a 50 anos e peso
inferior a 60kg;
- A média de idades das pessoas com altura inferior a 1,50;
- A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas;
- A quantidade de pessoas ruivas e que não possuem olhos azuis.
Autora: Aylin
Empresa: 
 */
import java.util.Scanner;
public class Exercicio59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade,cont = 0, contAzul = 0, contRuivo = 0, somaIdade = 0, contAltura = 0;
        double peso, altura = 0;
        char corCabelo, corOlhos;
        System.out.println(Cores.RED + "PARA AS CORES DOS OLHOS E CABELOS SIGAM O SEGUINTE CÓDIGO: "+ Cores.RESET);
        System.out.println(Cores.RED +"A - azul; P - preto; V - verde e C - castanho"+ Cores.RESET);
        System.out.println(Cores.RED +"P - preto; C - castanho; L louro; e R - ruivo"+ Cores.RESET);
        System.out.println(Cores.YELLOW + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=" + Cores.RESET );
        
        for(int i = 1; i <= 6; i++){
            System.out.print(Cores.PINK + "Idade: " + Cores.RESET);
            idade = sc.nextInt();
            System.out.print(Cores.GREEN + "Peso: Kg " + Cores.RESET);
            peso = sc.nextDouble();
            System.out.print(Cores.CYAN + "Altura: " + Cores.RESET);
            altura = sc.nextDouble();
            System.out.print(Cores.PURPLE + "Cor dos olhos: " + Cores.RESET);
            corOlhos = sc.next().toUpperCase().charAt(0);
            System.out.print(Cores.YELLOW + "Cor dos cabelos: " + Cores.RESET);
            corCabelo = sc.next().toUpperCase().charAt(0);

            if(idade > 50 && peso < 60){
                cont++;
            }
            if(altura < 1.50){
                somaIdade += idade;
                contAltura++;
            }
            if(corOlhos == 'A'){
                contAzul++;
            }
            if(corCabelo == 'R' && corOlhos != 'A'){
                contRuivo++;
            }
        }
        System.out.println(Cores.YELLOW + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" + Cores.RESET);
        if(contAltura > 0){
            double media = (double)somaIdade / contAltura;
            System.out.println("A média de idades das pessoas com altura inferior a 1.50 é de " + media);
        }
        else{
            System.out.println(Cores.RED + "Não houve pessoas com altura inferior à 1.50 " + Cores.RESET);
        }
        double porcentagem = (contAzul * 100.0) / 6;
        System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso\r\n" +
                        "inferior a 60kg é de " + cont);
        System.out.println("A porcentagem de pessoas com olhos azuis entre todas as pessoas\r\n" +
        "analisadas é de "+ porcentagem + "%");
        System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis é de " + contRuivo);
        System.out.println(Cores.YELLOW + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-" + Cores.RESET);
        sc.close();
    }
}
