import java.util.Scanner;

public class AtividadeTriangulos {

        public static void main(String[] args) {

        int lado1, lado2, lado3;

        Scanner medida = new Scanner(System.in);

        System.out.println("Digite o tamanho do primeiro lado: ");
        lado1 = medida.nextInt();

        System.out.println("Digite o tamanho do segundo lado: ");
        lado2 = medida.nextInt();

        System.out.println("Digite o tamaanho do terceiro lado: ");
        lado3 = medida.nextInt();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("É um triângulo!");

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("É um triângulo equilátero. ");
        }   else {
                if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isóceles. ");
                }
            else {
                System.out.println("É um triângulo escaleno. ");
            }
        }
        }
        else {
            System.out.println("Isso não é um triângulo!");
        }
    medida.close();
    }
}