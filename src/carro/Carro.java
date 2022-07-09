package carro;

public class Carro {
    int qtdPortas;
    String modelo;
    String marca;

    Boolean ligarCarro;
    double potencia;

    public Carro() {
        this.qtdPortas = qtdPortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
        this.ligarCarro = false;
        
        
    }
    public void ligarCarro(){
        this.ligarCarro = true;
        System.out.println("O carro está: " + ligarCarro);
        
    }
}
