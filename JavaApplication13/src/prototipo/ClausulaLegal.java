/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipo;

import java.util.ArrayList;
import java.util.List;

public abstract class ClausulaLegal implements ClausulaPrototype {

    protected String titulo;
    protected String contenido;
    protected List<String> anexos;

    public ClausulaLegal(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.anexos = new ArrayList<>();
    }

    protected ClausulaLegal(ClausulaLegal original) {
        this.titulo = original.titulo;
        this.contenido = original.contenido;
        this.anexos = new ArrayList<>(original.anexos);
    }

    public void agregarAnexo(String anexo) { this.anexos.add(anexo); }
    public void setContenido(String contenido) { this.contenido = contenido; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    @Override
    public String toString() {
        return String.format(
            "[%s]\n  Titulo   : %s\n  Contenido: %s\n  Anexos   : %s",
            this.getClass().getSimpleName(), titulo, contenido, anexos
        );
    }
}
