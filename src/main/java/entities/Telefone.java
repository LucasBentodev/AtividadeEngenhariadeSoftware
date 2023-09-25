package entities;

public class Telefone {
    private CodigoDeArea codigoDeArea;
    private String numero;

    public Telefone(CodigoDeArea codigoDeArea, String numero) {
        this.codigoDeArea = codigoDeArea;
        this.numero = numero;
    }

    public CodigoDeArea getCodigoDeArea() {
        return codigoDeArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return codigoDeArea + " " + numero;
    }

}

