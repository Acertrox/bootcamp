package calculator2;

public class Index {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.performOperation(10.0);
        calculator.performOperation("+");
        calculator.performOperation(5.0);
        calculator.performOperation("*");
        calculator.performOperation(10.0);
        calculator.performOperation("*");
        calculator.performOperation(10.0);
        calculator.performOperation("+");
        calculator.performOperation(2.0);
        calculator.performOperation("-");
        calculator.performOperation(14.0);
        calculator.performOperation("/");
        calculator.performOperation(7.0);
        calculator.performOperation("=");
        System.out.println(calculator.getResult());
    }
}
