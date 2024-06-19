import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = scanner.nextDouble();
        int quantidadeTransacoes = scanner.nextInt();

        List<Transacao> transacoes = new ArrayList<>();

        for (int i = 1; i <= quantidadeTransacoes; i++) {
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            double valorTransacao = scanner.nextDouble();

            // Criar uma nova transação e adicioná-la à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);
        }

        // Atualizar o saldo com base nas transações
        saldo += transacoes.stream()
                .mapToDouble(t -> t.getTipo() == 'D' ? t.getValor() : -t.getValor())
                .sum();

        // Exibir o saldo final
        System.out.println("Saldo: " + saldo);

        // Exibir a lista de transações
        System.out.println("Transacoes:");
        transacoes.stream()
                .map(t -> t.getTipo() == 'D' ? "d de " + t.getValor() : "s de " + t.getValor())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
