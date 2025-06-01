public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor){
        saldo += valor;
    }
    public void sacar (double valor){
        if (valor <= saldo) saldo -= valor;
        else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public void exibirSaldo (){
        System.out.println("Saldo atual: " + saldo);
    }
    public static void main (String[] args){
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Cristian";

        conta.depositar(1000);
        conta.sacar(250);
        conta.exibirSaldo();

    }
}

