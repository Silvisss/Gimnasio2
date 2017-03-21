package gimnasio2;


import usuarios.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Monitor extends Persona {
    
    private String horario;
    private String especialidad;
    private Usuario usuaario;
    
    

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuario getUsuaario() {
        return usuaario;
    }
//constructor
    public Monitor(Usuario usuaario) {
        this.usuaario = usuaario;
    }
    
    
    
    public String getHorario() {
        return horario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Object getUsuario1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
