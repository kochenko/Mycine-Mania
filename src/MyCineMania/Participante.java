/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MyCineMania;

/**
 *
 * @author Daniel
 */
public class Participante extends Pessoa{
    //private file? comp_pcf;
    private boolean validado; 

    
    public Participante() {
        this.validado = false;
    }
    
    public boolean isValidado() {
        return validado;
    }

    public void setValidado(boolean validado) {
        this.validado = validado;
    }

    
}
