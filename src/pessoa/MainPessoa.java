package pessoa;

import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();

        p1.apresentar();

        System.out.println("Deseja saber qual o seu crescimento? S/N");
        String usuario = input.next();
        if(usuario.equalsIgnoreCase("S")){
            p1.crescer();

        }else{
            System.out.println("Agradecemos a preferência");
        }}

    }


