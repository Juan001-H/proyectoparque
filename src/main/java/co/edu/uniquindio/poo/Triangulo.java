package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class Triangulo extends Figura {
    public final double base;
    public final double altura;
    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public double getAltura() {
        return altura;
    }

    
}
