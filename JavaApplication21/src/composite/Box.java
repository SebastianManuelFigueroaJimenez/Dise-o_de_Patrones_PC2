/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;


import java.util.ArrayList;
import java.util.List;

/**
 * Composite: caja que puede contener productos u otras cajas.
 */
public class Box implements IShippingComponent {

    protected final String name;
    protected final List<IShippingComponent> components;

    public Box(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void addComponent(IShippingComponent component) {
        components.add(component);
    }

    @Override
    public void showDetails() {
        System.out.println("   [Caja] " + name
                + "  -> Costo total: S/ " + String.format("%.2f", calculateShippingCost()));
        for (IShippingComponent c : components) {
            c.showDetails();
        }
    }

    @Override
    public double calculateShippingCost() {
        double total = 0;
        for (IShippingComponent c : components) {
            total += c.calculateShippingCost();
        }
        return total;
    }
}