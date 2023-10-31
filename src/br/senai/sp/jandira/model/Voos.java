package br.senai.sp.jandira.model;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Voos {

    private int numVoo, lmtPassageiros;
    private String origem,destino,companhia;
    private LocalDate datapartida;
    private LocalTime hrpartida;




    List<Voos> voosList = new ArrayList<>();

    public void addVeiculo(Voos voos) {
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

    public boolean procurarVoo(String procurarVoo){
        for (Voos voos : voosList) {
            if (voos.destino.equals(procurarVoo)){
                return true;

            }
        }

        return false;
    }



    public Voos (int numVoo, String origem, String destino, LocalDate datapartida, LocalTime hrpartida, int lmtPassageiros,String companhia){

        this.numVoo = numVoo;
        this.origem = origem;
        this.destino = destino;
        this.datapartida = datapartida;
        this.hrpartida = hrpartida;
        this.lmtPassageiros = lmtPassageiros;
        this.companhia = companhia;

    }

    public Voos() {

    }


    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public int getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(int numVoo) {
        this.numVoo = numVoo;
    }

    public int getLmtPassageiros() {
        return lmtPassageiros;
    }

    public void setLmtPassageiros(int lmtPassageiros) {
        this.lmtPassageiros = lmtPassageiros;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDate getDatapartida() {
        return datapartida;
    }

    public void setDatapartida(LocalDate datapartida) {
        this.datapartida = datapartida;
    }

    public LocalTime getHrpartida() {
        return hrpartida;
    }

    public void setHrpartida(LocalTime hrpartida) {
        this.hrpartida = hrpartida;
    }
}
