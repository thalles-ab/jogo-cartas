package com.company.baralho;

public enum EnumNumero {
    AS(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    OITO(8),
    NOVE(9),
    DEZ(10),
    VALETE(11),
    DAMA(12),
    REI(13);

    private final int id;
    EnumNumero(int id) { this.id = id; }
    public int getValue() { return id; }
}
