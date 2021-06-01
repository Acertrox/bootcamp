package pitagoras;

public class PitagorasTest {
    public static void main(String[] args) {
        int catetoA = 6;
        int catetoB = 8;
        Pitagoras pitagoras = new Pitagoras();
        double hipotenusa = pitagoras.calcularHipotenusa(catetoA, catetoB);
        System.out.println("la hipotenusa del triangulo rectangulo con catetos "+catetoA+" y "+catetoB+" es: "+hipotenusa);
    }
}
