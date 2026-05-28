/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.DocumentoLegal;

public interface DocumentoBuilder {

    void construirEncabezado();
    void construirClausulas();
    void construirFirmas();
    void construirAnexos();
    void construirTerminosPago();

    DocumentoLegal obtenerDocumento();
}
