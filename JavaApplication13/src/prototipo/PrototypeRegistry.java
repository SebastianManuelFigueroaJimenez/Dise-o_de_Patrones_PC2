/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototipo;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {

    private final Map<String, ClausulaPrototype> registro = new HashMap<>();

    public void registrar(String clave, ClausulaPrototype prototipo) {
        registro.put(clave, prototipo);
        System.out.println("[Registry] Prototipo registrado: \"" + clave + "\"");
    }

    public ClausulaPrototype obtenerClone(String clave) {
        ClausulaPrototype prototipo = registro.get(clave);
        if (prototipo == null) {
            throw new IllegalArgumentException(
                "Prototipo no encontrado en el registro: " + clave);
        }
        System.out.println("[Registry] Clonando prototipo: \"" + clave + "\"");
        return prototipo.clonar();
    }

    public boolean existe(String clave) {
        return registro.containsKey(clave);
    }
}
