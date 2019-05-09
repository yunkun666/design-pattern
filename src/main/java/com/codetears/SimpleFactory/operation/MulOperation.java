package com.codetears.SimpleFactory.operation;

public class MulOperation extends Operation {

    private Double numA, numB;

    public MulOperation(Double numA, Double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public Double doOperation() {
        return super.result = numA * numB;
    }

}
