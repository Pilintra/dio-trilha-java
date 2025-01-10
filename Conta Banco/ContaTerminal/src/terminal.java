public class terminal {
    public static void main(String[] args) throws InterruptedException {
        //TODO:Conhecer e importar a Classe Scanner
        Scanner scanner = new Scanner();

        System.out.println("Bem vindo ao sistema de criação de contas!");
        System.out.println("Digite o nome do titular da conta:");
        String nomeTitular = scanner.nextLine();
        System.out.println("Digite o número da conta:");
        var numeroConta = scanner.nextInt();
        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();
        scanner.close(); 
        //TODO:Exibir as mensagens para o nosso usuario
        
        //TODO:Exibir dados da conta criada
        System.out.println("Nome do titular: " + nomeTitular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo inicial: " + saldoInicial);
        System.out.println("Conta criada com sucesso!");
        System.out.println("Aperte ENTER para sair.");
        scanner.nextLine(); 
        
        // Limpa o buffer do teclado para garantir que o programa não fique travado
        Thread.sleep(1000);
        System.exit(0);

        //TODO:Obter pela scanner os valores digitados no terminal

        //TODO:Exibir mensagem da conta criada

    }
}