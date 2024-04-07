package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
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
