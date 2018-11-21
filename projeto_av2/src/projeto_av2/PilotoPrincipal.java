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
public class PilotoPrincipal extends Piloto{
    private String equipe;

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    @Override
    public float geraValorContrato() {
        return (float) 22.5;
    }
    public void imprimirDadosPilotoPrincipal(){
        System.out.println("Nome: " +this.getNome() + "\n" + "Idade: " +this.getIdade() + "\n" + "Equipe: " + this.getEquipe() + "\n");
        
    }
}
