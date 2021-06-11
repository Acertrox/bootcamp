package algoritmos.algoritmosVII;

/**
 * Index
 */
public class Index {
    public static void main(String[] args) {
        Funciones funciones = new Funciones();
        // System.out.println(funciones.upperCase("C asdasA SDASD"));

        
        String[] arreglo = new String[]{"Caasd", "o", "d", "i", "n", "g"};

        String[] arreglo2 = new String[]{"C", "o", "d", "2", "i", "n", "g", "2"};

        System.out.println(funciones.noNumber(arreglo));
        System.out.println(funciones.noNumber(arreglo2));
    }

    

}