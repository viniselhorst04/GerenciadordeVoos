package br.senai.sp.jandira;

import br.senai.sp.jandira.model.GerarTime;
import br.senai.sp.jandira.model.Gol;
import br.senai.sp.jandira.model.Voos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App {

    public static void main(String[] args) {

        GerarTime gerarTime = new GerarTime();

        LocalDate dataPartida = gerarTime.gerarData();
        LocalTime horaPartida = gerarTime.gerarHora();

        Voos gol = new Gol(1,"São Paulo","Fortaleza",dataPartida,horaPartida,200,"GOL");
        System.out.println(gol.getNumVoo());

    }

}
