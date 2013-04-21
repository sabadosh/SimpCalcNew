package com.operation;

public class OperationFactory {

    public static Operation getOperation(String criteria){
        if (criteria.equals("+")) {
            return new SumOperation();
        } else if (criteria.equals("cos")) {
            return new CosOperation();
        } else if (criteria.equals("-")){
            return new DiffOperation();
        } else if (criteria.equals("*")){
            return new MultOperation();
        } else if (criteria.equals("/")){
            return new DivOperation();
        } else if (criteria.equals("sin")){
            return new SinOperation();
        } else if (criteria.equals("sqr")){
            return new SqrOperation();
        }  else if (criteria.equals("sqrt")){
            return new SqrtOperation();
        }

        else return null;
    }
}
