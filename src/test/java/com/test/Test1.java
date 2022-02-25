package com.test;

import com.multiply.ALG1;
import com.multiply.ALG2;
import com.multiply.ALG3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import  org.junit.jupiter.api.Assertions.*;
import java.util.Random;
import java.math.BigInteger;

public class Test1 {

    private String a = "";
    private String b = "";

    @BeforeEach
    void Randomize()
    {
        Random rand = new Random();
        int num ;
        num = rand.nextInt(30) + 1;

        for (int i =  0 ; i < num ; i++)
        {
            this.a += Integer.toString(rand.nextInt(30) + 1);
            this.b += Integer.toString(rand.nextInt(30) + 1);
        }
    }

    @Test
    void tst()
    {
        BigInteger big_num = new BigInteger(this.a);
        BigInteger big_num2 = new BigInteger(this.b);
        String num3 = "" ; num3 += big_num.multiply(big_num2).toString();

        ALG1 alg1 = new ALG1();
        ALG2 alg2 = new ALG2();
        alg2.Get(this.a, this.b);
        ALG3 alg3 = new ALG3();

        Assertions.assertEquals( num3 ,  alg1.Multiply(this.a , this.b));
        Assertions.assertEquals( num3 ,  alg2.Multiply());
        Assertions.assertEquals( num3 ,  alg3.Multiply(this.a , this.b));
    }

    @Test
    void tst2()
    {
        BigInteger big_num = new BigInteger(this.a);
        BigInteger big_num2 = new BigInteger(this.b);
        String num3 = "" ; num3 += big_num.multiply(big_num2).toString();

        ALG1 alg1 = new ALG1();
        Assertions.assertEquals( num3 ,  alg1.Multiply(this.a , this.b));
    }

    @Test
    void tst3()
    {
        BigInteger big_num = new BigInteger(this.a);
        BigInteger big_num2 = new BigInteger(this.b);
        String num3 = "" ; num3 += big_num.multiply(big_num2).toString();

        ALG2 alg2 = new ALG2();
        alg2.Get(this.a , this.b);
        Assertions.assertEquals( num3 ,  alg2.Multiply());
    }

    @Test
    void tst4()
    {
        BigInteger big_num = new BigInteger(this.a);
        BigInteger big_num2 = new BigInteger(this.b);
        String num3 = "" ; num3 += big_num.multiply(big_num2).toString();

        ALG3 alg3 = new ALG3();
        Assertions.assertEquals( num3 ,  alg3.Multiply(this.a , this.b));
    }
}
