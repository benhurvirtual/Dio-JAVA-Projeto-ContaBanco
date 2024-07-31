import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria uma instância do Scanner para ler entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o número da conta e lê a entrada do usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        
        // Limpa o buffer do scanner para a próxima entrada de texto
        scanner.nextLine();

        // Solicita a agência e lê a entrada do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita o nome do cliente e lê a entrada do usuário
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo e lê a entrada do usuário
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Cria a mensagem final usando concatenação de strings
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        // Exibe a mensagem final
        System.out.println(mensagem);
    }
}
