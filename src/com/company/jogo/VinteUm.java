package com.company.jogo;

import com.company.baralho.Baralho;
import com.company.baralho.Carta;

import java.util.ArrayList;
import java.util.List;

public class VinteUm extends Jogo{

    public VinteUm(){
        super();
        System.out.println(" ***** BEM VINDO AO VINTE UM ******");
    }

    public void popular(){
        for (Carta carta : baralho.getCartas()){
            if(carta.getNumero().getValue() >= 10){
                carta.setValorJogo(10);
            }else{
                carta.setValorJogo(carta.getNumero().getValue());
            }
        }
    }

    public void jogar(){
        baralho = new Baralho();
        popular();

        baralho.embaralhar();
        baralho.embaralhar();
        baralho.embaralhar();

        List<Carta> minhasCartas = new ArrayList<>();
        baralho.exibirBaralho();

        System.out.println(" QUER UMA CARTA? ");
        System.out.println(" 1 - SIM ");
        System.out.println(" 2 - NÃO ");
        while (leitor.nextInt() == 1){
            minhasCartas.add(baralho.proximaCarta());
            int soma = 0;
            System.out.println("SUAS CARTAS :");
            for (Carta carta : minhasCartas){
                System.out.println(carta.getNumero()+ " de " + carta.getNaipe());
                soma += carta.getValorJogo();
            }
            System.out.printf("VALOR : " + soma + "\n");

            if(soma >= 21) {
                if(soma == 21) {
                    System.out.println(" PARABÉNS VOCÊ GANHOU ");
                }else{
                    System.out.println(" VOCÊ PERDEU - TROUXA ");
                }

                System.out.println(" QUER JOGAR DE NOVO? ");
                System.out.println(" 1 - SIM ");
                System.out.println(" 2 - NÃO ");

                if (leitor.nextInt() == 1) {
                    jogar();
                }
            }
            else {
                System.out.println(" QUER UMA CARTA? ");
                System.out.println(" 1 - SIM ");
                System.out.println(" 2 - NÃO ");
            }
        }

        // getRandon() % 2 == 0; -- SE SIM, CONTINUA SE NÃO PARA
        System.out.println(" MUITO OBRIGADO ");
    }

}
