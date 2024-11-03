package com.registro;
/*
* Exercício 1: Registro de Presença
Implemente um sistema para gerenciar a presença de alunos em uma aula.

Cada aluno possui um nome e um ID único.
Permita adicionar um aluno à lista de presença.
Verifique se um aluno específico está presente.
Permita listar todos os alunos presentes de forma que não haja repetição de nomes.



R: usar Set  pois nao pode ter repeticao 

* Exercício 2: Agenda de Compromissos
Desenvolva um sistema que organize compromissos diários.

Cada compromisso tem uma descrição e um horário específico.
Permita adicionar compromissos ao dia.
Organize os compromissos para que estejam sempre em ordem de horário.
Caso um compromisso seja cancelado, ele deve ser removido da agenda.
Implemente uma funcionalidade para exibir o próximo compromisso.

R: Ordem e mantem em ordem alfabetica TreeSet ou TreeMap, TreeMap pra facilitar a busca


*Exercício 3: Controle de Estoque de Produtos
Crie uma aplicação para gerenciar o estoque de uma loja.

Cada produto tem um código de barras e uma quantidade em estoque.
Permita adicionar uma quantidade a um produto já existente ou um novo produto se o código ainda não estiver registrado.
Ao vender uma unidade de um produto, remova uma quantidade do estoque.
Verifique se há um produto em estoque, caso seu código de barras seja fornecido.
Exiba todos os produtos e suas quantidades.

R: map por ter chave e valor alem de precisar sempr eprocurar mais rapido HashMap
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}