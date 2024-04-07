package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Rectangulo extends Figura {
    public final double ancho;
    public final double alto;
    public Rectangulo(String nombre, double ancho, double alto) {
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
    }
    public double getAncho() {
        return ancho;
    }
    public double getAlto() {
        return alto;
    }
    
    
}
