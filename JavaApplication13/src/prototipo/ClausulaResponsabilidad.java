/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipo;

public class ClausulaResponsabilidad extends ClausulaLegal {

    private double montoMaximoUSD;
    private String jurisdiccion;

    public ClausulaResponsabilidad(String titulo, String contenido,
                                   double montoMaximoUSD, String jurisdiccion) {
        super(titulo, contenido);
        this.montoMaximoUSD = montoMaximoUSD;
        this.jurisdiccion = jurisdiccion;
    }

    private ClausulaResponsabilidad(ClausulaResponsabilidad original) {
        super(original);
        this.montoMaximoUSD = original.montoMaximoUSD;
        this.jurisdiccion = original.jurisdiccion;
    }

    @Override
    public ClausulaPrototype clonar() {
        return new ClausulaResponsabilidad(this);
    }

    public void setMontoMaximoUSD(double monto) { this.montoMaximoUSD = monto; }
    public void setJurisdiccion(String jurisdiccion) { this.jurisdiccion = jurisdiccion; }

    @Override
    public String toString() {
        return super.toString() +
               String.format("\n  Monto max: USD %.2f\n  Jurisdicc: %s",
                             montoMaximoUSD, jurisdiccion);
    }
}
