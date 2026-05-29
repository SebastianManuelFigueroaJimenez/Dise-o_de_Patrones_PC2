/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

/**
 *
 * @author USER
 */
public class BasicEmailChannel implements IMessageChannel {

    @Override
    public void send(String message) {

        System.out.println("[EMAIL]");
        System.out.println("Mensaje enviado: " + message);

    } 
}
