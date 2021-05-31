package algoritmos.algoritmosII;

import java.util.Arrays;

public class Index {
    public static void main(String[] args) {

        Funciones funciones = new Funciones();

        float[] array = new float[]{1.f, 2.f, 3.f};

        float[]  ejercicio1 = new float[3];
        float[]  ejercicio2 = new float[3];

        ejercicio1 = funciones.minMaxAvg(array);
        ejercicio2 = funciones.minMaxAvg(1.f,2.f,4.f);

        System.out.println(Arrays.toString(ejercicio1));
        System.out.println(Arrays.toString(ejercicio2));

        int[] arreglo1 = funciones.randomArray();
        int[] arreglo2 = funciones.randomArrayNeg();

        int ejercicio3 = funciones.arrMinimo(arreglo1);
        int ejercicio4 = funciones.arrMaximo(arreglo2);

        System.out.println("el minimo del arreglo '"+Arrays.toString(arreglo1)+"' es: "+ejercicio3);
        System.out.println("el maximo del arreglo '"+Arrays.toString(arreglo2)+"' es: "+ejercicio4);

        float ejercicio5 = funciones.avgArray(arreglo1, arreglo2);
        System.out.println("el promedio del arreglo 1 y el arreglo 2 es: "+ejercicio5);
    }
}
