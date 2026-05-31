import java.sql.SQLOutput;
import java.util.Scanner;
void main() {
    Scanner teclado= new Scanner(System.in);
    int escolha = 0; 

    System.out.println("***Cadastro da Conta ***");

    System.out.print("Nome: ");
    String nome = teclado.nextLine();

    System.out.print("Tipo da conta: ");
    String tipoConta = teclado.nextLine();

    System.out.print("Saldo inicial: ");
    double saldo = teclado.nextDouble();

    ContaBancaria conta = new ContaBancaria(nome, tipoConta, saldo);
    String opçoes= """
            Escolha uma opção:
            [1]-Conferir saldo;
            [2]-Receber valor;
            [3]-Transferir valor;
            [4]-Encerrar sessão;
            """;
while (escolha!=4){
    System.out.println(opçoes);
    escolha= teclado.nextInt();
    switch(escolha) {

        case 1:
            conta.consultarSaldo();
            break;

        case 2:
            System.out.println("Digite o valor:");
            double valorReceber = teclado.nextDouble();

            conta.receberValor(valorReceber);
            break;

        case 3:
            System.out.println("Digite o valor:");
            double valorTransferir = teclado.nextDouble();

            conta.transferirValor(valorTransferir);
            break;

        case 4:
            System.out.println("Encerrado.");
            break;

        default:
            System.out.println("Opção inválida.");
    }}
}
