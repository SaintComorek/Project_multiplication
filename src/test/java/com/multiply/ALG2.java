package com.multiply;

public class ALG2 {

    private String  a ;
    private String  b ;
    private String result = "";

    public void ChangeSign()
    {
        this.result = "-";

    }

    public void Get(String num1 , String num2)
    {
        if(num1.equals("0") || num2.equals("0") ) {
            System.out.println("0");
            System.exit(0);
        }
        else
            this.a = num1 ; this.b = num2;
    }

    public String Multiply()
    {

        int[] res = new int[this.a.length() + this.b.length()];
        int i_num  = 0 , i_num2 = 0 , rest = 0 , sum = 0 , index  = 0 , index2 = 0;

        for (int i = this.a.length() - 1  ; i >= 0 ; --i )
        {
            i_num = Integer.parseInt(String.valueOf(this.a.charAt(i)));

            for (int j = this.b.length() - 1  ; j >= 0  ; --j)
            {
                i_num2 = Integer.parseInt(String.valueOf(this.b.charAt(j)));
                sum = i_num * i_num2 + res[index + index2] + rest ;
                rest  = sum /10;
                res[index + index2] = (sum % 10);

                index2++;
            }
            res[index + index2] += rest;

            index++;
            index2 = 0;
            rest = 0;
        }
        System.out.println(" "  );

        for (int i = res.length - 1 ; i >= 0   ; i--)
        {
            if(i == res.length - 1 && res[i] == 0)
                i--;

            this.result += (res[i]);
        }

        if (this.result.charAt(0) == '0')
        {
            this.result = result.substring(1);
        }

        return this.result;
    }
}
