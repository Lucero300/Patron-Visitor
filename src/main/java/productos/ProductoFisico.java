package productos;

import interfaces.Producto;
import interfaces.Visitor;

public class ProductoFisico implements Producto {

    private String nombre;
    private double precio;
    private double peso;
    private double costoEnvio;

    public ProductoFisico(String nombre, double precio, double peso, double costoEnvio) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.costoEnvio = costoEnvio;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public double getPrecio() { return precio; }

    public double getPeso() { return peso; }

    public double getCostoEnvio() { return costoEnvio; }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
