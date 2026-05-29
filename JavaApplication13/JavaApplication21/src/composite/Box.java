/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;


import java.util.ArrayList;
import java.util.List;

public class Box implements IShippingComponent {

    protected String name;

    protected List<IShippingComponent> components;

    public Box(String name) {

        this.name = name;

        components = new ArrayList<>();

    }

    public void addComponent(IShippingComponent component) {

        components.add(component);

    }

    @Override
    public void showDetails() {

       
    System.out.println("\n+ Caja: " + name);

    for (IShippingComponent component : components) {

        component.showDetails();

    }
    }

    @Override
    public double calculateWeight() {

        double total = 0;

        for (IShippingComponent component : components) {

            total += component.calculateWeight();

        }

        return total;
    }
}
