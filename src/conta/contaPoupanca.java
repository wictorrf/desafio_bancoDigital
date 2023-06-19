package conta;

public class contaPoupanca extends Conta {

    public contaPoupanca(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato conta Poupanca");
        super.imprimirInfoComuns();
        // System.out.println(String.format("Agencia: %d", getAgencia()));
        // System.out.println(String.format("Numero: %d", getNumero()));
        // System.out.println(String.format("Saldo: %.2f", getSaldo()));
    }

}
