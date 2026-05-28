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
import prototipo.ClausulaConfidencialidad;
import prototipo.ClausulaResponsabilidad;
import prototipo.PrototypeRegistry;
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
        
        
        // ==========================
        // PROTOTYPE (CLÁUSULAS)
        // ==========================
        System.out.println("\n==================================");
        System.out.println(" PATRON PROTOTYPE - CLAUSULAS     ");
        System.out.println("==================================\n");

        PrototypeRegistry registry = new PrototypeRegistry();

        registry.registrar("NDA_ESTANDAR", new ClausulaConfidencialidad(
            "Clausula de Confidencialidad Estandar",
            "Ambas partes acuerdan mantener en reserva la informacion intercambiada.",
            "ALTO", 5
        ));
        registry.registrar("RESP_CIVIL", new ClausulaResponsabilidad(
            "Clausula de Responsabilidad Civil",
            "La responsabilidad no excedera el monto maximo pactado.",
            50000.00, "Lima, Perú"
        ));

        ClausulaConfidencialidad ndaA =
            (ClausulaConfidencialidad) registry.obtenerClone("NDA_ESTANDAR");
        ndaA.setTitulo("NDA - Corp. Andina S.A.");
        ndaA.setNivelSecreto("MUY ALTO");
        System.out.println("Contrato A:\n" + ndaA);

        ClausulaConfidencialidad ndaB =
            (ClausulaConfidencialidad) registry.obtenerClone("NDA_ESTANDAR");
        ndaB.setTitulo("NDA - Tech Startup SRL");
        System.out.println("\nContrato B:\n" + ndaB);

        ClausulaResponsabilidad respA =
            (ClausulaResponsabilidad) registry.obtenerClone("RESP_CIVIL");
        respA.setMontoMaximoUSD(120000.00);
        respA.setJurisdiccion("Peru, Lima");
        System.out.println("\nResponsabilidad A:\n" + respA);
    }
}
