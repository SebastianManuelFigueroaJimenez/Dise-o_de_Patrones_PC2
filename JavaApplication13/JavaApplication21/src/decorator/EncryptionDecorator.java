/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USER
 */
public class EncryptionDecorator
        extends ChannelDecorator {

    public EncryptionDecorator(IMessageChannel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {

        String encrypted =
                "[ENCRIPTADO] " + message;

        super.send(encrypted);

    }
}
