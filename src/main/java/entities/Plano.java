package entities;

public class Plano {
    private String nome;
    private int minutosInclusos;
    private int dadosInclusosEmGB;
    private double precoPorMinutoExcedente;
    private double precoPorGBExcedente;
    public Plano(String nome, int minutosInclusos, int dadosInclusosEmGB, double precoPorMinutoExcedente, double precoPorGBExcedente) {
        setNome(nome);
        setMinutosInclusos(minutosInclusos);
        setDadosInclusosEmGB(dadosInclusosEmGB);
        setPrecoPorMinutoExcedente(precoPorMinutoExcedente);
        setPrecoPorGBExcedente(precoPorGBExcedente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMinutosInclusos() {
        return minutosInclusos;
    }

    public void setMinutosInclusos(int minutosInclusos) {
        // Implemente validações, se necessário
        this.minutosInclusos = minutosInclusos;
    }

    public int getDadosInclusosEmGB() {
        return dadosInclusosEmGB;
    }

    public void setDadosInclusosEmGB(int dadosInclusosEmGB) {
        // Implemente validações, se necessário
        this.dadosInclusosEmGB = dadosInclusosEmGB;
    }

    public double getPrecoPorMinutoExcedente() {
        return precoPorMinutoExcedente;
    }

    public void setPrecoPorMinutoExcedente(double precoPorMinutoExcedente) {
        // Implemente validações, se necessário
        this.precoPorMinutoExcedente = precoPorMinutoExcedente;
    }

    public double getPrecoPorGBExcedente() {
        return precoPorGBExcedente;
    }

    public void setPrecoPorGBExcedente(double precoPorGBExcedente) {
        // Implemente validações, se necessário
        this.precoPorGBExcedente = precoPorGBExcedente;
    }

    @Override
    public String toString() {
        return "Plano: \n" +
                "nome: " + nome +
                ", minutosInclusos = " + minutosInclusos +
                ", \nGigas contratados= " + dadosInclusosEmGB +
                ", \nPreco excedente minuto= " + precoPorMinutoExcedente +
                ", \nPreco por GB excendente= " + precoPorGBExcedente;
    }
}

