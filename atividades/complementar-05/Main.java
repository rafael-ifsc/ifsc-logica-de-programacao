import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i;
        double categoriaa, categoriab, categoriac, percentuala, percentualb, percentualc, maioraltura, altura, somaalturas, media;
        String nome, maisalto = "";
        String[] nomes;
        int[] alturas;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de jogadores: ");
        n = input.nextInt();
        nomes = new String[n];
        alturas = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("Dados do Jogador " + (i + 1));
            System.out.print("Nome: ");
            nomes[i] = input.next();

            System.out.print("Altura [use a unidade centímetros]: ");
            alturas[i] = input.nextInt();
        }
        somaalturas = 0;
        maioraltura = 0;
        categoriaa = 0;
        categoriab = 0;
        categoriac = 0;
        maisalto = "";

        for (i = 0; i < n; i++) {
            altura = alturas[i];
            nome = nomes[i];
            somaalturas = somaalturas + altura;

            if (altura >= 210) {
                System.out.println("O jogador " + nome + " pertence à Categoria A. ");
                categoriaa = categoriaa + 1;
            } else {
                if (altura >= 190) {
                    System.out.println("O jogador " + nome + " pertence à Categoria B. ");
                    categoriab = categoriab + 1;
                } else {
                    System.out.println("O jogador " + nome + " pertence à Categoria C. ");
                    categoriac = categoriac + 1;
                }
            }
            if (altura > maioraltura) {
                maioraltura = altura;
                maisalto = nome;
            }
        }
        media = (somaalturas / n);
        percentuala = ((categoriaa * 100) / n);
        percentualb = ((categoriab * 100) / n);
        percentualc = ((categoriac * 100) / n);

        for (i = 0; i < n; i++) {
            System.out.printf("%s: %.2fm%n", nomes[i], (alturas[i] / 100.0));
        }
        System.out.printf("\nA média da altura do time é %.2fm%n", (media / 100.0));

        System.out.printf("Percentual de jogadores na categoria A: %.1f%%%n", percentuala);
        System.out.printf("Percentual de jogadores na categoria B: %.1f%%%n", percentualb);
        System.out.printf("Percentual de jogadores na categoria C: %.1f%%%n", percentualc);

        System.out.println("\nJogadores com 2 metros ou mais: ");
            for (i = 0; i < n; i++) {
                if (alturas[i] >= 200) {
                    System.out.printf("- %s: %.2fm%n", nomes[i], (alturas[i] / 100.0));
                }
            }
        System.out.printf("\nA maior altura registrada foi: %.2fm%n", (maioraltura / 100.0));

        System.out.print("O jogador mais alto se chama: ");
                for (i = 0; i < n; i++) {
            if (alturas[i] == maioraltura) {
                System.out.println("- " + nomes[i]);
            }
        }
    }
}