package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class LATAM extends Voos{

    public LATAM(int numVoo, String origem, String destino, LocalDate datapartida, LocalTime hrpartida, int lmtPassageiros, String companhia) {
        super(numVoo, origem, destino, datapartida, hrpartida, lmtPassageiros, companhia);
    }
}
