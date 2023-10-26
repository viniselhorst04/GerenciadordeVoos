package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class GerarTime {

    public LocalDate gerarData(){

        int dia = (int) ((Math.random()*28) + 1);
        int mes = (int) ((Math.random()*12) + 1);
        int ano = (int) ((Math.random()*30) + 2001);
        return LocalDate.of(ano,mes,dia);

    }

    public LocalTime gerarHora(){

        int hora = (int) ((Math.random()*24));
        int min = (int) ((Math.random()*60));
        int second = (int) ((Math.random()*60));


        return LocalTime.of(hora,min,second);
    }


}
