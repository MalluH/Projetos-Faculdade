/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_av2;

import java.util.ArrayList;

/**
 *
 * @author Estacio
 */
public class Formula1 {

    private String cnpj;
    private String instagramOficial;
    private ArrayList<Piloto> pilotos;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInstagramOficial() {
        return instagramOficial;
    }

    public void setInstagramOficial(String instagramOficial) {
        this.instagramOficial = instagramOficial;
    }

    public ArrayList<Piloto> getPilotos() {
        return pilotos;
    }

    public void setPilotos(ArrayList<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public void listarNomeIdadePilotos() {
       for (int i = 0; i < pilotos.size(); i++) {
           System.out.println("Piloto " + (i + 1));
           System.out.println("Nome: " + pilotos.get(i).getNome() + "Idade: " + pilotos.get(i).getIdade());
        }
//        for(Piloto p: pilotos){
//            System.out.println("Nome: " + p.getNome() + "Idade: " + p.getIdade());
//        }
    }
}
