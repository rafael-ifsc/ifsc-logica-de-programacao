void MediaAlunos() {
    // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the
    // highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    // Temos 20 alunos na aula de LPR
    // Temos 3 atividades avaliativas na unidade curricular de LPR
    // Faça um programa para armazenar as 3 notas e a media final de cada aluno em
    // uma matriz

    int numAlunos;
    int numAtividades;

    Scanner input = new Scanner(System.in);

    IO.print("Informe o número de alunos: ");
    numAlunos = input.nextInt();
    IO.print("Informe o número de atividades avaliativas: ");
    numAtividades = input.nextInt();

    int[][] notasAlunos = new int[numAlunos][numAtividades + 1];

    for (int i = 0; i < numAlunos; i++) {
        IO.println("Avaliação do aluno " + (i + 1));
        double mediaAluno = 0;
        for (int j = 0; j < numAlunos; j++) {
            IO.print("Digite a nota do aluno " + (i + 1) + " na atividade " + (j + 1) + ": ");
            notasAlunos[i][j] = input.nextInt();
            mediaAluno += notasAlunos[i][j];
        }
        mediaAluno = mediaAluno / numAtividades;
        notasAlunos[i][numAtividades] = (int) mediaAluno;
        IO.println("Média final do aluno " + (i + 1) + "=" + mediaAluno);
        IO.println();
    }
}