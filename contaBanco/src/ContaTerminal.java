import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler entradas do usuário
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita e lê o número da conta
            System.out.print("Por favor, digite o número da Conta: ");
            int numero = scanner.nextInt();
            
            // Limpa o buffer do scanner para a próxima entrada de texto
            scanner.nextLine();

            // Solicita e lê a agência
            System.out.print("Por favor, digite o número da Agência: ");
            String agencia = scanner.nextLine();

            // Solicita e lê o nome do cliente
            System.out.print("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();

            // Solicita e lê o saldo
            System.out.print("Por favor, digite o saldo: ");
            double saldo = scanner.nextDouble();

            // Usa interpolação de strings para criar a mensagem final
            String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo
            );

            // Exibe a mensagem final
            System.out.println(mensagem);
        }
    }
}
