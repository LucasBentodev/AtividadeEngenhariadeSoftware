package entities;

public class Telefone {
    private String codigoDeArea;
    private String numero;

    public Telefone(String codigoDeArea, String numero) {
        setCodigoDeArea(codigoDeArea);
        setNumero(numero);
    }

    public String getCodigoDeArea() {
        return codigoDeArea;
    }
    public void setCodigoDeArea(String codigoDeArea) {

        if (codigoDeAreaValido(codigoDeArea)) {
            this.codigoDeArea = codigoDeArea;
        } else {
            throw new IllegalArgumentException("Código de área inválido.");
        }
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        // Implemente a validação para o número de telefone
        this.numero = numero;
    }
    private boolean codigoDeAreaValido(String codigoDeArea) {
        // Implemente a lógica para verificar se o DDD é de São Paulo (11, 12, 13, etc.)
        // Você pode usar um enum para armazenar os DDDs de São Paulo e verificar aqui
            return codigoDeArea.equals("11") || codigoDeArea.equals("12") || codigoDeArea.equals("13")
            || codigoDeArea.equals("14") || codigoDeArea.equals("15") || codigoDeArea.equals("16")
            || codigoDeArea.equals("17") ||codigoDeArea.equals("18") ||codigoDeArea.equals("19");
    }

    public String toString() {
        return codigoDeArea + "-" + numero;
    }

}

