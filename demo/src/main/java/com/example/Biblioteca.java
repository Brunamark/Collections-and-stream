package com.example;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {


    public Biblioteca(){

    }
    public boolean existeLivrosPublicadosEm(List<Livro> livros, int ano) {
        return livros.stream()
                .anyMatch(livro -> livro.getAnoPublicacao() == ano);
    }

    public List<Livro> getLivrosPorGenero(List<Livro> livros, String genero) {
        return livros.stream() 
            .filter(livro-> livro.getGenero().equalsIgnoreCase(genero))
            .sorted(Comparator.comparing(Livro::getTitulo))
            .collect(Collectors.toList());
    }

    public List<Livro> getLivrosPublicadosComTitulosIniciadosEm(List<Livro> livros, char letra) {
        return livros.stream().filter(livro -> livro.getTitulo().charAt(0) == letra)
                .sorted(Comparator.comparing(Livro::getTitulo))
                .collect(Collectors.toList());
    }

    public int getQuantidadeLivrosPorAutor(List<Livro> livros, String nomeAutor) {
        return livros.stream()
            .filter(livro -> livro.getAutor().getNome().equalsIgnoreCase(nomeAutor))
            .mapToInt(livro -> 1)
            .sum();
    }

    public List<Livro> getLivrosPublicadosQuandoAutorTinhaIdade(List<Livro> livros, int idadeAutorNaPublicacao){
        return livros.stream()
                .filter(livro->(livro.getAnoPublicacao() - livro.getAutor().getAnoNascimento()) == idadeAutorNaPublicacao)
                .collect(Collectors.toList());
    }

}
