/* Faça um programa que receba a idade de oito pessoa, calcule e mostre:
a) A quantidade de pessoas em cada faixa etária.
b) A porcentagem de pessoas na primeira faixa etária.
c) A porcentagem de pessoas na última faixa etária com 
relação ao total de pessoas.
| FAIXA ETÁRIA |     IDADE       |
|--------------|----------------:|
|      1ª      | Até 15 anos     |
|      2ª      | De 16 a 30 anos |
|      3ª      | De 31 a 45 anos |
|      4ª      | De 46 a 60 anos |
|      5ª      | Acima de 60 anos|
Empresa:
Autora: Aylin
 */
import java.util.Scanner;
public class Exercicio49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("\n         CENSO AGETRACKER");
    System.out.println("-------------------------------------------");
    int cont = 0;
    int fxetaria_1 = 0, fxetaria_2 = 0, fxetaria_3 = 0;
    int fxetaria_4 = 0, fxetaria_5 = 0;
    double porc = 0, porc1 = 0;

        while (cont < 8) {
            int idade;
            System.out.print("Quantos anos você tem? ");
            idade = sc.nextInt();
            cont ++;
        if(idade <= 15){
            fxetaria_1 ++;
        }
        else if (idade <= 30){
            fxetaria_2 ++;
        }
        else if(idade <= 45){
            fxetaria_3 ++;
        }
        else if(idade <= 60){
            fxetaria_4 ++;
        }
        else{
            fxetaria_5 ++;
        }
        }
        porc= (fxetaria_1 * 100.0) / 8;
        porc1 = (fxetaria_5 * 100.0) / 8;
        
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("A quantidade de pessoas até 15 anos é de  " + fxetaria_1);
        System.out.println("A quantidade de pessoas até 30 anos é de  " + fxetaria_2);
        System.out.println("A quantidade de pessoas até 45 anos é de  " + fxetaria_3);
        System.out.println("A quantidade de pessoas até 60 anos é de  " + fxetaria_4);
        System.out.println("A quantidade de pessoas acima de 60 anos é de  " + fxetaria_5);
        System.out.println("Porcentagem de pessoas até 15 anos " + porc + "%");
        System.out.println("Porcentagem de pessoas acima de 60 anos " + porc1 + "%");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        sc.close();
    }
}
