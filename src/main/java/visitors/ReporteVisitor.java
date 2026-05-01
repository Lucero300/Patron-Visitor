package visitors;

import interfaces.Visitor;
import productos.ProductoFisico;
import productos.ProductoDigital;

public class ReporteVisitor implements Visitor {

    @Override
    public void visit(ProductoFisico p) {
        double total = p.getPrecio() + p.getCostoEnvio();

        System.out.println("  [Fisico] " + p.getNombre());
        System.out.printf("    Nombre:            %s%n",     p.getNombre());
        System.out.printf("    Precio:            $%,.2f%n", p.getPrecio());
        System.out.printf("    Peso:              %.2f kg%n", p.getPeso());
        System.out.printf("    Costo de envio:    $%,.2f%n", p.getCostoEnvio());
        System.out.printf("    Total (con envio): $%,.2f%n", total);
        System.out.println();
    }

    @Override
    public void visit(ProductoDigital p) {
        System.out.println("  [Digital] " + p.getNombre());
        System.out.printf("    Nombre:            %s%n",   p.getNombre());
        System.out.printf("    Precio:            $%,.2f%n", p.getPrecio());
        System.out.printf("    Licencia:          %s%n",   p.getLicencia());
        System.out.printf("    Dias expiracion:   %d dias%n", p.getDiasExpiracion());
        System.out.printf("    Total:             $%,.2f%n", p.getPrecio());
        System.out.println();
    }
}
