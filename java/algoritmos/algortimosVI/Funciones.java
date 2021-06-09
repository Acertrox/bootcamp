package algoritmos.algortimosVI;

public class Funciones {
    public void sumaPorcentaje(double valor, int porcentaje){
        double valorsuma = valor + (valor * porcentaje / 100);

        System.out.println("Valor: "+valor);
        System.out.println("Porcentaje: "+porcentaje+"% = "+valor*porcentaje/100);
        System.out.println("Total: "+valorsuma);
    }

    public String invertirStr(String str){
        String resultado = "";
        for (int i = str.length()-1; i >=0; i--) {
            resultado += str.charAt(i);
        }
        return resultado;
    }

    public int mayorArr(int[] arreglo){
        int mayor = arreglo[0];
        for (int i : arreglo) {
            if (i>mayor) {
                mayor = i;
            }
        }
        return mayor;
    }
}
