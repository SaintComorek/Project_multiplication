package com.multiply;

import java.math.BigInteger;

public class ALG1 {

    private String bigSolution;

    public void ChangeSign()
    {
        this.bigSolution = "-";
    }

    public String Multiply(String a , String b)
    {
        BigInteger num = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        this.bigSolution += num.multiply(num2).toString();
        this.bigSolution = this.bigSolution.replace("null" , "");

        return this.bigSolution;
    }
}
