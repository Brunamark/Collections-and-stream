package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Masashi", 1960);
        Livro manga = new Livro("Naruto", "Shounen", 2004, autor1);

        Autor autor2 = new Autor("JK Howling", 1980);
        Livro livro1 = new Livro("HArry Potter", "Fantasia", 2016, autor2);

        Autor autor3 = new Autor("milena", 1970);
        Livro livro3 = new Livro("O Desafio de ferro", "Fantasia", 2012, autor3);

        Biblioteca biblioteca = new Biblioteca();
        List livros = new ArrayList<>();
        livros.add(manga);
        livros.add(livro1);
        livros.add(livro3);
        List<Livro> livrosFantasia = biblioteca.getLivrosPorGenero(livros, "Fantasia");
        System.out.println("Livros do gênero Fantasia: " + livrosFantasia.stream().map(Livro::getTitulo).collect(Collectors.joining(", ")));
    }
}
