package calculator;


public class Calculator implements java.io.Serializable{
    private double operandOne = 0.0;
    private String operation = "";
    private double operandTwo = 0.0;
    private double resultado = 0.0;

    public void performOperation(){
        double resultado =-1.0;
        if (operation == "+"){
            resultado = operandOne + operandTwo;
            setOperation("");
        }
        if (operation == "-") {
            resultado = operandOne - operandTwo;
            setOperation("");
        }
        setResultado(resultado);
    }

    public double getOperandOne() {
        return operandOne;
    }
    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public double getOperandTwo() {
        return operandTwo;
    }
    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
