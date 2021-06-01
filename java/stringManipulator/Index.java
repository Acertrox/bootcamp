package stringManipulator;

public class Index {
    public static void main(String[] args) {
        StringManipulator funciones = new StringManipulator();
        String ejercicio1 = funciones.trimAndConcat("   Hola    ", "    Mundo   ");
        System.out.println(ejercicio1);

        //ejercicio2
        char letra = 'n';
        System.out.println(funciones.getIndexOrNull("Coding", letra));
        System.out.println(funciones.getIndexOrNull("Hola Mundo", letra));
        System.out.println(funciones.getIndexOrNull("Saludar", letra));


        //ejercicio3
        String palabra = "Hola";
        System.out.println(funciones.getIndexOrNull(palabra, "la"));
        System.out.println(funciones.getIndexOrNull(palabra, "Mundo"));

        String ejercicio4 = funciones.concatSubstring("Hola", 1, 3, "Mundo");
        System.out.println(ejercicio4);

    }
}
