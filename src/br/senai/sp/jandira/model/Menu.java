package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Menu {

    public void executarMenu(){

        GerarNumVoo gerarNumVoo = new GerarNumVoo();
        GerarTime gerarTime = new GerarTime();
        Scanner scanner = new Scanner(System.in);
        Voos listVoo = new Voos();

        boolean continuar = true;

        while (continuar){

            System.out.println("-------- AeroVoos --------");
            System.out.println("1- Programar novo voo");
            System.out.println("2- Consultar Voo");
            System.out.println("3- Sair");

            int escolhaUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaUsuario){

                case 1:

                    System.out.println("----- Programar Voo -----");
                    System.out.println("Qual a companhia do seu Voo? [ 1- Gol | 2- LATAM | 3- Azul | 4-Outra ]");
                    int escolhacompanhia = scanner.nextInt();
                    scanner.nextLine();
                    LocalDate dataPartida = gerarTime.gerarData();
                    LocalTime horaPartida = gerarTime.gerarHora();
                    int numVoo = gerarNumVoo.gerarNumVoo();

                    switch (escolhacompanhia){

                        case 1:
                            Voos gol = new Gol(numVoo,"São Paulo","Fortaleza",dataPartida,horaPartida,200,"");
                            gol.setCompanhia("Gol");

                            System.out.println("Programando Voo...");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            }

                            System.out.println("Voo Cadastrado!!");
                            System.out.println("Numero do Voo: " + gol.getNumVoo());
                            System.out.println("Destino: " +gol.getDestino());
                            System.out.println("Companhia: " + gol.getCompanhia());
                            break;

                        case 2:

                            Voos latam = new LATAM(numVoo,"São Paulo","Florianópolis",dataPartida,horaPartida,150,"");
                            latam.setCompanhia("LATAM");

                            System.out.println("Programando Voo...");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            }

                            System.out.println("Voo Cadastrado!!");
                            System.out.println("Numero do Voo: " + latam.getNumVoo());
                            System.out.println("Destino: " +latam.getDestino());
                            System.out.println("Companhia: " + latam.getCompanhia());
                            break;

                        case 3:
                            Voos azul = new Azul(numVoo,"São Paulo","Miami - EUA",dataPartida,horaPartida,300,"");
                            azul.setCompanhia("Azul");
                            Voos objVoo = new Voos();
                            listVoo.addVeiculo(objVoo);
                            System.out.println(listVoo.voosList.size());

                            System.out.println("Programando Voo...");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            }

                            System.out.println("Voo Cadastrado!!");
                            System.out.println("Numero do Voo: " + azul.getNumVoo());
                            System.out.println("Destino: " +azul.getDestino());
                            System.out.println("Companhia: " + azul.getCompanhia());

                            break;

                        case 4:
                            Voos outros = new Voos(numVoo,"São Paulo","Chile",dataPartida,horaPartida,250,"");
                            outros.setCompanhia("Não especificada");

                            System.out.println("Programando Voo...");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                            }

                            System.out.println("Voo Cadastrado!!");
                            System.out.println("Numero do Voo: " + outros.getNumVoo());
                            System.out.println("Destino: " +outros.getDestino());
                            System.out.println("Companhia: " + outros.getCompanhia());
                            break;


                    }

                    break;

                case 2:

                    System.out.println("Digite o Destino do Voo!: ");
                    String vooPesquisado = scanner.nextLine();
                    boolean validaVoo = false;

                    if (vooPesquisado != null && vooPesquisado != ""){
                        validaVoo = listVoo.procurarVoo(vooPesquisado);
                    }
                    if (validaVoo){
                        System.out.println("O " + vooPesquisado + " está disponivel!");

                    }else {
                        System.out.println("O " + vooPesquisado + " não está disponivel!");
                    }
                    break;


                case 3:

                    continuar = false;

                    break;

            }


        }

    }
}
