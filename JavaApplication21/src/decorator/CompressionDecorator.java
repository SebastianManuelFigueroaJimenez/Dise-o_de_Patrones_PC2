/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USER
 */
public class CompressionDecorator extends ChannelDecorator {

    public CompressionDecorator(IMessageChannel channel) {
        super(channel);
    }

    @Override
    public void send(String message) {
        String compressed = message.replaceAll("([aeiouAEIOU])\\1+", "$1");
        int savings = message.length() - compressed.length();
        System.out.println("[COMPRESION] Caracteres reducidos: " + savings
                + " | Longitud final: " + compressed.length());
        super.send("[COMP:" + compressed + "]");
    }
}