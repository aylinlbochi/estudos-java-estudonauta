/*Faça um programa que verifique a validade de uma senha fornecida
pelo usuário. A senha é 4531.O programa deve mostrar uma mensagem de 
permissão de acesso ou não.
 */
import java.util.Scanner;
public class Exercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("    BANCO CAPIVARA, SEU DINHEIRO VALE OURO!! ");
    System.out.println("-----------------------------------------------");
        int senha;
        String login;
        System.out.print("Digite seu e-mail ou nome de usuário: ");
        login = sc.nextLine();
        
        if(login.equals("admin.admin@fake.com")){
            System.out.print("Digite sua senha: ");
            senha = sc.nextInt();
            if(senha == 4531){
            System.out.println("Bem vindo a sua conta!!");
            }else{
            System.out.println("Senha inválida, tente novamente.");
            }
        }else if(login.toLowerCase().equals("adminramos")){
            System.out.print("Digite sua senha: ");
            senha = sc.nextInt();
            if(senha == 4531){
            System.out.println("Bem vindo a sua conta!!");
            }else{
            System.out.println("Senha inválida, tente novamente.");
            }
        }else{
            System.out.println("Usuário ou e-mail invalido, tente novamente");
        }
        sc.close();
    }
}
