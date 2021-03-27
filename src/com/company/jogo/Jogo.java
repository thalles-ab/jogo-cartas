package com.company.jogo;

import com.company.baralho.Baralho;

import java.util.Scanner;

public class Jogo {
    Baralho baralho;
    Scanner leitor;

    public Jogo(){
        leitor = new Scanner(System.in);
        baralho = new Baralho();
    }
}
