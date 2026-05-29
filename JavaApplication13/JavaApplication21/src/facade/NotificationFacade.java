/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

 import Adapter.INotificationTarget;

public class NotificationFacade {

    private UserValidator validator;
    private DataEncryptor encryptor;
    private AuditLogger logger;
    private MessageQueue queue;
    private INotificationTarget notificationTarget;

    public NotificationFacade(INotificationTarget notificationTarget) {

        this.validator = new UserValidator();
        this.encryptor = new DataEncryptor();
        this.logger = new AuditLogger();
        this.queue = new MessageQueue();

        this.notificationTarget = notificationTarget;
    }

    public void sendSecureNotification(String user, String message, String destination) {

        System.out.println("========== [Facade] Iniciando Flujo de Envío Seguro ==========");

        if (validator.isValidUser(user)) {

            String secureMessage = encryptor.encryptData(message);

            logger.logActivity("Preparando envío para " + user);

            queue.enqueue(secureMessage);

            notificationTarget.sendNotification(secureMessage, destination);

            logger.logActivity("Envío exitoso a " + destination);

            System.out.println("========== [Facade] Flujo Finalizado con Éxito ==========\n");
        }
    }
}