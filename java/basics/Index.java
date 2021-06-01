package basics;

public class Index {
    public static void main(String[] args) {
        Funciones funciones = new Funciones();

        //ejercicio1
        funciones.printTo255();
        System.out.println();

        //ejercicio2
        funciones.printOddsTo255();
        System.out.println();

        //ejercicio3
        funciones.printSum();
        System.out.println();

        //ejercicio4
        int[] array = new int[]{1,3,5,7,9,13};
        funciones.printArr(array);
        System.out.println();

        //ejercicio5
        funciones.printMax(array);
        System.out.println();

        //ejercicio6
        funciones.printAvg(array);
        System.out.println();

        //ejercicio7
        funciones.createArray();
        System.out.println();

        //ejercicio8
        int[] array2 = new int[]{1,3,5,7};
        funciones.mayorQue(array2, 3);
        System.out.println();

        //ejercicio9
        int[] array3 = new int[]{1,5,10,-2};
        funciones.arregloCuadrado(array3);
        System.out.println();

        //ejercicio10
        int[] array4 = new int[]{1,5,10,-2};
        funciones.noNeg(array4);
        System.out.println();

        //ejercicio11
        funciones.minMaxAvg(array4);
        System.out.println();

        //ejercicio12
        int[] array5 = new int[]{1,5,10,7,-2};
        funciones.cambiaValores(array5);
    }
}
