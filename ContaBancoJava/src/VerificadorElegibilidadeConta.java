import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        // Verificando se a idade é maior ou igual a 18 e imprimindo uma mensagem correspondente:
        if (idade >= 18) {
            System.out.println("Você está elegível para criar uma conta bancária.");
        } else {
            System.out.println("Você não está elegível para criar uma conta bancária.");
        }

        // Fechando o objeto Scanner para liberar os recursos:
        scanner.close();
    }
}
