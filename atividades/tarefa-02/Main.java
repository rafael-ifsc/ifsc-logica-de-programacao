import java.util.Scanner;

public class Main {

    public static String obterDescricaoVeiculo(int tipo) {
        if (tipo == 1) return "Pequeno (Popular)";
        if (tipo == 2) return "Médio (SUV e Picape)";
        if (tipo == 3) return "Grande (Van e Micro-ônibus)";
        return "Desconhecido";
    }

    public static String obterDescricaoServico(int tipo) {
        if (tipo == 1) return "Lavação externa";
        if (tipo == 2) return "Lavação externa + interna";
        if (tipo == 3) return "Lavação externa + interna + cera";
        return "Desconhecido";
    }

    public static void main(String[] args) {

        int atendimentos, tipoveiculo, tiposervico, contador;
        int veiculo1, veiculo2, veiculo3, servico1, servico2, servico3;
        double valor, total;
        String nomecliente;
        Scanner leia;
        String[] nomes;
        int[] v_tipoveiculo;
        int[] v_tiposervico;
        double[] valores;

        double[][] tabelaprecos = {
            {50.0, 70.0, 90.0},
            {70.0, 90.0, 110.0},
            {90.0, 110.0, 130.0}
        };

        int maiorQtdVeiculo, maiorQtdServico;
        int tipoFiltro;

        leia = new Scanner(System.in);
        atendimentos = 0;
        tipoveiculo = 0;
        tiposervico = 0;
        contador = 0;
        veiculo1 = 0;
        veiculo2 = 0;
        veiculo3 = 0;
        servico1 = 0;
        servico2 = 0;
        servico3 = 0;
        valor = 0.0;
        total = 0.0;
        nomecliente = "";

        System.out.print("Informe a quantidade de atendimentos: ");
        atendimentos = leia.nextInt();

        nomes = new String[atendimentos];
        v_tipoveiculo = new int[atendimentos];
        v_tiposervico = new int[atendimentos];
        valores = new double[atendimentos];

        while (contador < atendimentos) {
            System.out.println("\nAtendimento " + (contador + 1) + ":");

            System.out.print("Nome do cliente: ");
            leia.nextLine();
            nomecliente = leia.nextLine();
            nomes[contador] = nomecliente;

            System.out.println("\nInforme o tipo de veículo: ");
            System.out.println("1 - Pequeno [ Popular ]");
            System.out.println("2 - Médio [ SUV e Picape ]");
            System.out.println("3 - Grande [ Van e Micro-ônibus ]");
            System.out.print(" [ Digite 1, 2 ou 3 ] ");
            tipoveiculo = leia.nextInt();

            while (tipoveiculo < 1 || tipoveiculo > 3) {
                System.out.println("Valor inválido! Tente novamente.");
                tipoveiculo = leia.nextInt();
            }
            v_tipoveiculo[contador] = tipoveiculo;

            if (tipoveiculo == 1) veiculo1++;
            else if (tipoveiculo == 2) veiculo2++;
            else veiculo3++;

            System.out.println("\nServiços: ");
            System.out.println("1 - Lavação externa");
            System.out.println("2 - Lavação externa + interna");
            System.out.println("3 - Lavação externa + interna + cera");
            System.out.print(" [ Digite 1, 2 ou 3 ] ");
            tiposervico = leia.nextInt();

            while (tiposervico < 1 || tiposervico > 3) {
                System.out.println("Valor inválido! Tente novamente.");
                tiposervico = leia.nextInt();
            }
            v_tiposervico[contador] = tiposervico;

            if (tiposervico == 1) servico1++;
            else if (tiposervico == 2) servico2++;
            else servico3++;

            valor = tabelaprecos[tipoveiculo - 1][tiposervico - 1];
            valores[contador] = valor;

            System.out.println("Nome: " + nomecliente);
            System.out.println("Categoria do veículo: " + obterDescricaoVeiculo(tipoveiculo));
            System.out.println("Serviço: " + obterDescricaoServico(tiposervico));
            System.out.println("Valor total R$ " + valor);

            total += valor;
            contador++;
        }

        System.out.println("\n=== RELAÇÃO GERAL DOS CLIENTES ===");
        for (int i = 0; i < atendimentos; i++) {
            System.out.println("Cliente: " + nomes[i] + " | Veículo: " + obterDescricaoVeiculo(v_tipoveiculo[i]) +
            " | Serviço: " + obterDescricaoServico(v_tiposervico[i]) + " | Valor: R$ " + valores[i]);
        }

        System.out.println("\nValor total arrecadado de hoje: R$ " + total);

        System.out.println("\nPercentual dos tipos de veículos:");
                System.out.printf("Pequeno: %.1f%%\n", (veiculo1 * 100.0 / atendimentos));
        System.out.printf("Médio: %.1f%%\n", (veiculo2 * 100.0 / atendimentos));
        System.out.printf("Grande: %.1f%%\n", (veiculo3 * 100.0 / atendimentos));

        System.out.println("\nPercentual por tipos de serviços:");
        System.out.printf("Serviço 1: %.1f%%\n", (servico1 * 100.0 / atendimentos));
        System.out.printf("Serviço 2: %.1f%%\n", (servico2 * 100.0 / atendimentos));
        System.out.printf("Serviço 3: %.1f%%\n", (servico3 * 100.0 / atendimentos));

        maiorQtdVeiculo = veiculo1;
        if (veiculo2 > maiorQtdVeiculo) maiorQtdVeiculo = veiculo2;
        if (veiculo3 > maiorQtdVeiculo) maiorQtdVeiculo = veiculo3;

        System.out.println("\nTipo(s) de veículo mais atendido(s):");
        if (veiculo1 == maiorQtdVeiculo) System.out.println("- Pequeno (Popular)");
        if (veiculo2 == maiorQtdVeiculo) System.out.println("- Médio (SUV e Picape)");
        if (veiculo3 == maiorQtdVeiculo) System.out.println("- Grande (Van e Micro-ônibus)");

        maiorQtdServico = servico1;
        if (servico2 > maiorQtdServico) maiorQtdServico = servico2;
        if (servico3 > maiorQtdServico) maiorQtdServico = servico3;

        System.out.println("\nTipo(s) de serviço mais atendido(s):");
        if (servico1 == maiorQtdServico) System.out.println("- Lavação externa");
        if (servico2 == maiorQtdServico) System.out.println("- Lavação externa + interna");
        if (servico3 == maiorQtdServico) System.out.println("- Lavação externa + interna + cera");

        System.out.print("Digite o tipo para filtrar [1, 2, 3 ]: ");
        tipoFiltro = leia.nextInt();

        System.out.println("Clientes com veículo tipo " + obterDescricaoVeiculo(tipoFiltro) + ":");
        for (int i = 0; i < atendimentos; i++) {
            if (v_tipoveiculo[i] == tipoFiltro) {
                System.out.println("- " + nomes[i] + " | Valor: R$ " + valores[i]);
            }
        }
    }
}