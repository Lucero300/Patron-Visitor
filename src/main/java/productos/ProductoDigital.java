package productos;

import interfaces.Producto;
import interfaces.Visitor;

public class ProductoDigital implements Producto {

    private String nombre;
    private double precio;
    private String licencia;
    private int diasExpiracion;

    public ProductoDigital(String nombre, double precio, String licencia, int diasExpiracion) {
        this.nombre = nombre;
        this.precio = precio;
        this.licencia = licencia;
        this.diasExpiracion = diasExpiracion;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public double getPrecio() { return precio; }

    public String getLicencia() { return licencia; }

    public int getDiasExpiracion() { return diasExpiracion; }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
