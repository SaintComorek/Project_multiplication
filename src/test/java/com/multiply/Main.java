package com.multiply;

import com.test.Test1;

public class Main{

    public static void main(String[] args) {

        boolean minus = false;

        if(args.length != 4)
        {
            System.out.println("Wrong number of arguments");
            System.out.println("E.g  ./multiply.sh --alg1 12345678901234567890 11111111111111111111");
            System.exit(0);
        }


        if((args[2].charAt(0) == '-' && (args[3].charAt(0) != '-')))
        {
            args[2] = args[2].substring(1);
            minus = true;
        }

        if((args[2].charAt(0) != '-' && (args[3].charAt(0) == '-')))
        {
            args[3] = args[3].substring(1);
            minus = true;
        }
        if((args[2].charAt(0) == '-' && (args[3].charAt(0) == '-')))
        {
            args[2] = args[2].substring(1);
            args[3] = args[3].substring(1);

        }

        if(args[1].equals("--alg1"))
        {
            ALG1 first_algorithm = new ALG1();
            if(minus == true)
            {
                first_algorithm.ChangeSign();
            }
            System.out.println("First Algorithm Solution " + first_algorithm.Multiply(args[2] , args[3]));
        }
        if (args[1].equals("--alg2"))
        {
            ALG2 second_algorithm = new ALG2();
            if(minus == true)
            {
                second_algorithm.ChangeSign();
            }
            second_algorithm.Get(args[2] , args[3]);
            System.out.println("Second Algorithm Solution " + second_algorithm.Multiply());
        }
        if (args[1].equals("--alg3"))
        {
            ALG3 third_algorithm = new ALG3();
            if(minus == true)
            {
                third_algorithm.ChangeSign();
            }
            System.out.println("Third Algorithm Solution " + third_algorithm.Multiply(args[2] , args[3]));
        }
    }
}
