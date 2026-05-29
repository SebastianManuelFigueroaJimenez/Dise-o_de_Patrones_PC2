/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USER
 */
public class StatsLoggingDecorator extends ChannelDecorator {

    private static int messageCount = 0;

    public StatsLoggingDecorator(IMessageChannel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        messageCount++;
        System.out.println("[ESTADISTICAS] Mensaje #" + messageCount
                + " | Longitud original: " + message.length() + " chars");
        super.send(message);
    }
}