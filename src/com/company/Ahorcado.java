package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        Palabras palabras = new Palabras();
        PalabraRandom random = new PalabraRandom();
        Letras letras = new Letras();
        Vidas vida = new Vidas();



//      Este for cambiará las letras que tiene la palabrá por guiones.
        for (int i = 0; i < letras.letras.length; i++) {
            letras.guiones[i] = '-';
        }
        System.out.println(letras.guiones);


        boolean juego = false;
        boolean victoria = false;
        boolean derrota = false;

//      Mientras no hayamos ganado el bucle se repetirá. Si la letra es diferente nos restará una vida en caso de llegar a 0 perderemos.
        while (juego == false) {

            System.out.println("vidas: " + vida.vidas);
            System.out.println("Introduce una letra");


            Scanner teclado = new Scanner(System.in);
//      Le creamos este char para leer la letra introducida por nuestro teclado. Para poder leer el char le añadimos el charAt(0) para que coja la primera letra.
            char letraIntroducida = teclado.next().charAt(0);

//      Este bucle lo usamos para recorrer letras para saber si la letra esta dentro de la palabra.
            for (int i = 0; i < letras.letras.length; i++) {
                if (letras.letras[i] == letraIntroducida) {
                    letras.guiones[i] = letraIntroducida; // Aqui se cambiará el guion por la letra introducida.
                    letras.letra = true;
                }
            }
            if (!letras.letra){
                vida.vidas--;
            }
            System.out.println(letras.guiones);

            if (vida.vidas == 0) {
                System.out.println("Has perdido!");
                derrota = true;
                juego = true;

            }
            if (Arrays.equals(letras.letras, letras.guiones)){
                System.out.println("Has ganado!");
                victoria = true;
                juego = true;
            }
        }
    }
}
