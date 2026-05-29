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
        System.out.println("==================================================");
        System.out.println("           DETALLE DEL ENVIO COMPLETO");
        System.out.println("==================================================");
        System.out.println("Pedido Master: " + name);
        System.out.println("--------------------------------------------------");
        for (IShippingComponent c : components) {
            c.showDetails();
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("COSTO TOTAL DE ENVIO: S/ %.2f%n", calculateShippingCost());
        System.out.println("==================================================");
    }
}