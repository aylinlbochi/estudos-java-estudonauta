/*Faça um programa que mostre as tabuadas dos números
de 1 a 10.
 */
public class Exercicio53 {
    public static void main(String[] args) {
        System.out.println("TABUADA DO 1 AO 10 ");
    
        for(int cont = 1; cont <= 10; cont ++){
        System.out.println("-------------------------");
            for(int tot = 1; tot <= 10; tot ++){
                int multi = cont * tot; //Eu usei multi como abreviação de multiplicação.
                System.out.printf("%d X %d = %d\n",cont,tot, multi);
            }
        }
        System.out.println("-------------------------");
    }
}
