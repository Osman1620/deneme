package day01variables;

import java.sql.SQLOutput;

public class Variables01 {

    public static void main(String[] args) {

        //Data Type     Variable Name      =     Value    ;
           int             age             =       27     ;


           //Example 1 : Create a variable whose value is 1.99
           double priceofshirt = 1.99;


                      //Data types
        /*
            1)integer:it is used for whole numbers.
            The minimum value of integers is -2,147,483,648
            The maximum value of integers is 2,147,483,648
            İnteger variables use 32 bits in memory


            1)short:it is used for whole numbers.
            The minimum value of integers is -32,768
            The maximum value of integers is 32,768
            short variables use 16 bits in memory


            1)byte:it is used for whole numbers.
            The minimum value of integers is -128
            The maximum value of integers is 127
            byte variables use 8 bits in memory


            1)long:it is used for whole numbers.
            The minimum value of integers is -9,223,372,036,854,755,808
            The maximum value of integers is 9,223,372,036,854,755,808
            long variables use 64 bits in memory
         */

            int populationofgermany = 80000000;
            System.out.println(populationofgermany);

            long populationoftheworld = 7000000000L;
            long populationofchina = 14000000;

            byte ageofstudent = 23;
            System.out.println(ageofstudent);

            short populationofvillage = 23000;
        System.out.println(populationofvillage);

        int shirt= 21;
        double shoes= 12.99, socks= 3.99;
        System.out.println(shirt+shoes+socks);


        float f1=12.99F, f2=5.76F;
        short s1=12, s2=23, s3=34;
        double d1=23.45, d2=123.09;
        System.out.println(f1+f2+s1+s2+s3+d1+d2);


        char c1='A';
        int i1=10;
        System.out.println(c1+i1);



        String s = "Tom";
        int  i=12, k=23;
        System.out.println(s+i+k);


        System.out.println(s+(i+k));






            }
    }





