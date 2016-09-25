/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

/**
 *
 * @author Albertyson
 */
public class Tienda {
    public String nombre;
    public Coordenada posicion;
    public Double distancia;
    public Double distanciaLocal;

    public Tienda() {
    }

    public Tienda(String nombre, Coordenada posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    @Override
    public String toString() {
//        return "Tienda{" + "nombre=" + nombre + ", posicion=" + posicion + ", distancia=" + distancia + '}';
        return nombre;
    }
    
    
}
