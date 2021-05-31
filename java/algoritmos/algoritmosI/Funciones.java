package algoritmos.algoritmosI;


public class Funciones {
    // 1. 

// Dadas 2 cadenas de caracteres retornar el número index del caracter que falta:

// Input
//     "Gatos"
//     "Gato"
// Output
//     Falta el caracter s en la posición 4.


// Input
//     "Casa"
//     "Csa"
// Output
//     Falta el caracter a en la posición 1.

    public int indexFaltante(String str1, String str2){
        int faltante = -1;

        for (int i = 0; i < str1.length(); i++) {
            if (i < str2.length()) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    // faltante += str1.charAt(i);
                    return i;
                } 
            }
            else{
                // faltante += str1.charAt(i);
                return i;
            }
            
        }
        return faltante;
    }



// 2. 
// Generar un número aleatorio enre 3 y 7 crear un arreglo de este tamaño, luego generar números aleatorios (cualquier rango) para cada posición y mostrar los datos ingresados.


// Output
//     4, 6, 10, 12, 25


// Output
//     1, 2, 8
}
