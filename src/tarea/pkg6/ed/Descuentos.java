/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg6.ed;

/**
 *
 * @author amjpa
 */
public class Descuentos {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_MAX;
            mostrarTotal(total);
        } else {
            total = precioProducto * DESCUENTO_MIN;
            mostrarTotal(total);
        }
    }
    private static final double DESCUENTO_MIN = 0.95;
    private static final double DESCUENTO_MAX = 0.8;

    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es:" + total);
        System.out.println("Enviado");
    }
}


