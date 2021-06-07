package calculator2;

import java.io.Serializable;
import java.util.ArrayList;

public class Calculator implements Serializable{
    private ArrayList<Object> operations = new ArrayList<>();
    private double resultOp = 0.0;
    
    public void performOperation(double operation) {
        operations.add(operation);
    }
    public void performOperation(String operation) {
        if (operation == "=") {
            calcLogic(operations);
        }
        else{
            operations.add(operation);
        }
    }
    public void calcLogic(ArrayList<Object> operations){
        ArrayList<Object> resultProd = new ArrayList<>();
        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i) != "*" && operations.get(i) != "/"){
                resultProd.add(operations.get(i));
            }
            else {
                resultProd.remove(resultProd.size()-1);
                if (operations.get(i-1) instanceof Double && operations.get(i+1) instanceof Double) {
                    if (operations.get(i) == "*") {
                        Double op = (Double) operations.get(i-1) * (Double) operations.get(i+1);
                        resultProd.add(op);
                        operations.set(i+1, op);
                    }
                    else{
                        Double op = (Double) operations.get(i-1) / (Double) operations.get(i+1);
                        resultProd.add(op);
                        operations.set(i+1, op);
                    }
                    i++;
                }
                else{
                    resultProd.add("err");
                }
            }
        }
        ArrayList<Object> result = new ArrayList<>();
        for (int i = 0; i < resultProd.size(); i++) {
            if (resultProd.get(i) != "+" && resultProd.get(i) != "-"){
                result.add(resultProd.get(i));
            }
            else {
                result.remove(result.size()-1);
                if (resultProd.get(i-1) instanceof Double && resultProd.get(i+1) instanceof Double) {
                    if (resultProd.get(i) == "+") {
                        Double op = (Double) resultProd.get(i-1) + (Double) resultProd.get(i+1);
                        result.add(op);
                        resultProd.set(i+1, op);
                    }
                    else{
                        Double op = (Double) resultProd.get(i-1) - (Double) resultProd.get(i+1);
                        result.add(op);
                        resultProd.set(i+1, op);
                    }
                    i++;
                }
                else{
                    result.add("err");
                }
            }
        }
        if (result.size() > 1) {
            System.out.println("Syntax error: result will give -1.0");
            this.setResult(-1.0);
        }
        else if (result.size() == 1){
            System.out.println("Success");
            this.setResult((Double) result.get(0));
        }
    }

    public void setOperations(ArrayList<Object> operations) {
        this.operations = operations;
    }
    public ArrayList<Object> getOperations() {
        return operations;
    }
    public double getResult() {
        return resultOp;
    }
    public void setResult(double resultOp) {
        this.resultOp = resultOp;
    }
}
