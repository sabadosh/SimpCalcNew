package com.main;

import com.calc.Calculation;
import com.operation.OperationFactory;
import static com.console.InputReader.getArgFromConsole;
import static com.console.InputReader.getOperationFromConsole;

public class CalcApp {

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.print("Enter arg :");
        calculation.setArgument1(getArgFromConsole());
        while (true) {
            System.out.print("Enter operation:");
            String operation = getOperationFromConsole();
            calculation.setOperation(OperationFactory.getOperation(operation));
            if (calculation.getOperation().isBinary()) {
                System.out.print("Enter arg:");
                calculation.setArgument2(getArgFromConsole());
            }
            Double result = calculation.calculate();
            calculation.setArgument1(result);
            System.out.println(result);
        }
    }
}
