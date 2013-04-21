package com.calc;

import com.operation.Operation;
import java.util.HashMap;
import java.util.Map;

public class Calculation {

    public Double argument1;
    public Double argument2;
    public Operation operation;

    public Double getArgument1() {
        return argument1;
    }

    public void setArgument1(Double argument1) {
        this.argument1 = argument1;
    }

    public Double getArgument2() {
        return argument2;
    }

    public void setArgument2(Double argument2) {
        this.argument2 = argument2;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public Double calculate() {
        Map<String, Object> calcMap = new HashMap<String, Object>();
        calcMap.put("arg1", getArgument1());
        calcMap.put("arg2", getArgument2());
        Map<String, Object> res = operation.calculate(calcMap);
        return (Double) res.get("result");
    }


}
