package bootcamp.java.Algoritmos;
public class Divisible {
    public static void main(String[] args) {
        int[] arreglo = new int[]{1,3,5,8,9,10,12,15,20};
        for(int i=0; i<arreglo.length; i++){
            if(arreglo[i]%5==0){
                System.out.println(arreglo[i]+" si es divisible por 5");
            }
            else{
                System.out.println(arreglo[i]+" no es divisible por 5");
            }
        }
    }
}
