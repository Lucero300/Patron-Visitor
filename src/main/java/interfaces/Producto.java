package interfaces;

public interface Producto {
    String getNombre();
    double getPrecio();
    void accept(Visitor v);
}
