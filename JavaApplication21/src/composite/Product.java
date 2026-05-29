/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author USER
 */
public class Product implements IShippingComponent {

    private final String name;
    private final double shippingCost;

    public Product(String name, double shippingCost) {
        this.name = name;
        this.shippingCost = shippingCost;
    }

    @Override
    public void showDetails() {
        System.out.printf("      [Producto] %-25s | Costo envio: S/ %5.2f%n",
                name, shippingCost);
    }

    @Override
    public double calculateShippingCost() {
        return shippingCost;
    }
}