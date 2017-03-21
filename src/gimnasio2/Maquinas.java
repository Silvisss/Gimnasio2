/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio2;

import usuarios.Usuario;

/**
 *
 * @author admin
 */
public class Maquinas extends Persona {
    private String marca;
    private String modelo;
    private Usuario usuarioMaquina;
    
    //constructor

    public Maquinas(Usuario usuarioMaquina) {
        this.usuarioMaquina = usuarioMaquina;
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Usuario getUsuarioMaquina() {
        return usuarioMaquina;
    }

    public void setUsuarioMaquina(Usuario usuarioMaquina) {
        this.usuarioMaquina = usuarioMaquina;
    }
    
}
