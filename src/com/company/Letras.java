package com.company;

public class Letras {
    PalabraRandom random = new PalabraRandom();
    boolean letra = false;

    char[] letras = random.palabraRandom.toCharArray();

//  Con esta array sustituiremos las letras por guiones
    char[] guiones = new char[letras.length];
}
