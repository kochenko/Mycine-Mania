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
public class Administrador extends Pessoa{
    private double valor_adesao; 

    public Administrador() {
        this.valor_adesao = 0;
    }

    public double getValor_adesao() {
        return valor_adesao;
    }

    public void setValor_adesao(double valor_adesao) {
        this.valor_adesao = valor_adesao;
    }
    
    
    
}
