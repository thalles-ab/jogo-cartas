package com.company.baralho;

public enum EnumNaipe {
    PAUS(1),
    ESPADAS(2),
    OURO(3),
    COPAS(4);

    private final int id;
    EnumNaipe(int id) { this.id = id; }
    public int getValue() { return id; }
}
