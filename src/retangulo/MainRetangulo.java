package retangulo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        double ladoA = r1.ladoA;
        double ladoB = r1.ladoB;

        System.out.println("Informe o valor do lado A ");
        ladoA = input.nextDouble();
        System.out.println("Informe o valor do lado B ");
        ladoB = input.nextDouble();

        System.out.println("Valor de A = " + ladoA);
        System.out.println("Valor de B =" + ladoB);

        System.out.println("Deseja alterar valor dos lados? S/N ");
        String usuario = input.next();

        if(usuario.equalsIgnoreCase("S")){
            System.out.println("Novo valor de lado A");
            ladoA = input.nextDouble();
            System.out.println("Novo valor de lado B");
            ladoB = input.nextDouble();
            r1.alteraValorLados(ladoA, ladoB);
        }else {

        }
        r1.mostrarLadoa();

        double calculo = r1.calcularArea();
        System.out.println("Valor calculo Area = " + calculo);

        double perimetros = r1.calcularPerimetros();
        System.out.println("Calculo do perimetros = " + perimetros);

        }





    }

