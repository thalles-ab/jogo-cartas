package com.company.baralho;

public class Carta {
    private EnumNumero numero;
    private EnumNaipe naipe;

    private int valorJogo;

    public EnumNumero getNumero() {
        return numero;
    }

    public void setNumero(EnumNumero numero) {
        this.numero = numero;
    }

    public EnumNaipe getNaipe() {
        return naipe;
    }

    public void setNaipe(EnumNaipe naipe) {
        this.naipe = naipe;
    }

    public int getValorJogo() {
        return valorJogo;
    }

    public void setValorJogo(int valorJogo) {
        this.valorJogo = valorJogo;
    }
}
