
public class Pitagoras {
    public static double calcularHipotenusa(int catetoA, int catetoB){
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2)+Math.pow(catetoB, 2));
        
        return hipotenusa;
    }
    public static void main(String[] args) {
        int catetoA = 6;
        int catetoB = 8;
        double hipotenusa = calcularHipotenusa(catetoA, catetoB);
        System.out.println("la hipotenusa del triangulo rectangulo con catetos "+catetoA+" y "+catetoB+" es: "+hipotenusa);
    }
}
