package basics;

import java.util.Arrays;

public class Funciones {
    public void printTo255(){
        for (int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void printOddsTo255(){
        for (int i = 1; i < 256; i++) {
            if (i%2==1) {
                System.out.println(i);
            }
        }
    }

    public void printSum(){
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum += i;
            System.out.println("Nuevo Numero: "+i+" Suma: "+sum);
        }
    }

    public void printArr(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }

    public void printMax(int[] array){
        int max = array[0];

        for (int i : array) {
            if (max<i) {
                max = i;
            }
        }
        System.out.println("El valor máximo del arreglo: "+Arrays.toString(array)+" es: "+max);
    }

    public void printAvg(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum/(float)array.length);
    }

    public void createArray(){
        int[] y = new int[(int) Math.ceil(255/2)+1];
        int indice = 0;
        for (int i = 0; i < 256; i++) {
            if (i%2==1) {
                y[indice] = i;
                indice++;
            }
        }
        System.out.println("el nuevo arreglo es: "+Arrays.toString(y));
    }

    public void mayorQue(int[] arreglo, int valor){
        int cuenta = 0;
        for (int i : arreglo) {
            if (i>valor) {
                cuenta+=1;
            }
        }
        System.out.println(cuenta);
    }

    public void arregloCuadrado(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]*=arreglo[i];
        }
        System.out.println("el nuevo arreglo es: "+Arrays.toString(arreglo));
    }

    public void noNeg(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]<0) {
                arreglo[i] = 0;
            }
        }
        System.out.println("el nuevo arreglo es: "+Arrays.toString(arreglo));
    }

    public float[] minMaxAvg(int[] arreglo){
        float[] resultado = new float[3];
        int max = arreglo[0];
        int min = arreglo[0];
        int sum = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (max<arreglo[i]) {
                max = arreglo[i];
            }
            if (min>arreglo[i]) {
                min = arreglo[i];
            }
            sum += arreglo[i];
        }
        resultado[0] = min;
        resultado[1] = max;
        resultado[2] = sum/(float)arreglo.length;
        System.out.println("el nuevo arreglo es: "+Arrays.toString(resultado));
        return resultado;
    }

    public void cambiaValores(int[] arreglo){
        for (int i = 1; i < arreglo.length; i++) {
            arreglo[i-1] = arreglo[i];
        }
        arreglo[arreglo.length-1] = 0;
        System.out.println("el nuevo arreglo es: "+Arrays.toString(arreglo));
    }
}
