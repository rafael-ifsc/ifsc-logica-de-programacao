import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nota1, nota2, media, numeroFaltas, maximoFaltas;
        Scanner input = new Scanner(System.in);

        System.out.println("Iniciando o programa!");

        System.out.println("Digite a nota na primeira atividade: ");
        nota1 = input.nextInt();
        System.out.println("Digite a nota na segunda atividade: ");
        nota2 = input.nextInt();
        System.out.println("Digite quantas faltas o estudante teve: ");
        numeroFaltas = input.nextInt();

        maximoFaltas = (120*25)/100; //maximoFaltas = 30

        media = (nota1 + nota2) / 2;

        //media = 7, numeroFaltas = 10 -> Aluno aprovado com media 7! Fim do Programa
        //media = 7, numeroFaltas = 40 -> Aluno reprovado por faltas (40)! Fim do Programa
        //media = 5, numeroFaltas = 20 -> Aluno reprovado por média (5)! Fim do Programa
        //media = 2, numeroFaltas = 80 -> Aluno reprovado por média (2) e por faltas (80)! Fim do programa

        if (media >= 6 && numeroFaltas<=maximoFaltas) {
            System.out.println("Aluno Aprovado com média " + media + "!");
        } else {
            if(media>=6){
                System.out.println("Aluno reprovado por faltas ("+numeroFaltas+")!");
            }else{
                if(numeroFaltas<=maximoFaltas){
                    System.out.println("Aluno reprovado por média ("+media+")!");
                }else {
                    System.out.println("Aluno reprovado por média ("+media+") e por faltas ("+numeroFaltas+")!");
                }
            }
        }

        // Aprovado
        // Reprovado por nota
        // Reprovado por frequencia
        // Reprovado por nota e frequencia

        System.out.println("Fim do programa!");
    }

}