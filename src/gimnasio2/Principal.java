/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio2;

import usuarios.Sala;
import usuarios.Usuario;

/**
 *
 * @author admin
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // va a la maquina
        
       Usuario usuarioMaquina=new Usuario ();
        usuarioMaquina.setNombre("Silvia");
        usuarioMaquina.setDieta("Dieta blanda");
        usuarioMaquina.setPlan("Pesas");
         // va con monitor
       Usuario usuarioMonitor=new Usuario ();
        usuarioMonitor.setNombre("Pepe");
        usuarioMonitor.setDieta("Dieta ");
        usuarioMonitor.setPlan("Spinning");
         
        // va a la sala comun
         Usuario usuarioComun=new Usuario ();
        usuarioComun.setNombre("Pepe");
        usuarioComun.setDieta("Dieta ");
        usuarioComun.setPlan("Pesa/Spinning");
       
        
        Maquinas maquina1=new Maquinas(usuarioMaquina);
        Monitor monitor1=new Monitor(usuarioMonitor);
        
        Sala salaMaquinas=new Sala(maquina1);
        Sala fitness=new Sala(monitor1);
        Sala comun=new Sala(monitor1, maquina1);
        comun.imprimir();
}
