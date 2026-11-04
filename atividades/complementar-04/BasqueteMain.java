import java.util.Scanner;

public class BasqueteMain {

    public static void main(String[] args) {

        int n, i;
        double categoriaa, categoriab, categoriac, percentuala, percentualb, percentualc;
        double altura, somaalturas, maioraltura, media;
        String nome, maisalto;

        Scanner input = new Scanner(System.in);

        somaalturas = 0;
        maioraltura = 0;
        categoriaa = 0;
        categoriab = 0;
        categoriac = 0;
        maisalto = "";

        System.out.print("Digite a quantidade jogadores: ");
        n = input.nextInt();

        for (i=1; i <= n; i++) {
            System.out.println("");

            System.out.print("Nome: ");
            nome = input.next();
            System.out.print("Altura (em cm): ");
            altura = input.nextDouble();

            somaalturas = somaalturas + altura;

        if (altura >= 210) {
            System.out.println("O jogador '"+nome+"' pertence à Categoria A.");
            categoriaa = categoriaa + 1;
        } else {
            if (altura >= 190) {
                System.out.println("O jogador '"+nome+"' pertence à Categoria B.");
                categoriab = categoriab + 1;
            } else {
            System.out.println("O jogador '"+nome+"' pertence à Categoria C.");
            categoriac = categoriac + 1;
            }
        }
            if (altura > maioraltura) {
                maioraltura = altura;
                maisalto = nome;
            }
        }

        media = somaalturas / n;
        percentuala = (categoriaa*100)/n;
        percentualb = (categoriab*100)/n;
        percentualc = (categoriac*100)/n;

        System.out.println("Média da altura do time: "+media);
        System.out.println("Jogador mais alto se chama: " + maisalto + " com "+maioraltura+"cm");
        System.out.println("Percentual de jogadores na categoria A: "+percentuala+"%");
        System.out.println("Percentual de jogadores na categoria B: "+percentualb+"%");
        System.out.println("Percentual de jogadores na categoria C: "+percentualc+"%");

    }
}