/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author Vendedor 1
 */
public class Bag extends Box {

    public Bag(String name) {
        super(name);
    }

    @Override
    public void showDetails() {
        System.out.println("      [Bolsa] " + name
                + "  -> Subtotal: S/ " + String.format("%.2f", calculateShippingCost()));
        for (IShippingComponent c : components) {
            c.showDetails();
        }
    }
}