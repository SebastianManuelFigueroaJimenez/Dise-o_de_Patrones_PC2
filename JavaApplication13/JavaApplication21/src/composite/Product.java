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

    private String name;
    private double weight;

    public Product(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void showDetails() {

        System.out.printf(
            "   %-25s | Peso: %5.2f kg%n",
            name,
            weight
    );

    }

    @Override
    public double calculateWeight() {
        return weight;
    }
}