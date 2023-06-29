package camarotes;
import ingresso.Ingresso;

public class VIP extends Ingresso {
    private double valorAdicional;

    public VIP(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVIP() {
        return valor + valorAdicional;
    }
}