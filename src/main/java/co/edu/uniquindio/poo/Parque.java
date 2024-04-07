package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
public class Parque {
 public final String nombre;
 public final String descripcion;
 private Municipio municipio;
 private final Collection<ZonaParque> listaZonas;
public Parque(String nombre, String descripcion, Collection<ZonaParque> listaZonas) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.municipio = municipio;
    this.listaZonas = listaZonas;
}
public String getNombre() {
    return nombre;
}
public String getDescripcion() {
    return descripcion;
}
public Municipio getMunicipio() {
    return municipio;
}
public Collection<ZonaParque> getListaZonas() {
    return listaZonas;
}
 
}
