package com.company.baralho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho(){
        cartas = new ArrayList<>();
        popular();
    }

    private void popular(){
        for (EnumNaipe naipe : EnumNaipe.values()) {
            for (EnumNumero numero : EnumNumero.values()){
                Carta carta = new Carta();
                carta.setNaipe(naipe);
                carta.setNumero(numero);
                cartas.add(carta);
            }
        }
    }

    public void embaralhar(){
        Carta[] cartasAux = new Carta[52];

        for (Carta carta : cartas){
            int posicao = getRandonPosition();

            while(cartasAux[posicao] != null){
                posicao = getRandonPosition();
            }

            cartasAux[posicao] = carta;
        }

        cartas = new LinkedList<>(Arrays.asList(cartasAux));
    }

    public void exibirBaralho(){
        System.out.println("  ******************************** EXIBINDO BARALHO *************************************************** ");
        for (Carta carta : cartas){
            System.out.printf(" - CARTA : " + carta.getNumero() + " de " + carta.getNaipe());
        }
        System.out.printf("\n VOCÊ TEM " + cartas.size() + " CARTAS \n");
    }

    public List<Carta> getCartas(){
        return cartas;
    }

    private int getRandonPosition(){
        int min = 0;
        int max = (EnumNaipe.values().length * EnumNumero.values().length) - 1;
        Double x = (Math.random()*((max-min)+1))+min;
        return x.intValue();
    }

    /**** PEGA UMA CARTA EM UMA POSIÇÃO ALEATÓRIO DO BARALHO,
     * E A REMOVE DA LISTA
     * @return
     */
    public Carta pegarCartaAleatoria(){
        int posicao = getRandonPosition();
        while (posicao >= cartas.size()-1){
            posicao = getRandonPosition();
        }

        Carta carta = cartas.get(posicao);
        cartas.remove(carta);
        return carta;
    }

    /**** PEGA UMA CARTA EM SEQUÊNCIA
     * E A REMOVE DA LISTA
     * @return
     */
    public Carta proximaCarta(){
        Carta carta = cartas.get(0);
        cartas.remove(carta);
        return carta;
    }
}
