/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JIMENEZ
 */
public class DocumentoLegal {

    private String encabezado;
    private String clausulas;
    private String firmas;
    private String anexos;
    private String terminosPago;

    public void setEncabezado(String encabezado) { this.encabezado = encabezado; }
    public void setClausulas(String clausulas) { this.clausulas = clausulas; }
    public void setFirmas(String firmas) { this.firmas = firmas; }
    public void setAnexos(String anexos) { this.anexos = anexos; }
    public void setTerminosPago(String terminosPago) { this.terminosPago = terminosPago; }

    public void mostrarDocumento() {
        System.out.println("===== DOCUMENTO LEGAL =====");
        System.out.println(encabezado);
        System.out.println(clausulas);
        System.out.println(anexos);
        System.out.println(terminosPago);
        System.out.println(firmas);
    }
}

