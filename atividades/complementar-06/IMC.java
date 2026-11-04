import java.util.Scanner;

public class IMC {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            double peso, alt, vlrIMC;

        mensagem("Olá! Bem-vindo ao aplicativo Saúde e Bem Estar! \nEntre com os dados para o cálculo do IMC:"); // Completar o procedimento 'mensagem' abaixo

        System.out.print("\nInforme o peso corporal (em kg: 72,5 por exemplo): ");
        peso = leia.nextDouble();
        System.out.print("Informe a altura (em metros: 1,77 por exemplo)   : ");
        alt = leia.nextDouble();

        vlrIMC = calculaIMC(peso, alt); // Completar a função 'IMC' abaixo

        System.out.println("\nResultados...:");
        System.out.printf("IMC: %.3f\n", vlrIMC);
        System.out.printf("Classificação: %s \n", interpretaIMC(vlrIMC)); // Completar a função 'interpretaIMC' abaixo

        mensagem("\nO programa será finalizado!"); // Aproveitando o procedimento 'mensagem' utilizado na linha 7
    }

    // Complete o procedimento 'mensagem'. Falta o parâmetro e o(s) comando(s)
    // interno(s).
    public static void mensagem(String texto) {
        System.out.println(texto);
    }

    // Complete a função 'IMC'. Faltam os parâmetros peso e alt e o(s) comando(s)
    // interno(s) para cálculo do IMC (peso/(alt*alt)).
    public static double calculaIMC(double peso, double alt){
        double resultado;
        resultado = peso/(alt*alt);
        return resultado;
    }

    // Complete a função 'interpretaIMC'. Falta o parâmetro que deve ser o valor do
    // IMC (vlrIMC) e a estrutura de seleção que deverá escolher uma das mensagens
    // abaixo:
    // "abaixo do peso normal": para IMC < 18.5;
    // "peso normal": para IMC >= 18.5 e < 25;
    // "acima do peso": para IMC >= 25 e < 30;
    // "obesidade grau I": para IMC >= 30 e < 35;
    // "obesidade grau II": para IMC >= 35 e < 40;
    // "obesidade grau III": para IMC >= 40.
    public static String interpretaIMC(double vlrIMC) {
        String classificacao;

        if (vlrIMC < 18.5) {
            classificacao = "Abaixo do peso normal";
        } else {
            if (vlrIMC < 25) {
                classificacao = "Peso normal";
            } else {
                if (vlrIMC < 30) {
                    classificacao = "Acima do peso";
                } else {
                    if (vlrIMC < 35) {
                        classificacao = "Obesidade grau I";
                    } else {
                        if (vlrIMC < 40) {
                            classificacao = "Obesidade grau II";
                        } else {
                            classificacao = "Obesidade grau III";
                        }
                    }
                }
            }
        }
    return classificacao;
    }
}