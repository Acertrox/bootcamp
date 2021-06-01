package exceptions;

import java.util.ArrayList;

public class Index {
    public static void main(String[] args) {
        Funciones funciones = new Funciones();
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");
        funciones.castearArreglo(myList);

    }
}
