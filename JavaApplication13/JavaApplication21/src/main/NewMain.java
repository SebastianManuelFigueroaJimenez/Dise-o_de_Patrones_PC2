/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Adapter.*;
import composite.*;
import decorator.*;
import facade.*;

public class NewMain {

    public static void main(String[] args) {

        // ==================================================
        // ADAPTER
        // ==================================================

        System.out.println("\n==================================================");
        System.out.println("                 PATRON ADAPTER");
        System.out.println("==================================================");

        LegacySMSProvider legacyProvider =
                new LegacySMSProvider();

        INotificationTarget smsAdapter =
                new SMSAdapte(legacyProvider);

        smsAdapter.sendNotification(
                "Hola cliente, su pedido fue enviado.",
                "999888777"
        );



        // ==================================================
        // FACADE
        // ==================================================

        System.out.println("\n==================================================");
        System.out.println("                  PATRON FACADE");
        System.out.println("==================================================");

        NotificationFacade facade =
                new NotificationFacade(smsAdapter);

        facade.sendSecureNotification(
                "Ali",
                "Su compra ha sido confirmada",
                "999888777"
        );



        // ==================================================
        // COMPOSITE
        // ==================================================

        System.out.println("\n==================================================");
        System.out.println("                 PATRON COMPOSITE");
        System.out.println("==================================================");



        Product laptop =
                new Product("Laptop Dell", 2.50);

        Product mouse =
                new Product("Mouse Inalambrico", 0.30);

        Product keyboard =
                new Product("Teclado Mecanico", 0.80);



        Box electronicBox =
                new Box("Caja Electronica");

        electronicBox.addComponent(laptop);
        electronicBox.addComponent(mouse);



        Box accessoryBox =
                new Box("Caja Accesorios");

        accessoryBox.addComponent(keyboard);



        MasterBox shipment =
                new MasterBox("Pedido #1001");

        shipment.addComponent(electronicBox);
        shipment.addComponent(accessoryBox);



        shipment.showDetails();



        // ==================================================
        // DECORATOR
        // ==================================================

        System.out.println("\n==================================================");
        System.out.println("                 PATRON DECORATOR");
        System.out.println("==================================================");

        IMessageChannel channel =
                new StatsLoggingDecorator(
                        new CompressionDecorator(
                                new EncryptionDecorator(
                                        new BasicEmailChannel()
                                )
                        )
                );

        channel.send(
                "Bienvenido al sistema de notificaciones"
        );



        // ==================================================
        // FINAL
        // ==================================================

        System.out.println("\n==================================================");
        System.out.println("           EJECUCION COMPLETADA");
        System.out.println("==================================================");

    }
}