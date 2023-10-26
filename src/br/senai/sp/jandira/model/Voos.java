package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Voos {

    private int numVoo, lmtPassageiros;
    private String origem,destino;
    private LocalDate datapartida;
    private LocalTime hrpartida;


    public Voos (int numVoo, String origem, String destino, LocalDate datapartida, LocalTime hrpartida, int lmtPassageiros){

        this.numVoo = numVoo;
        this.origem = origem;
        this.destino = destino;
        this.datapartida = datapartida;
        this.hrpartida = hrpartida;
        this.lmtPassageiros = lmtPassageiros;

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
