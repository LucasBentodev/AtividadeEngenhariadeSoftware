package entities;

import java.time.format.DateTimeFormatter;

public class Linha {
    private Telefone numero;
    private String dataAtivacao;
    private Plano planoContratado;

    public Linha(String codigoArea, String numero, String dataAtivacao, Plano planoContratado) {
        this.numero = new Telefone(codigoArea, numero);
        this.dataAtivacao = dataAtivacao;
        this.planoContratado = planoContratado;
    }
    @Override
    public String toString() {
        return "Linha: \n" +
                "numero= " + numero +
                ", dataAtivacao= " + dataAtivacao +
                ", planoContratado= " + planoContratado;
    }
}
