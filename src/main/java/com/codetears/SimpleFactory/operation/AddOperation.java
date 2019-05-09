package com.codetears.SimpleFactory.operation;

public class AddOperation extends Operation {

    private Double numA, numB;

    public AddOperation(Double numA, Double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public Double doOperation() {
        return super.result = numA + numB;
    }

}
