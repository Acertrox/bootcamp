package bootcamp.java.algoritmos.algo;

public class Index {
    public static void main(String[] args) {
        Funciones funcion = new Funciones();
        String str1 = "Gatos";
        String str2 = "Gato";
        int faltante = funcion.indexFaltante(str1, str2);
        System.out.println("Falta el caracter "+str1.charAt(faltante)+" en la posición: "+faltante);
        str1 = "Casa";
        str2 = "Csa";
        int faltante2 = funcion.indexFaltante(str1, str2);
        System.out.println("Falta el caracter "+str1.charAt(faltante2)+" en la posición: "+faltante2);
    }
}
