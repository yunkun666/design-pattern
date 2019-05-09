package com.codetears.SimpleFactory.operation;

public class SubOperation extends Operation {

    private Double numA, numB;

    public SubOperation(Double numA, Double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public Double doOperation() {
        return super.result = numA - numB;
    }

}
