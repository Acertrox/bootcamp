package algoritmos.algoritmosIV;

public class Funciones {
// 1. ////////////////////////////
// Generar un algoritmo que tome una cadena y devuelva un nueva cadena con sus dos caracteres repetidos al principio y al final.

// Input
//     "Gato"
// Output
//     "GaGatoto"


// Input
//     "Coding Dojo"
// Output
//     "CoCoding Dojojo"


    public String repetirCaracteres(String palabra){
        String resultado = "";
        resultado += palabra.charAt(0);
        resultado += palabra.charAt(1);
        resultado += palabra;
        resultado += palabra.charAt(palabra.length()-2);
        resultado += palabra.charAt(palabra.length()-1);
        return resultado;
    }

// 2. ////////////////////////////
// Generar un algoritmo que nos devuelva true si un arreglo de números es en tipo montaña o no, es decir, el arreglo siempre va en ascenso hasta que empieza a descencer y ahí va todo en descenso.

// Input:
//     [2,3,4,5,8,5,2,3]
// Output
//     El arreglo es de tipo montaña.


// Input
//     [1,2,3,3,4,5,6,4,3,2]
// Output
//     El arreglo no tiene un formato de montaña.

    public String esMontana(int[] arreglo){
        String resultado = "El arreglo no tiene un formato de montaña.";
        int cuentaArriba = 0;
        int cuentaAbajo = arreglo.length-1;
        for (int i = 1; i < arreglo.length-1; i++) {
            if (arreglo[i]<=arreglo[i-1]) {
                cuentaArriba = i-1;
                
                break;
            }

        }
        for (int i = arreglo.length-2; i > 0; i--) {
            if (arreglo[i]<=arreglo[i+1]) {
                cuentaAbajo = i+1;
                break;
            }
        }
        if (cuentaAbajo == cuentaArriba) {
            resultado = "El arreglo es de tipo montaña.";
        }
        return resultado;
    }


// 3. ////////////////////////////
// Generar un algoritmo que reciba una nota y devuelva:
//     si la nota es menor a 3 "Muy deficiente"
//     si la nota es menor a 5 "Insuficiente"
//     si la nota es menor a 6 "Suficiente"
//     si la nota es menor a 7 "Suficiente"
//     si la nota es menor a 8 "Bien"
//     si la nota es menor a 9 "Notable"
//     si la nota es mayor o igual a 9 "Sobresaliente"



    public String calificacion(double nota){
        if (nota<3.0) {
            return "Muy deficiente";
        }
        else if (nota<5.0) {
            return "Insuficiente";
        }
        else if (nota<7.0) {
            return "Suficiente";
        }
        else if (nota<8.0) {
            return "Bien";
        }
        else if (nota<9.0) {
            return "Notable";
        }
        else{
            return "Sobresaliente";
        }

    }
}