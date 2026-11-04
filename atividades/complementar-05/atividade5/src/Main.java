import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i;
        double categoriaa, categoriab, categoriac, percentuala, percentualb, percentualc, maioraltura, altura, somaalturas;
        double media;
        String nome, maisalto = "";
        String[] nomes;
        int[] alturas;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de jogadores: ");
        n = input.nextInt();
        nomes = new String[n];
        alturas = new int[n];

        for (i = 0; i < n; i++) {
            System.out.println("Dados do Jogador " + (i +1));
            System.out.print("Nome: ");
            nomes[i] = input.next();

            System.out.print("Altura use a unidade [centímetros]: ");
            alturas[i] = input.nextInt(); // entrada em cm
        }
        somaalturas =0;
        maioraltura =0;
        categoriaa =0;
        categoriab =0;
        categoriac =0;

        for (i =0; i < n; i++) {
            altura = alturas[i];
            nome = nomes[i];
            somaalturas = somaalturas + altura;

            if (altura >=210) { // em cm
                System.out.println("O jogador " + nome + " pertence à Categoria A. ");
                categoriaa = categoriaa +1;
            } else {
                if (altura >=190) {
                    System.out.println("O jogador " + nome + " pertence à Categoria B. ");
                    categoriab = categoriab +1;
                } else {
                    System.out.println("O jogador " + nome + " pertence à Categoria C. ");
                    categoriac = categoriac +1;
                }
            } if (altura > maioraltura) {
                maioraltura = altura;
                maisalto = nome;
            }
        }
        media = (somaalturas/n);
        percentuala = (categoriaa*100) /n;
        percentualb = (categoriab*100) /n;
        percentualc = (categoriac*100) /n;

        for (i = 0; i < n; i++) {
            System.out.printf(nomes[i], (alturas[i]/100) );
        }

        System.out.printf("A média da altura do time é ", + (media/100) + "m" );
        System.out.println("Percentual de jogadores na categoria A: " + percentuala + "%");
        System.out.println("Percentual de jogadores na categoria B: " + percentualb + "%");
        System.out.println("Percentual de jogadores na categoria C: " + percentualc + "%");
        System.out.println("Jogadores com 2 metros ou mais: ");
        for (i = 0; i < n; i++) {
            if (alturas[i] >= 200) {
                System.out.printf(nomes[i], (alturas[i]/100) );
            }
        }
        System.out.println("Jogador mais alto: " + maisalto);
        System.out.printf("Jogador mais alto: %s com %.2fm ", maisalto, (maioraltura /100) );
    }
}