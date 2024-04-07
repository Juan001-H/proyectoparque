package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class Cuadrado extends Rectangulo {
    public final double lado;

    public Cuadrado(String nombre, double ancho, double alto, double lado) {
        super(nombre, ancho, alto);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    
    
}
