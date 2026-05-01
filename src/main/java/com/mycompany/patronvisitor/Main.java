package com.mycompany.patronvisitor;
import interfaces.Producto;
import interfaces.Visitor;
import productos.ProductoFisico;
import productos.ProductoDigital;
import visitors.ImpuestoVisitor;
import visitors.ReporteVisitor;
import visitors.DescuentoVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Producto> catalogo = new ArrayList<>();
        catalogo.add(new ProductoFisico ("Laptop Lenovo IdeaPad",  3500000, 2.1, 25000));
        catalogo.add(new ProductoDigital("Licencia Microsoft 365",  450000, "ANNUAL-M365-2025", 365));
        catalogo.add(new ProductoFisico ("Teclado Mecanico RGB",    280000, 0.9, 12000));
        catalogo.add(new ProductoDigital("Adobe Photoshop CC",      320000, "MONTHLY-PS-2025",   30));
        catalogo.add(new ProductoFisico ("Monitor LG 27",          1200000, 5.0, 40000));
        catalogo.add(new ProductoDigital("Curso Java Avanzado",     199000, "LIFETIME-JAVA-01", 999));

        Visitor impuestoVisitor  = new ImpuestoVisitor();
        Visitor reporteVisitor   = new ReporteVisitor();
        Visitor descuentoVisitor = new DescuentoVisitor();

        System.out.println("================================================");
        System.out.println("   SISTEMA DE FACTURACION - Patron Visitor");
        System.out.println("================================================");

        System.out.println("\n--- CALCULO DE IMPUESTOS (IVA) ---");
        for (Producto p : catalogo) p.accept(impuestoVisitor);

        System.out.println("--- REPORTE DE PRODUCTOS ---");
        for (Producto p : catalogo) p.accept(reporteVisitor);

        System.out.println("--- APLICACION DE DESCUENTOS ---");
        for (Producto p : catalogo) p.accept(descuentoVisitor);
    }
}