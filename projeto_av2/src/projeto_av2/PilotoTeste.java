/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_av2;

/**
 *
 * @author Estacio
 */
public class PilotoTeste extends Piloto{
    private String whatsapp;

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }
    @Override
    public float geraValorContrato(){
        return (float) 0.5;
    }
}
