package br.senai.sp.jandira.model;

public class GerarNumVoo {

    public Integer gerarNumVoo(){

        int numVooRandom = (int) ((Math.random()*1000)+1);
        return numVooRandom+1000;

    }

}
