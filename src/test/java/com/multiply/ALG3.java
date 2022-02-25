package com.multiply;

public class ALG3 {

    private String solution = "";

    public void ChangeSign()
    {
        this.solution = "-";
    }

    public String Multiply(String a , String b)
    {
        if(a.equals("0") || b.equals("0") ) {
            System.out.println("0");
            System.exit(0);
        }

        int num = 0 , num2 = 0;
        int[] arr = new int[ a.length() + b.length()];

        for (int i = 0 ; i < a.length() ; ++i)
        {
            for (int j = 0 ; j < b.length() ; ++j)
            {
                num = Integer.parseInt(String.valueOf(a.charAt(a.length() - i - 1)));
                num2 = Integer.parseInt(String.valueOf(b.charAt(b.length() - j - 1 )));
                arr[i+j] += num * num2;
                arr[i + j + 1 ] += arr[i+j] /10 ;  arr[i + j] %= 10;
            }
        }

        int s = arr.length - 1;
        while(s>=0 && arr[s] == 0)
            s--;
        while (s >= 0)
            this.solution += (arr[s--]);

        return this.solution;
    }
}
