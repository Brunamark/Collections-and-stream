package com.registro;

public class Compromisso {
    private String descricao;
    private Integer horario;

    public Compromisso(String descricao, int horario) {
        this.descricao = descricao;
        this.horario = horario;
    }

    public Integer getHorario() {
        return horario;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Compromisso: " + descricao + ", Horário: " + horario;
    }
}
