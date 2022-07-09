package retangulo;

public class Retangulo {
    static double ladoA;
    static double ladoB;

    public Retangulo() {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public void alteraValorLados(double ladoA, double ladoB){
        System.out.println("Valor de ladoA" + this.ladoA);
        System.out.println("Valor de ladoA" + this.ladoB);
                                                                                
    }

    public void mostrarLadoa() {
        System.out.println(" Mostrar lado A = " + ladoA + "ladoB " + ladoB);
        
        
    }

    public double calcularArea() {
        double total = 0;
        total = this.ladoA * this.ladoB;
        return total;

    }

    public static double calcularPerimetros(){
        double total;
        total = 2 * (ladoA + ladoB);
        return total;
    }
        

}
