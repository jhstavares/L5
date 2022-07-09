package quadrado;

import sun.security.rsa.RSAUtil;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class MainQuadrado {
    public static void main(String[] args) {
        Quadrado a = new Quadrado();

        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor do lado?  ");
        a.lado = input.nextDouble();

        System.out.println(a.lado);



        System.out.println("Deseja mudar o lado do quadrado ? = S/N");
        String usuario = input.next();
        if(usuario.equalsIgnoreCase("S")){
            a.mudarValorDoLado();

        } else{
            System.out.println("Ok. Muito obrigado");

        }

         a.retornarvalorlado();

        System.out.println( "valor retornado: " + a.retornarvalorlado());

        System.out.println(" valor da area: " + a.calcularArea());


    }
}
