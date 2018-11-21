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
public class Projeto_av2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilotoPrincipal p1 = new PilotoPrincipal();
        p1.setNome("João");
        p1.setEquipe("Ferrari");
        p1.setIdade(24);

        PilotoPrincipal p2 = new PilotoPrincipal();
        p2.setNome("Maria");
        p2.setEquipe("Lamborghini");
        p2.setIdade(23);

        PilotoTeste p3 = new PilotoTeste();
        p3.setNome("Joana");
        p3.setIdade(27);
        p3.setWhatsapp("+5534984875875");

        Formula1 f1 = new Formula1();
        f1.setCnpj("215654865-15548");
        f1.setInstagramOficial("@formula");

        ArrayList<Piloto> meusPilotos = new ArrayList<>();
        meusPilotos.add(p1);
        meusPilotos.add(p2);
        meusPilotos.add(p3);

        f1.setPilotos(meusPilotos);

        System.out.println("Valor Contrato pPrincipal: " + p1.geraValorContrato());
        
        System.out.println("Valor Contrato pTeste: " + p3.geraValorContrato());
        
        p2.imprimirDadosPilotoPrincipal();
        
        f1.listarNomeIdadePilotos();
    }

}
