package com.registro;

import java.util.HashSet;
import java.util.Set;

//Set nao permite duplicado
public class Registro {
    private Set<Aluno> alunos = new HashSet<>();

    public boolean addAluno(String nome){
        for(Aluno aluno : alunos){
            if(aluno.getNome().equalsIgnoreCase(nome)){
                return false;
            }
        }
        alunos.add(new Aluno(nome));
        return true;
    }
    public boolean verificarAlunoPresente(String nome){
        for(Aluno aluno : alunos){
            if(aluno.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }

    public Set<Aluno> listarALunos(){
        return this.alunos;
    }

}
