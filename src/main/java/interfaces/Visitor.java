package interfaces;

import productos.ProductoFisico;
import productos.ProductoDigital;

public interface Visitor {
    void visit(ProductoFisico p);
    void visit(ProductoDigital p);
}