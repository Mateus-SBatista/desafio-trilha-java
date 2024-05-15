import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            // Solicita ao usuário o valor do saque
            //System.out.println("Informe o valor do saque " + i + ":");
            double valorSaque = scanner.nextDouble();

            // Verifica se o valor do saque é zero, encerrando as transações
            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break;
            }

            // Verifica se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteRestante) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break;
            }

            // Se o valor do saque não ultrapassar o limite diário, subtrai o valor do saque do limite diário
            limiteRestante -= valorSaque;

            // Informa que o saque foi realizado e mostra o limite restante
            System.out.println("Saque realizado. Limite restante: " + limiteRestante);
        }

        // Fechamos o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
