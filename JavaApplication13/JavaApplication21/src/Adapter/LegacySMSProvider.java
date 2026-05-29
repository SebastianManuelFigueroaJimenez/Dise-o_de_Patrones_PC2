/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author USER
 */
public class LegacySMSProvider {

    public void sendMassiveSMS(String phone, String textBody) {

        System.out.println("[LegacySMSProvider] SMS enviado a "
                + phone + " -> " + textBody);

    }
}
