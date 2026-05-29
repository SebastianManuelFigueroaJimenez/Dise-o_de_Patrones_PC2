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

        // ══════════════════════════════════════════════════
        // PATRON ADAPTER
        // ══════════════════════════════════════════════════
        System.out.println("\n==================================================");
        System.out.println("              PATRON ADAPTER");
        System.out.println("==================================================");

        LegacySMSProvider legacyProvider = new LegacySMSProvider();
        INotificationTarget smsAdapter   = new SMSAdapte(legacyProvider);

        smsAdapter.sendNotification(
                "Hola cliente, su pedido ha sido despachado.",
                "+51999888777"
        );

        // ══════════════════════════════════════════════════
        // PATRON FACADE
        // ══════════════════════════════════════════════════
        System.out.println("\n==================================================");
        System.out.println("              PATRON FACADE");
        System.out.println("==================================================");

        NotificationFacade facade = new NotificationFacade(smsAdapter);

        facade.sendSecureNotification(
                "Carlos Rios",
                "Su compra ha sido confirmada. Codigo: #ORD-2026",
                "+51999888777"
        );

        // ══════════════════════════════════════════════════
        // PATRON COMPOSITE
        // ══════════════════════════════════════════════════
        System.out.println("\n==================================================");
        System.out.println("              PATRON COMPOSITE");
        System.out.println("==================================================");

        Product laptop   = new Product("Laptop Dell XPS",   15.00);
        Product mouse    = new Product("Mouse Inalambrico",   2.50);
        Product keyboard = new Product("Teclado Mecanico",    3.80);
        Product usb      = new Product("Hub USB-C",           1.20);
        Product cable    = new Product("Cable HDMI 2m",       0.90);

        Bag accessoryBag = new Bag("Bolsa de Accesorios");
        accessoryBag.addComponent(usb);
        accessoryBag.addComponent(cable);

        Box electronicsBox = new Box("Caja Electronica");
        electronicsBox.addComponent(laptop);
        electronicsBox.addComponent(mouse);

        Box peripheralsBox = new Box("Caja Perifericos");
        peripheralsBox.addComponent(keyboard);
        peripheralsBox.addComponent(accessoryBag);

        MasterBox shipment = new MasterBox("Pedido #ORD-2026-001");
        shipment.addComponent(electronicsBox);
        shipment.addComponent(peripheralsBox);

        shipment.showDetails();

        // ══════════════════════════════════════════════════
        // PATRON DECORATOR
        // Orden: StatsLogging > Compression > Encryption > BasicEmail
        // ══════════════════════════════════════════════════
        System.out.println("\n==================================================");
        System.out.println("              PATRON DECORATOR");
        System.out.println("==================================================");

        IMessageChannel channel =
            new StatsLoggingDecorator(
                new CompressionDecorator(
                    new EncryptionDecorator(
                        new BasicEmailChannel()
                    )
                )
            );

        System.out.println("--- Todos los decoradores apilados ---");
        channel.send("Bienvenido al sistema de notificaciones omnicanal");

        System.out.println("\n--- Solo encriptacion ---");
        IMessageChannel simple = new EncryptionDecorator(new BasicEmailChannel());
        simple.send("Mensaje con solo encriptacion");

        System.out.println("\n==================================================");
        System.out.println("        EJECUCION COMPLETADA - CASO 2");
        System.out.println("==================================================\n");
    }
}