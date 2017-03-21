/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import gimnasio2.Maquinas;
import gimnasio2.Monitor;
import gimnasio2.Utilidades;

/**
 *
 * @author admin
 */
public class Sala implements Utilidades{
    private String nombresala;
    // monitor lleva dependencia de Usuario
    private Monitor monitor;
    //maquina lleva dependencia de Usuario
    private Maquinas maquina;
//constructor sala 3 solo maquinas
    public Sala(Maquinas maquina) {
        this.maquina = maquina;
    }
//constructor para la sala 2 solo monitores y usuarios
    public Sala(Monitor monitor) {
        this.monitor = monitor;
    }

    public Maquinas getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquinas maquina) {
        this.maquina = maquina;
    }
//constructor para sala 1 monitores y maquinas
    public Sala(Monitor monitor, Maquinas maquina) {
        this.monitor = monitor;
        this.maquina = maquina;
    }
    
// acceso a propiedades del objeto monitor
    public String getNombresala() {
        return nombresala;
    }

    public void setNombresala(String nombresala) {
        this.nombresala = nombresala;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    {
        
       
    }
    /*
    System out.println("Nombre Sala:" +this.getNombreSala());
    
    System.out.pr
   */

    @Override
    public void imprimir(){
     
    
    System.out.println("Nombre Sala: "+this.getNombresala());
    System.out.println("Nombre Monitor: "+getMonitor().getNombre());
    System.out.println("Nombre usuario:" +this.getMonitor().getUsuario1().getNombre());
    System.out.println("Nombre Maquina:" +this.getMaquina().getMarca());
    System.out.println("Nombre Usuario/Maquina: " +this.getMaquina().getUsuarioMaquina().getNombre());
    
    
    throw new UnsupportedOperationException("Not supported yet.");
    
}
