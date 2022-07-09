package jardinagem;

import java.util.Scanner;

public class MainJardim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jardim jardim = new Jardim();
        jardim.nomeJardim = "Jaceruba";
        jardim.quantidadeMetros = 50;
        jardim.quantidadedePlantas = 20;
        jardim.quantidadeMetrosGrama = 35;
        jardim.valorAdubo = 18.93;
        jardim.valorMetroGrama = 25;
        jardim.valorCorteGrama = 55;

        jardim.precoCorteGrama();
        System.out.println("nome jardim: " + jardim.nomeJardim + "\nquantidade de metros: " + jardim.quantidadeMetros +
                "\nquantidade de plantas no terreno: " + jardim.quantidadedePlantas +"\nQuantidade de metros de grama no terreno: " +
                jardim.quantidadeMetrosGrama
                + "\nvalor que será vendido o meu adubo: " +
                jardim.valorAdubo + "\nvalor do metro por grama: " +
                jardim.quantidadeMetrosGrama + "\nValor corte grama: " + jardim.valorMetroGrama);

    }
}
