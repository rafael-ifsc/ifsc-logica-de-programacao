import java.util.Scanner; // Erro 2 corrigido: Importando a classe Scanner

public class Main1 { // Adicionado: Todo código Java precisa estar dentro de uma classe

    public static void main(String[] args) { // Erro 1 corrigido: Assinatura correta do método main

        // Solicite o número de alunos
        // Para cada aluno leia o nome, nota 1 e nota 2
        // Para cada aluno mostre a média e informe se foi aprovado ou não
        // No final mostre a média da sala
        // Adicione neste programa um contador para numero de alunos aprovados e um para
        // numero de alunos reprovados

        int numeroAlunos, nota1, nota2;
        double mediaAluno, mediaSala = 0;
        String nomeAluno;

        int alunosAprovados = 0;
        int alunosReprovados = 0;

        Scanner input = new Scanner(System.in);

        // Erro 3 corrigido: Trocando IO.print por System.out.print
        System.out.print("Digite o número de alunos: ");
        numeroAlunos = input.nextInt();

        for (int i = 0; i < numeroAlunos; i++) {
            System.out.print("Digite o nome do aluno: ");
            nomeAluno = input.next();
            System.out.print("Digite a 1 nota do aluno: ");
            nota1 = input.nextInt();
            System.out.print("Digite a 2 nota do aluno: ");
            nota2 = input.nextInt();

            mediaAluno = (double) (nota1 + nota2) / 2;

            if (mediaAluno >= 6) {
                // Erro 3 corrigido: Usando System.out.println
                System.out.println(nomeAluno + " Aprovado com media " + mediaAluno);
                alunosAprovados++; // Incrementa o contador de aprovados
            } else {
                System.out.println(nomeAluno + " Reprovado com media " + mediaAluno);
                alunosReprovados++; // Incrementa o contador de reprovados
            }
            mediaSala += mediaAluno;
        }

        // Evita divisão por zero se o número de alunos for 0
        if (numeroAlunos > 0) {
            mediaSala = mediaSala / numeroAlunos;
            System.out.println("A media da sala foi " + mediaSala);
        }

        // Mostrando os resultados dos contadores
        System.out.println("Total de alunos aprovados: " + alunosAprovados);
        System.out.println("Total de alunos reprovados: " + alunosReprovados);
    }
}