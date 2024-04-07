package co.edu.uniquindio.poo;

public enum Material {
    ARENA(10000),
    GRAMA_SINTETICA(35000),
    GRAMA_NATURAL(20000),
    ASFALTO(40000);

    private final double valor;

    Material(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
