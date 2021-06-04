package puzzlejava;

import java.util.ArrayList;
import java.util.Collections;

public class Index {
    public static void main(String[] args) {
        PuzzleJava puzzles = new PuzzleJava();

        //ejercicio1

        System.out.println("ejercicio 1:\n");

        Integer[] array = new Integer[]{3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> lista = new ArrayList<>();
        Collections.addAll(lista, array);

        System.out.println(puzzles.mayorQue(lista, 10));
        System.out.println();

        //ejercicio2

        System.out.println("ejercicio 2:\n");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Nancy");
        lista2.add("Jinichi");
        lista2.add("Fujibayashi");
        lista2.add("Momochi");
        lista2.add("Ishikawa");

        System.out.println(puzzles.masDe5(lista2));

        System.out.println();

        //ejercicio3

        System.out.println("ejercicio 3:\n");

        puzzles.crearAlfabeto();

        System.out.println();

        //ejercicio4

        System.out.println("ejercicio 4:\n");

        System.out.println(puzzles.creaListaRandom(55, 100, 10));

        System.out.println();

        //ejercicio5

        System.out.println("ejercicio 5:\n");

        ArrayList<Integer> lista3 = puzzles.creaListaRandom(55, 100, 10);
        Collections.sort(lista3);
        puzzles.printArray(lista3);
        System.out.println("el valor minimo de la lista es: "+puzzles.minList(lista3)); 
        System.out.println("el valor maximo de la lista es: "+puzzles.maxList(lista3));

        System.out.println();

        //ejercicio6

        System.out.println("ejercicio 6:\n");

        System.out.println("5 caracteres aleatorios: "+puzzles.createString());

        System.out.println();

        //ejercicio7

        System.out.println("ejercicio 7:\n");

        System.out.println("10 strings aleatorios: "+puzzles.joinString(10, " "));

        System.out.println();

    }
    
}
