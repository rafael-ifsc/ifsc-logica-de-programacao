import java.util.Scanner;

void main (){

    String nome;
    Scanner input = new Scanner(System.in);

    IO.println("Digite seu nome: ");
    nome = input.next();

    IO.println("Bem vindo "+nome);

}