package visitors;

import interfaces.Visitor;
import productos.ProductoFisico;
import productos.ProductoDigital;

public class ImpuestoVisitor implements Visitor {

    private static final double TASA_IVA   = 0.19;
    private static final double TASA_ENVIO = 0.02;

    @Override
    public void visit(ProductoFisico p) {
        double impuestoBase  = p.getPrecio() * TASA_IVA;
        double impuestoEnvio = p.getCostoEnvio() * TASA_ENVIO;
        double impuestoTotal = impuestoBase + impuestoEnvio;
        double total         = p.getPrecio() + impuestoTotal;

        System.out.println("  [Fisico] " + p.getNombre());
        System.out.printf("    Precio base:      $%,.2f%n", p.getPrecio());
        System.out.printf("    IVA (19%%):        $%,.2f%n", impuestoBase);
        System.out.printf("    Imp. envio (2%%):  $%,.2f%n", impuestoEnvio);
        System.out.printf("    Impuesto total:   $%,.2f%n", impuestoTotal);
        System.out.printf("    TOTAL con imp.:   $%,.2f%n", total);
        System.out.println();
    }

    @Override
    public void visit(ProductoDigital p) {
        double impuesto = p.getPrecio() * TASA_IVA;
        double total    = p.getPrecio() + impuesto;

        System.out.println("  [Digital] " + p.getNombre());
        System.out.printf("    Precio base:      $%,.2f%n", p.getPrecio());
        System.out.printf("    IVA (19%%):        $%,.2f%n", impuesto);
        System.out.printf("    TOTAL con imp.:   $%,.2f%n", total);
        System.out.println();
    }
}
