package contacorrente;

public class ContaCorrente {
    String ag = "057";
    String numeroDaConta = "256";
    double saldo;
    double limite;

    public ContaCorrente() {
        this.ag = ag;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.limite = limite;
    }

    String agNumeroconta = "";

    public String agNumeroconta(){
        String agNumeroconta = ag + numeroDaConta;
        return agNumeroconta;

    }

    public double saldoTotalConta (){
        double totalValor = 0;
        //totalValor = saldo + limiteDeCredito;
        return totalValor;

    }
}
