import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (//instanciando o objeto para leitura de dados
        Scanner leitura = new Scanner (System.in)) {
            //solicitando ao usuário que informe os dados
            System.out.printf("Por favor, digite o número da Agência: ");
            String agencia = leitura.next();

            System.out.printf("Informe o número de sua conta: ");
            int numero = leitura.nextInt();
   
            System.out.printf("Digite seu nome: ");
            String nome = leitura.next();

            System.out.printf("Informe o saldo em sua conta: R$ ");
            double saldo = leitura.nextDouble();

            //exibindo a mensagem em tela
            System.out.println(String.format("""
                    Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo R$ %.2f já está disponível para saque.
                    """,nome, agencia, numero, saldo));
            leitura.close();
        }
    }
}
