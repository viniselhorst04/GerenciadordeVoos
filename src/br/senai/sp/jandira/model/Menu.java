package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public void executarMenu(){

        GerarNumVoo gerarNumVoo = new GerarNumVoo();
        GerarTime gerarTime = new GerarTime();
        Scanner scanner = new Scanner(System.in);
        Listas vooList = new Listas();

        boolean continuar = true;

        while (continuar){

            System.out.println("-------- AeroVoos --------");
            System.out.println("1- Programar novo voo");
            System.out.println("2- Consultar Voo");
            System.out.println("3- Sair");

            System.out.println("Escolha a opção desejada:");

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
                            vooList.addVoos(gol);
                            System.out.println(vooList.voosList.size());

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
                            vooList.addVoos(latam);
                            System.out.println(vooList.voosList.size());

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
                            Voos azul = new Azul(numVoo,"São Paulo","Miami",dataPartida,horaPartida,300,"");
                            azul.setCompanhia("Azul");
                            vooList.addVoos(azul);
                            System.out.println(vooList.voosList.size());

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

                    System.out.println(" Como deseja pesquisar seu voo? [ 1- Numero do Voo | 2- Destino | 3- Origem | 4- Data de Partida");
                    int escolhaconsulta = scanner.nextInt();
                    scanner.nextLine();

                    switch (escolhaconsulta){

                        case 1:

                            System.out.println("Digite o Numero do Voo!: ");
                            int vooPesquisadoN = scanner.nextInt();
                            List<Voos> validaVoo = null;

                            if (vooPesquisadoN !=0){
                                validaVoo = vooList.procurarVooNumero(vooPesquisadoN);
                            }
                            if (validaVoo != null){

                                for (Voos voosEncontrados: validaVoo) {
                                    System.out.println("O voo " + voosEncontrados.getNumVoo() + " está disponivel\n" );
                                    System.out.println(" ------------ INFORMAÇÕES DO VOO -------------- " );
                                    System.out.println("Numero do Voo: " + voosEncontrados.getNumVoo());
                                    System.out.println("Origem: " + voosEncontrados.getOrigem());
                                    System.out.println("Destino: " + voosEncontrados.getDestino());
                                    System.out.println("Data de Partida: " + voosEncontrados.getDatapartida());
                                    System.out.println("Hora de Partida: " + voosEncontrados.getHrpartida());
                                    System.out.println("Limite de Passageiros: " + voosEncontrados.getLmtPassageiros());
                                    System.out.println("Companhia: " + voosEncontrados.getCompanhia() + "\n");
                                }

                            }else {
                                System.out.println("O " + vooPesquisadoN + " não está disponivel!");
                            }
                            break;

                        case 2:

                            System.out.println("Digite o Destino do Voo!: ");
                            String vooPesquisado = scanner.nextLine();
                            List<Voos> validaVooD = null;

                            if (vooPesquisado != null && vooPesquisado != ""){
                                validaVooD = vooList.procurarVooDestino(vooPesquisado);
                            }
                            if (validaVooD != null){

                                for (Voos voosEncontrados: validaVooD) {
                                    System.out.println("O voo para " + vooPesquisado + " está disponivel" );
                                    System.out.println(" ------------ INFORMAÇÕES DO VOO -------------- " );
                                    System.out.println("Numero do Voo: " + voosEncontrados.getNumVoo());
                                    System.out.println("Origem: " + voosEncontrados.getOrigem());
                                    System.out.println("Destino: " + voosEncontrados.getDestino());
                                    System.out.println("Data de Partida: " + voosEncontrados.getDatapartida());
                                    System.out.println("Hora de Partida: " + voosEncontrados.getHrpartida());
                                    System.out.println("Limite de Passageiros: " + voosEncontrados.getLmtPassageiros());
                                    System.out.println("Companhia: " + voosEncontrados.getCompanhia() + "\n");

                                }
                            }else {
                                System.out.println("O " + vooPesquisado + " não está disponivel!");
                            }
                            break;

                        case 3:
                            System.out.println("Digite o Origem do Voo!: ");
                            String OrigemPesquisado = scanner.nextLine();
                            List<Voos> validaVooOrigem = null;

                            if (OrigemPesquisado != null && OrigemPesquisado != ""){
                                validaVooOrigem = vooList.procurarVooOrigem(OrigemPesquisado);
                            }
                            if (validaVooOrigem != null){

                                for (Voos voosEncontrados: validaVooOrigem) {
                                    System.out.println("O voo para " + voosEncontrados.getOrigem() + " está disponivel" );
                                    System.out.println(" ------------ INFORMAÇÕES DO VOO -------------- " );
                                    System.out.println("Numero do Voo: " + voosEncontrados.getNumVoo());
                                    System.out.println("Origem: " + voosEncontrados.getOrigem());
                                    System.out.println("Destino: " + voosEncontrados.getDestino());
                                    System.out.println("Data de Partida: " + voosEncontrados.getDatapartida());
                                    System.out.println("Hora de Partida: " + voosEncontrados.getHrpartida());
                                    System.out.println("Limite de Passageiros: " + voosEncontrados.getLmtPassageiros());
                                    System.out.println("Companhia: " + voosEncontrados.getCompanhia() + "\n");

                                }
                            }else {
                                System.out.println("O " + OrigemPesquisado + " não está disponivel!");
                            }
                            break;

                    }

                    break;

                case 3:
                    continuar = false;
                    break;


            }


        }

    }
}
