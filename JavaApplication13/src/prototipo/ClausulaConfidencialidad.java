/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipo;

public class ClausulaConfidencialidad extends ClausulaLegal {

    private String nivelSecreto;
    private int vigenciaAnios;

    public ClausulaConfidencialidad(String titulo, String contenido,
                                    String nivelSecreto, int vigenciaAnios) {
        super(titulo, contenido);
        this.nivelSecreto = nivelSecreto;
        this.vigenciaAnios = vigenciaAnios;
    }

    private ClausulaConfidencialidad(ClausulaConfidencialidad original) {
        super(original);
        this.nivelSecreto = original.nivelSecreto;
        this.vigenciaAnios = original.vigenciaAnios;
    }

    @Override
    public ClausulaPrototype clonar() {
        return new ClausulaConfidencialidad(this);
    }

    public void setNivelSecreto(String nivelSecreto) { this.nivelSecreto = nivelSecreto; }
    public void setVigenciaAnios(int vigenciaAnios) { this.vigenciaAnios = vigenciaAnios; }

    @Override
    public String toString() {
        return super.toString() +
               String.format("\n  Nivel    : %s\n  Vigencia : %d años",
                             nivelSecreto, vigenciaAnios);
    }
}
