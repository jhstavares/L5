package lista2dalista0005.caixa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class MainCaixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ContaCaixa caixa = new ContaCaixa();
        caixa.debito = 1200.00;


        double valorRecebido;
        double soma = 0;
        List<Double> credito = new ArrayList<>();
        String respostas = "";
        do {

            System.out.print("Digite o números de lançamentos que você deseja fazer: ");
            int lancamentos = input.nextInt();

            System.out.print("Você quer fazer no crédito ou no débito?:  ");
            respostas = input.next();
            if (respostas.equalsIgnoreCase("credito")) {
                for (double contador = 0; contador < lancamentos; contador++) {
                    System.out.print("Digite o " + (contador + 1) + "º valor: ");
                    credito.add(input.nextDouble());
                    soma += (double) credito.get((int) contador);
                    caixa.credito = soma;
                }
                System.out.println(caixa.credito());

            }
            if (respostas.equalsIgnoreCase("debito")) {
                for (double contador = 0; contador < lancamentos; contador++) {
                    System.out.print("Digite o " + (contador + 1) + "º valor: ");
                    credito.add(input.nextDouble());
                    soma += (double) credito.get((int) contador);
                    caixa.debito = soma;
                }
                System.out.println(caixa.debito());



            }
            System.out.println("Você deseja fazer mais alguma movimentação? [S/N]: ");
            respostas = input.next();
        }while (respostas.equalsIgnoreCase("s"));
        System.out.println("Agradecemos pele preferência, até a próxima.");


    }
}