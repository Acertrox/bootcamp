package algoritmos.algoritmosV;

import java.util.ArrayList;

public class Funciones {
    ArrayList<Integer> creaArreglo(int tamaño, int val1, int val2){
        if (tamaño>9 || val1>9 || val2>9) {
            return null;
        }
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            resultado.add((i*val1)+val2);
        }
        return resultado;
    }
    String strToASCII(String str){
        String resultado = "";
        for (int i = 0; i < str.length(); i++) {
            resultado += (int) str.charAt(i);
        }
        return resultado;
    }
    
}
