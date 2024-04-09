package co.edu.uniquindio.poo;
public class Circulo extends Figura {
    public final double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    
}
