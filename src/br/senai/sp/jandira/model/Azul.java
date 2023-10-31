package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Azul extends Voos {
    public Azul(int numVoo, String origem, String destino, LocalDate datapartida, LocalTime hrpartida, int lmtPassageiros, String companhia) {
        super(numVoo, origem, destino, datapartida, hrpartida, lmtPassageiros, companhia);
    }
}
