/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.ConfigurationManager;
import modelo.DocumentoLegal;
import controlador.*;

public class Main {

    public static void main(String[] args) {

        // SINGLETON
        ConfigurationManager config = ConfigurationManager.getInstancia();

        System.out.println("---- CONFIGURACIÓN GLOBAL ----");
        System.out.println(config.getUrlBaseDatos());

        System.out.println("\n\n");

        // BUILDER
        DocumentoBuilder builder = new ContratoCorporativoBuilder();
        DirectorDocumento director = new DirectorDocumento(builder);

        director.construirDocumentoCompleto();

        DocumentoLegal doc = builder.obtenerDocumento();
        doc.mostrarDocumento();
    }
}
