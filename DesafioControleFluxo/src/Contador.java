import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
            scanner.close();

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException();

        } else {
            for (int indice = parametroUm; indice < parametroDois; indice++) {
                System.out.println("Imprimindo o numero: " + (indice + 1));
            }

        }

    }
}
