package algoritmos.algoritmosV;

public class Index {
    public static void main(String[] args) {
        Funciones funciones = new Funciones();
        int val1 = 3;
        int val2 = 5;
        int val3 = 2;

        System.out.println((funciones.creaArreglo(val1, val2, val3)));

        String cadena = "Coding Dojo";

        System.out.println(funciones.strToASCII(cadena));
    }
}
