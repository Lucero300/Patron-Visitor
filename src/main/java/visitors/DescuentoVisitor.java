package visitors;

import interfaces.Visitor;
import productos.ProductoFisico;
import productos.ProductoDigital;

public class DescuentoVisitor implements Visitor {

    private static final double DESCUENTO_FISICO  = 0.05;
    private static final double DESCUENTO_DIGITAL = 0.10;

    @Override
    public void visit(ProductoFisico p) {
        double descuento   = p.getPrecio() * DESCUENTO_FISICO;
        double precioFinal = p.getPrecio() - descuento;

        System.out.println("  [Fisico] " + p.getNombre());
        System.out.printf("    Precio original:  $%,.2f%n", p.getPrecio());
        System.out.printf("    Descuento (5%%):   $%,.2f%n", descuento);
        System.out.printf("    Precio final:     $%,.2f%n", precioFinal);
        System.out.println();
    }

    @Override
    public void visit(ProductoDigital p) {
        double descuento   = p.getPrecio() * DESCUENTO_DIGITAL;
        double precioFinal = p.getPrecio() - descuento;

        System.out.println("  [Digital] " + p.getNombre());
        System.out.printf("    Precio original:  $%,.2f%n", p.getPrecio());
        System.out.printf("    Descuento (10%%):  $%,.2f%n", descuento);
        System.out.printf("    Precio final:     $%,.2f%n", precioFinal);
        System.out.println();
    }
}
