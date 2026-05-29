/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composite;

/**
 *
 * @author USER
 */
public class MasterBox extends Box {

 public MasterBox(String name) {
        super(name);
    }

    @Override
    public void showDetails() {

        System.out.println("--------------------------------------------------");
        System.out.println("                 DETALLE DEL ENVIO");
        System.out.println("--------------------------------------------------");

        System.out.println("Pedido: " + name);

        for (IShippingComponent component : components) {

            component.showDetails();

        }

        System.out.println("\n--------------------------------------------------");
        System.out.printf("Peso Total del Envio: %.2f kg%n",
                calculateWeight());
        System.out.println("--------------------------------------------------");

    }
}