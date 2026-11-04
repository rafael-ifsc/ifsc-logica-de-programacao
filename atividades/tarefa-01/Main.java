import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int atendimentos, tipoveiculo, tiposervico, contador;
        int veiculo1, veiculo2, veiculo3, servico1, servico2, servico3;
        double valor,total;
        String nomeCliente, descricaoVeiculo, descricaoServico;
        Scanner leia;

        leia = new Scanner(System.in);
        atendimentos =0;
        tipoveiculo =0;
        tiposervico =0;
        contador = 1;
        veiculo1 =0;
        veiculo2 =0;
        veiculo3 =0;
        servico1 =0;
        servico2 =0;
        servico3 =0;
        valor = 0.0;
        total = 0.0;
        nomeCliente = "";
        descricaoVeiculo = "";
        descricaoServico = "";

        System.out.print("Digite a quantidade de atendimentos: ");
        atendimentos = leia.nextInt();

        while (contador <= atendimentos) {
            System.out.println("\nAtendimento " + contador + ":");

            System.out.print("Nome do cliente: ");
                leia.nextLine();
                nomeCliente = leia.nextLine();

            System.out.println("\nDigite o tipo de veículo: ");
            System.out.println("1 - Pequeno (Popular)");
            System.out.println("2 - Médio (SUV e Picape)");
            System.out.println("3 - Grande (van e Micro-ônibus)");
            System.out.print(" [ Digite 1, 2 ou 3 ] ");
            tipoveiculo = leia.nextInt();

            while (tipoveiculo < 1 || tipoveiculo > 3) {
                System.out.print("Valor inválido! Digite 1, 2 ou 3: ");
                tipoveiculo = leia.nextInt();
            }

            System.out.println("\nServiços: ");
            System.out.println("1 - Lavação externa");
            System.out.println("2 - Lavação externa + interna");
            System.out.println("3 - Lavação externa + interna + cera");
            System.out.print(" [ Digite 1, 2 ou 3 ] ");
            tiposervico = leia.nextInt();

            while (tiposervico < 1 || tiposervico > 3) {
                System.out.print("Valor inválido! [ digite 1, 2 ou 3 ] ");
                tiposervico = leia.nextInt();
            }
            if (tipoveiculo == 1) {
                descricaoVeiculo = "Pequeno (Popular)";
                veiculo1++;
            }else {
                if (tipoveiculo == 2) {
                    descricaoVeiculo = "Médio (SUV e Picape)";
                    veiculo2++;
                } else {
                    descricaoVeiculo = "Grande (Van e Micro-ônibus)";
                    veiculo3++;
                }
            }
            if (tiposervico == 1) {
                descricaoServico = "Lavação externa";
                servico1++;
            }else {
                if (tiposervico == 2) {
                    descricaoServico = "Lavação externa + Interna";
                    servico2++;
                }else {
                    descricaoServico = "Lavação externa + Interna + Cera";
                    servico3++;
                }
            }
            if (tipoveiculo == 1) {
                if (tiposervico == 1) {
                    valor = 50;
                }else {
                    if (tiposervico == 2) {
                        valor = 70;
                    }else {
                        if (tiposervico == 3) {
                            valor = 90;
                        } else{
                            System.out.println("ERRO! Digite novamente! ");
                        }
                    }
                }
            } else {
                if (tipoveiculo == 2) {
                    if (tiposervico == 1) {
                        valor = 70;
                    } else {
                        if (tiposervico == 2) {
                            valor = 90;
                        } else {
                            if (tiposervico == 3) {
                                valor = 110;
                            } else {
                                System.out.println("ERRO! Tente novamente! ");
                            }
                        }
                    }
                } else {
                    if (tipoveiculo ==3) {
                        if (tiposervico == 1) {
                            valor = 90;
                        } else {
                            if (tiposervico == 2) {
                                valor = 110;
                            } else {
                                if (tiposervico == 3) {
                                    valor = 130;
                                } else {
                                    System.out.println("ERRO! Tente novamente! ");
                                }
                            }
                        }
                    }
                }
            System.out.println("Nome: " + nomeCliente);
            System.out.println("Categoria do veículo: " + descricaoVeiculo);
            System.out.println("Serviço: " + descricaoServico);
            System.out.println("Valor total R$ " + valor);
                total += valor;
                contador++;
            }
            System.out.println("Valor total arrecadado de hoje: R$ " + total);

            System.out.println("\nPercentual de veículos :");
            System.out.printf("Pequeno (Popular): %.1f%%\n", (veiculo1 *100.0/atendimentos));
            System.out.printf("Médio (SUV e Picape): %.1f%%\n", (veiculo2 *100.0/atendimentos));
            System.out.printf("Grande (Van e Micro-ônibus): %.1f%%\n", (veiculo3 *100.0/atendimentos));

            System.out.println("\nPercentual por tipo de serviço:");
            System.out.printf("Serviço 1: %.1f%%\n", (servico1 *100.0/atendimentos));
            System.out.printf("Serviço 2: %.1f%%\n", (servico2 *100.0/atendimentos));
            System.out.printf("Serviço 3: %.1f%%\n", (servico3 *100.0/atendimentos));
        }
    }
}