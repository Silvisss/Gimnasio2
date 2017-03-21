package usuarios;

import gimnasio2.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Usuario extends Persona{
 private String plan;
 private String dieta;

    public String getPlan() {
        return plan;
    }

    public String getDieta() {
        return dieta;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
}
