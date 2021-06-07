package bankaccount;

/**
 * Index
 */
public class Index {

    public static void main(String[] args) {
        System.out.println("cantidad de cuentas: "+Bankaccount.getCantCuentas());
        Bankaccount cuenta1 = new Bankaccount();
        System.out.println("cantidad de cuentas: "+Bankaccount.getCantCuentas());
        Bankaccount cuenta2 = new Bankaccount();
        System.out.println("cantidad de cuentas: "+Bankaccount.getCantCuentas());
        Bankaccount cuenta3 = new Bankaccount();
        System.out.println("cantidad de cuentas: "+Bankaccount.getCantCuentas());
        Bankaccount cuenta4 = new Bankaccount();
        System.out.println("cantidad de cuentas: "+Bankaccount.getCantCuentas());

        System.out.println("numero de cuenta: "+cuenta1.getnCuenta());
        System.out.println("numero de cuenta: "+cuenta2.getnCuenta());
        System.out.println("numero de cuenta: "+cuenta3.getnCuenta());
        System.out.println("numero de cuenta: "+cuenta4.getnCuenta());

        System.out.println("saldo de cuenta de ahorro n°"+cuenta1.getnCuenta()+": "+cuenta1.getAhorro());
        System.out.println("saldo de cuenta corriente n°"+cuenta1.getnCuenta()+": "+cuenta1.getSaldo());

        cuenta1.depositar(1000.0);

        System.out.println("saldo de cuenta de ahorro n°"+cuenta1.getnCuenta()+": "+cuenta1.getAhorro());
        System.out.println("saldo de cuenta corriente n°"+cuenta1.getnCuenta()+": "+cuenta1.getSaldo());
        System.out.println("cantidad total de fondos en el banco: "+Bankaccount.getCantDinero());

        cuenta1.retirar(800.0);

        System.out.println("saldo de cuenta de ahorro n°"+cuenta1.getnCuenta()+": "+cuenta1.getAhorro());
        System.out.println("saldo de cuenta corriente n°"+cuenta1.getnCuenta()+": "+cuenta1.getSaldo());
        System.out.println("cantidad total de fondos en el banco: "+Bankaccount.getCantDinero());

        cuenta1.retirar(800.0);

        System.out.println("saldo de cuenta de ahorro n°"+cuenta1.getnCuenta()+": "+cuenta1.getAhorro());
        System.out.println("saldo de cuenta corriente n°"+cuenta1.getnCuenta()+": "+cuenta1.getSaldo());
        System.out.println("cantidad total de fondos en el banco: "+Bankaccount.getCantDinero());

        Bankaccount.sc.close();
    }
}