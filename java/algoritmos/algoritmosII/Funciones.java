package algoritmos.algoritmosII;


public class Funciones {
// 1. **Crear un algoritmo que reciba un arreglo y devuelva un objeto con el minimo, el maximo y el promedio.

    public float[] minMaxAvg(float[] array){
        float minimo = array[0];
        float maximo = array[0];
        float suma = 0;
        float[]resultado = new float[3];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maximo) {
                maximo = array[i];
            }
            if (array[i]<minimo) {
                minimo = array[i];
            }
            suma += array[i];
        }
        resultado[0] = minimo;
        resultado[1] = maximo;
        resultado[2] = suma/array.length;
        return resultado;
    }

// 2. **Crear un algoritmo que reciba 3 valores y devuelva un objeto con minimo, maximo y promedio.

public float[] minMaxAvg(float num1, float num2, float num3){
    float minimo = num1;
    float maximo = num1;
    float suma = 0;
    float[] array = new float[]{num1, num2, num3};
    float[]resultado = new float[3];
    for (int i = 0; i < array.length; i++) {
        if (array[i]>maximo) {
            maximo = array[i];
        }
        if (array[i]<minimo) {
            minimo = array[i];
        }
        suma += array[i];
    }
    resultado[0] = minimo;
    resultado[1] = maximo;
    resultado[2] = suma/array.length;
    return resultado;
}

// 3. **Crear un algoritmo que cree un arreglo y genere 20 numeros aleatorios entre 50 y 100 y devuelva el valor minimo del arreglo.

public int[] randomArray(){
    int[] resultado = new int[20];
    
    int random = 0;
    for (int i = 0; i < resultado.length; i++) {
        random = (int) Math.floor((Math.random()*51)+50);
        resultado[i] = random;
    }
    return resultado;
}

public int arrMinimo(int[] array){
    int minimo = array[0];
    for (int i = 0; i < array.length; i++) {
        if(array[i] < minimo){
            minimo = array[i];
        }
    }
    return minimo;
}



// 4. **Crear un algoritmo que cree un arreglo y genere 20 numeros negativos aleatorios entre -50 y -100 y devuelva el valor maximo del arreglo.
public int[] randomArrayNeg(){
    int[] resultado = new int[20];
    
    int random = 0;
    for (int i = 0; i < resultado.length; i++) {
        random = -1 *(int) Math.floor((Math.random()*51)+50);
        resultado[i] = random;
    }
    return resultado;
}

public int arrMaximo(int[] array){
    int maximo = array[0];
    for (int i = 0; i < array.length; i++) {
        if(array[i] > maximo){
            maximo = array[i];
        }
    }
    return maximo;
}

// 5. **Crear un algoritmo que obtenga el promedio de los 2 arreglos anteriores.

public float avgArray(int[] arr1,int[] arr2){
    int suma = 0;
    for (int i : arr1) {
        suma += i;
    }
    for (int i : arr2) {
        suma += i;
    }
    return (float) suma / (arr1.length + arr2.length);
}

}
