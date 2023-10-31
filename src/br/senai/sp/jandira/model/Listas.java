package br.senai.sp.jandira.model;

import java.time.LocalDate;
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
    public List<Voos> procurarVooDestino(String procurarVoo){
        for (Voos voos : voosList) {
            String destino = voos.getDestino();
            if (destino.equalsIgnoreCase(procurarVoo)){
                voosEncontrados.add(voos);
            }
        }
        return voosEncontrados;
    }

    public List<Voos> procurarVooNumero(int procurarVoo){
        for (Voos voos : voosList) {
            int destino = voos.getNumVoo();
            if (destino == (procurarVoo)){
                voosEncontrados.add(voos);
            }
        }
        return voosEncontrados;
    }

    public List<Voos> procurarVooOrigem(String procurarVoo){
        for (Voos voos : voosList) {
            String origem = voos.getOrigem();
            if (origem.equalsIgnoreCase(procurarVoo)){
                voosEncontrados.add(voos);
            }
        }
        return voosEncontrados;
    }


}
