/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

import Adapter.INotificationTarget;


public class NotificationFacade {

    private final UserValidator validator;
    private final DataEncryptor encryptor;
    private final AuditLogger logger;
    private final MessageQueue queue;
    private final INotificationTarget notificationTarget;

    public NotificationFacade(INotificationTarget notificationTarget) {
        this.validator          = new UserValidator();
        this.encryptor          = new DataEncryptor();
        this.logger             = new AuditLogger();
        this.queue              = new MessageQueue();
        this.notificationTarget = notificationTarget;
    }

    public void sendSecureNotification(String user, String message, String destination) {

        System.out.println(">>> [Facade] Iniciando flujo de envio seguro...");

        if (!validator.isValidUser(user)) {
            System.out.println(">>> [Facade] Usuario invalido. Envio cancelado.");
            return;
        }

        String secureMessage = encryptor.encryptData(message);
        logger.logActivity("Mensaje preparado para: " + user);
        queue.enqueue(secureMessage);
        notificationTarget.sendNotification(secureMessage, destination);
        logger.logActivity("Envio exitoso a destino: " + destination);

        System.out.println(">>> [Facade] Flujo finalizado correctamente.\n");
    }
}