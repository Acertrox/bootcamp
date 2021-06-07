package bankaccount;

import java.util.Scanner;

public class Bankaccount {

    public Bankaccount(){
        setnCuenta(cuentaRandom());
        setCantCuentas(getCantCuentas()+1);
    }

    private String nCuenta;
    private double saldo;
    private double ahorro;
    private static int cantCuentas = 0;
    private static double cantDinero = 0;
    public static Scanner sc = new Scanner(System.in);

    private String cuentaRandom(){
        String resultado = "";
        for (int i = 0; i < 10; i++) {
            resultado += (int) Math.floor(Math.random()*10);
        }
        return resultado;
    }

    public void depositar(double cantidad){
        int cuenta = 0;
        while (cuenta == 0) {
            System.out.println("Por favor indique la cuenta a la cual depositar:\n1.-Ahorro\n2.-Corriente");
            cuenta = sc.nextInt();
            sc.nextLine();
            if (cuenta!=1 && cuenta!=2){
                System.out.println("opción invalida");
                cuenta=0;
            }
        }
        if (cuenta == 1){
            setAhorro(getAhorro()+cantidad);
            System.out.println("operación exitosa, su saldo actual en su cuenta de ahorro es de: "+getAhorro());
        }
        else{
            setSaldo(getSaldo()+cantidad);
            System.out.println("operación exitosa, su saldo actual en su cuenta corriente es de: "+getSaldo());
        }
        setCantDinero(getCantDinero()+cantidad);
    }

    public void retirar(double cantidad){
        int cuenta = 0;
        while (cuenta == 0) {
            System.out.println("Por favor indique la cuenta desde la cual girar:\n1.-Ahorro\n2.-Corriente");
            cuenta = sc.nextInt();
            sc.nextLine();
            if (cuenta!=1 && cuenta!=2){
                System.out.println("opción invalida");
                cuenta=0;
            }
        }
        if (cuenta == 1) {
            if(getAhorro()>=cantidad){
                setAhorro(getAhorro()-cantidad);
                System.out.println("operación exitosa, su saldo actual en su cuenta de ahorro es de: "+getAhorro());
                setCantDinero(getCantDinero()-cantidad);
            }
            else{
                System.out.println("operacion fallida, fondos insuficientes");
            }
        }
        else{
            if(getSaldo()>=cantidad){
                setSaldo(getSaldo()-cantidad);
                System.out.println("operación exitosa, su saldo actual en su cuenta corriente es de: "+getSaldo());
                setCantDinero(getCantDinero()-cantidad);
            }
            else{
                System.out.println("operacion fallida, fondos insuficientes");
            }
        }
    }
    public void cantAmbasCuentas(){
        System.out.println("Saldo cuenta corriente: "+getSaldo()+"\nSaldo cuenta de ahorro: "+getAhorro());
    }

    public String getnCuenta() {
        return nCuenta;
    }
    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getAhorro() {
        return ahorro;
    }
    public void setAhorro(double ahorro) {
        this.ahorro = ahorro;
    }
    public static int getCantCuentas() {
        return cantCuentas;
    }
    public static void setCantCuentas(int cantCuentas) {
        Bankaccount.cantCuentas = cantCuentas;
    }
    public static double getCantDinero() {
        return cantDinero;
    }
    public static void setCantDinero(double cantDinero) {
        Bankaccount.cantDinero = cantDinero;
    }
    

}
