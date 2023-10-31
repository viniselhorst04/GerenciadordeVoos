package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class Listas {

    List<Voos> voosList = new ArrayList<>();

    public void addVoos(Voos voos) {
        voosList.add(voos);
    }

    public void listarVeiculos() {
        for (Voos voos : voosList) {
            System.out.println("Numero do Voo: " + voos.getNumVoo());
            System.out.println("Origem: " + voos.getOrigem());
            System.out.println("Destino: " + voos.getDestino());
            System.out.println("Data de Partida: " + voos.getDatapartida());
            System.out.println("Hora de Partida: " + voos.getHrpartida());
            System.out.println("Limite de Passageiros: " + voos.getLmtPassageiros());
            System.out.println("Companhia: " + voos.getCompanhia() + "\n");
        }
    }
    public List<Voos> voosEncontrados = new ArrayList<>();
    public List<Voos> procurarVoo(String procurarVoo){
        for (Voos voos : voosList) {
            String destino = voos.getDestino();
            if (destino.equalsIgnoreCase(procurarVoo)){
                voosEncontrados.add(voos);
            }
        }
        return voosEncontrados;
    }

}
