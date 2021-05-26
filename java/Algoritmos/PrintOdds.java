package bootcamp.java.Algoritmos;

public class PrintOdds {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++) {
            if (i%2==1) {
                System.out.println(i);
            }
        }
    }
}