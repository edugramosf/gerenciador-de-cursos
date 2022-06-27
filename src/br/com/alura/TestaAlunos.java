package br.com.alura;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sérgio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Maurício Aniche");
        alunos.add("Alberto Souza");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Sérgio Lopes");

        System.out.println(pauloEstaMatriculado);
        System.out.println();

        System.out.println(alunos.size());
        System.out.println();

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("_________________");
        System.out.println();
        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println();
        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);

    }
}
