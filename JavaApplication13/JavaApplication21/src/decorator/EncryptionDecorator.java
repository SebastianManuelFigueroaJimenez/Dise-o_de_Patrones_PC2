/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import java.util.Base64;

/**
 * Decorador concreto: encripta el mensaje en Base64 antes de enviarlo.
 */
public class EncryptionDecorator extends ChannelDecorator {

    public EncryptionDecorator(IMessageChannel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        String encrypted = Base64.getEncoder().encodeToString(message.getBytes());
        System.out.println("[ENCRIPTACION] Mensaje encriptado en Base64.");
        super.send("[ENC:" + encrypted + "]");
    }
}