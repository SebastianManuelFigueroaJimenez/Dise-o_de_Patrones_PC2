/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USER
 */
public abstract class ChannelDecorator implements IMessageChannel {

    protected final IMessageChannel channel;

    public ChannelDecorator(IMessageChannel channel) {
        this.channel = channel;
    }

    @Override
    public void send(String message) {
        channel.send(message);
    }
}
