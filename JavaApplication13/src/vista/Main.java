/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ContratoCorporativoBuilder;
import controlador.DirectorDocumento;
import controlador.DocumentoBuilder;
import modelo.ConfigurationManager;
import modelo.DocumentoLegal;

public class Main {

    public static void main(String[] args) {

        // ==========================
        // SINGLETON (CONFIGURACIÓN GLOBAL)
        // ==========================
        ConfigurationManager config = ConfigurationManager.getInstancia();

        System.out.println("==================================");
        System.out.println(" SISTEMA DE DOCUMENTOS EMPRESARIALES ");
        System.out.println("==================================");

        System.out.println("\n--- CONFIGURACION GLOBAL ---");
        System.out.println("Base de Datos: " + config.getUrlBaseDatos());
        System.out.println("Servicio Web : " + config.getUrlServicioWeb());
        System.out.println("Sistema      : " + config.getSistemaOperativo());

        System.out.println("\n==================================\n");

        // ==========================
        // BUILDER (CONTRATO)
        // ==========================
        DocumentoBuilder builder = new ContratoCorporativoBuilder();

        DirectorDocumento director = new DirectorDocumento(builder);

        // Construcción del documento paso a paso
        director.construirDocumentoCompleto();

        // Resultado final
        DocumentoLegal contrato = builder.obtenerDocumento();

        System.out.println("========= CONTRATO GENERADO =========\n");
        contrato.mostrarDocumento();
    }
}
