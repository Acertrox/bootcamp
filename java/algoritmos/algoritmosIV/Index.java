package algoritmos.algoritmosIV;

public class Index {
    public static void main(String[] args) {
        Funciones funciones = new Funciones();
        String ejercicio1a = funciones.repetirCaracteres("Gato");
        String ejercicio1b = funciones.repetirCaracteres("Coding Dojo");
        System.out.println("Input: Gato  -  Output: "+ejercicio1a);
        System.out.println("Input: Coding  -  Dojo Output: "+ejercicio1b);

        int[] arreglo1 = new int[]{2,3,4,5,8,7,4,1};
        int[] arreglo2 = new int[]{1,2,3,3,4,5,6,4,3,2};


        System.out.println(funciones.esMontana(arreglo1));
        System.out.println(funciones.esMontana(arreglo2));


        String ejercicio3 = funciones.calificacion(9.5);
        System.out.println(ejercicio3);
    }
}
