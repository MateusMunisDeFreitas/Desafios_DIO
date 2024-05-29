// Autor: Mateus Munis de Freitas 05881394321
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroConta;
        float saldo;
        String agencia, nomeCliente;

        System.out.print("Digite o numero da conta: ");
        numeroConta = input.nextInt();
        System.out.print("Digite o numero da agencia com hifen(-): ");
        agencia = input.next();
        System.out.print("Digiet seu nome: ");
        nomeCliente = input.next();
        System.out.print("Insira o valor de seu saldo atual: ");
        saldo = input.nextFloat();

        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia e %s, conta %d e seu saldo %.2f ja esta disponivel para saque", nomeCliente, agencia, numeroConta, saldo);


    }
}
