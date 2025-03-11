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


    private static final double DESCUENTO_MIN = 0.95; // 5% de descuento
    private static final double DESCUENTO_MAX = 0.8;  // 20% de descuento

    /**
     * Aplica un descuento al precio del producto en función de la cantidad comprada.
     *
     * @param precioProducto Precio unitario del producto antes del descuento.
     * @param numProductos  Cantidad de productos comprados.
     */
    
    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total; //Variable para almacenar el total a pagar

        //Validación: Si el número de productos es 0 o negativo, muestra un mensaje y termina el método.
        if (numProductos <= 0) {
            System.out.println("Cantidad de productos inválida.");
            return;
        }

        //Si se compran más de 3 productos, se reduce el precio unitario en 5 unidades.
        precioProducto = (numProductos > 3) ? Math.max(precioProducto - 5, 0) : precioProducto;

        // Se verifica si numProductos es diferente de 0 (siempre lo será por la validación previa)
        if (numProductos != 0) {
            total = precioProducto * DESCUENTO_MAX; //Aplica solo el descuento sin multiplicar por la cantidad
        } else {
            total = precioProducto * numProductos * DESCUENTO_MAX; //Incluye cantidad
        }

        // Se muestra el total final al usuario.
        mostrarTotal(total);
    }

    /**
     * Muestra el total a pagar y un mensaje de confirmación.
     *
     * @param total Monto total después de aplicar el descuento.
     */
    private void mostrarTotal(double total) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }
}

