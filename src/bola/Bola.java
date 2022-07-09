package bola;

import java.util.Scanner;

public class Bola {
    double circunferencia;
    String cor;
    String marca;
    double velocidade;
    String material;

    public Bola() {
        this.circunferencia = circunferencia;
        this.cor = "Preta";
        this.marca = marca;
        this.velocidade = velocidade;
        this.material = material;
    }

    public String mostraCor(String Cor){
        cor = "Branca";
        System.out.println(cor);
        return cor;
    }
    public void mudarcor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Colloquy sua cor");
        cor=input.next();
        System.out.println("A cor da sua bola é: " + cor);


    }

}
