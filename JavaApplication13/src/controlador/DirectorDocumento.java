/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

public class DirectorDocumento {

    private DocumentoBuilder builder;

    public DirectorDocumento(DocumentoBuilder builder) {
        this.builder = builder;
    }

    public void construirDocumentoCompleto() {
        builder.construirEncabezado();
        builder.construirClausulas();
        builder.construirAnexos();
        builder.construirTerminosPago();
        builder.construirFirmas();
    }
}
