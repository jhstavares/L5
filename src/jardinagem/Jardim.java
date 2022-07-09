package jardinagem;

public class Jardim {
    String nomeJardim;
    double quantidadeMetros;
    int quantidadedePlantas;
    double quantidadeMetrosGrama;
    double quiloAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorCorteGrama;


    public Jardim() {
        this.nomeJardim = nomeJardim;
        this.quantidadeMetros = 0;
        this.quantidadedePlantas = quantidadedePlantas;
        this.quantidadeMetrosGrama = 20.0;
        this.quiloAdubo = quiloAdubo;
        this.valorMetroGrama = 100;
        this.valorCorteGrama = valorMetroGrama;


    }

    public void usarAdubo() {
        for (int contador = 0; contador < quantidadeMetrosGrama; contador += 2) {
            quiloAdubo += 0.1;

        }
    }

    public double precoAdubo() {
        return quiloAdubo = valorAdubo;


    }

    public double precoCorteGrama() {return valorCorteGrama = quantidadeMetrosGrama * valorMetroGrama; }


    }
