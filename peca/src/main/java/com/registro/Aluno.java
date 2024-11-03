package com.registro;

public class Aluno {
    private static int idCounter = 1;
    private String nome;
    private int id;
    public Aluno(String Aluno){
        this.id = idCounter++; 
        setNome(Aluno);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String aluno) {
        this.nome = aluno;
    }
    public int getId() {
        return id;
    }

    
}
