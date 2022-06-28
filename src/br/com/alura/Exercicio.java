package br.com.alura;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fábio Pimentel");
        pessoas.put(19, "Sílvio Mattos");
        pessoas.put(23, "Rômulo Henrique");

        pessoas.keySet().forEach(idade -> {
            System.out.println(pessoas.get(idade));
        });
    }
}
