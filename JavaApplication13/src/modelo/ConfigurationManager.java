/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author JIMENEZ
 */
public class ConfigurationManager {

    private static ConfigurationManager instancia;

    private String urlBaseDatos;
    private String usuarioBD;
    private String claveBD;
    private String urlServicioWeb;
    private String sistemaOperativo;

    private ConfigurationManager() {
        cargarConfiguracion();
    }

    public static ConfigurationManager getInstancia() {
        if (instancia == null) {
            instancia = new ConfigurationManager();
        }
        return instancia;
    }

    private void cargarConfiguracion() {
        this.urlBaseDatos = "jdbc:mysql://localhost:3306/empresa";
        this.usuarioBD = "admin";
        this.claveBD = "1234";
        this.urlServicioWeb = "https://api.empresa.com";
        this.sistemaOperativo = System.getProperty("os.name");
    }

    public String getUrlBaseDatos() { return urlBaseDatos; }
    public String getUsuarioBD() { return usuarioBD; }
    public String getClaveBD() { return claveBD; }
    public String getUrlServicioWeb() { return urlServicioWeb; }
    public String getSistemaOperativo() { return sistemaOperativo; }
}