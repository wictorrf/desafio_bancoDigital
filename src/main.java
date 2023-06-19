import conta.Cliente;
import conta.Conta;
import conta.contaCorrente;
import conta.contaPoupanca;

public class main {
    public static void main(String[]args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Wictor");

        Conta cc = new contaCorrente(cliente);
        Conta cp = new contaPoupanca(cliente);

        cc.depositar(500);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
