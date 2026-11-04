void main() {

    //Solicite o número de alunos
    //Para cada aluno leia o nome, nota 1 e nota 2
    //Para cada aluno mostre a média e informe se foi aprovado ou não
    //No final mostre a média da sala
    //Adicione neste programa um contador para numero de alunos aprovados e um para numero de alunos reprovados

    int numeroAlunos, nota1, nota2;
    double mediaAluno, mediaSala=0;
    String nomeAluno;

    Scanner input = new Scanner(System.in);

    IO.print("Digite o número de alunos: ");
    numeroAlunos = input.nextInt();

    for(int i=0; i<numeroAlunos; i++){
        IO.print("Digite o nome do aluno: ");
        nomeAluno = input.next();
        IO.print("Digite a 1 nota do aluno: ");
        nota1 = input.nextInt();
        IO.print("Digite a 2 nota do aluno: ");
        nota2 = input.nextInt();
        mediaAluno = (double) (nota1 + nota2) /2;
        if(mediaAluno>=6){
            IO.println(nomeAluno+" Aprovado com media "+mediaAluno);
        }else{
            IO.println(nomeAluno+" Reprovado com media "+mediaAluno);
        }
        mediaSala+=mediaAluno;
    }

    mediaSala = mediaSala/numeroAlunos;
    IO.println("A media da sala foi "+mediaSala);

}