package quadrado;

import com.sun.java.swing.plaf.windows.WindowsDesktopPaneUI;

import java.util.Scanner;

public class Quadrado {
    double lado;

    public Quadrado() {
        this.lado = lado;
    }

    public void mudarValorDoLado (){
        Scanner input = new Scanner(System.in);
        System.out.println("Coloque um valor do lado");
        lado = input.nextDouble();
        System.out.println(lado);
    }

    public double retornarvalorlado(){
        return lado;
    }

    public double calcularArea(){
        lado *=lado;
        return lado;
    }

    }




