/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author USER
 */

public class SMSAdapte implements INotificationTarget {

    private final LegacySMSProvider legacySMSProvider;

    public SMSAdapte(LegacySMSProvider legacySMSProvider) {
        this.legacySMSProvider = legacySMSProvider;
    }

    @Override
    public void sendNotification(String message, String recipient) {
        legacySMSProvider.sendMassiveSMS(recipient, message);
    }
}