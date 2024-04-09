package co.edu.uniquindio.poo;
import java.util.Collection;

public class ZonaParque {
    public final String nombre;
    public Material material;
    private  final Collection<Figura> listaFiguras;
    public ZonaParque(String nombre, Collection<Figura> listaFiguras) {
        this.nombre = nombre;
        this.material = extracted();
        this.listaFiguras = listaFiguras;
    }
    private Material extracted() {
        return material;
    }
    public String getNombre() {
        return nombre;
    }
    public Collection<Figura> getListaFiguras() {
        return listaFiguras;
    }
    public Material getMaterial() {
        return extracted();
    }

    
}
