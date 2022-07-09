package bola;

import java.util.Scanner;

public class MainBola {
    public static void main(String[] args) {
        String trocar = null;
        Bola b1 =new Bola();
        String cor = b1.cor;
        System.out.println(cor);

        b1.mostraCor(cor);

        Scanner input = new Scanner(System.in);
        System.out.println("Quer mudar de cor? S/N");
        String mudar = input.next();
        if(mudar.equals("S") ){
            b1.mudarcor();

        }else{
            System.out.println("Agradecemos a escolha");
        }

    }


}
