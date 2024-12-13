package com.ifpe.iot.entity;

public enum AcessLevel {
    DICENTE("DICENTE"),DOCENTE("DOCENTE"),ADMIN("ADMIN"),CTIC("CTIC")
    ,PESQUISA("PESQUISA"),EXTENSAO("EXTENSAO"),MONITORIA("MONITORIA");
    public final String level;
    AcessLevel(String level) {
        this.level = level;
    }
}
