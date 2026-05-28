/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.DocumentoLegal;

public class ContratoCorporativoBuilder implements DocumentoBuilder {

    private DocumentoLegal documento = new DocumentoLegal();

    public void construirEncabezado() {
        documento.setEncabezado("CONTRATO CORPORATIVO GLOBAL TECH S.A.");
    }

    public void construirClausulas() {
        documento.setClausulas("Clausulas de confidencialidad y responsabilidad.");
    }

    public void construirFirmas() {
        documento.setFirmas("Firmas digitales autorizadas.");
    }

    public void construirAnexos() {
        documento.setAnexos("Anexos tecnicos del servicio.");
    }

    public void construirTerminosPago() {
        documento.setTerminosPago("Pago en 30 dias en USD.");
    }

    public DocumentoLegal obtenerDocumento() {
        return documento;
    }
}
