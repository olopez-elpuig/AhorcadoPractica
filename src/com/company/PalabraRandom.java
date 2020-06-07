package com.company;

public class PalabraRandom {
    Palabras palabra = new Palabras();

//  Formula para calcular un numero (palabra) random, palabras.length será con formula de un maximo de 2 y un minimo de 0.
    int posicionAleatoria = (int) Math.floor(Math.random() * palabra.palabras.length);

//  Hacemos un string para poder coger una palabra random con el indice de posicionAleatoria.
    String palabraRandom = palabra.palabras[posicionAleatoria];


}
