package contacorrente;

public class MainContaCorrente {
    public static void main(String[] args) {
        String ag;
        ContaCorrente contaCorrente = new ContaCorrente();
        String concatenacao = contaCorrente.agNumeroconta();
        System.out.println("Concatenacao" + concatenacao);

        double valorCorrente = contaCorrente.saldoTotalConta();
        System.out.println(valorCorrente);
    }

}
