package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Gol extends Voos {

    String companhia;

    public Gol(int numVoo, String origem, String destino, LocalDate datapartida, LocalTime hrpartida, int lmtPassageiros, String companhia) {
        super(numVoo, origem, destino, datapartida, hrpartida, lmtPassageiros);
        this.companhia = "Gol";
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }
}
