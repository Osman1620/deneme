package practice;

import java.util.Scanner;

public class Q03_IfElse02 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age,please");

        int age= input.nextInt();

        if (age>=0 && age<=4){
            System.out.println("baby");
        }else if (age>=5 && age<=12) {
            System.out.println("child");
        } else if (age>=13 && age<=20) {
            System.out.println("teenager");
        } else if (age>=21 && age<=30) {
            System.out.println("adult");
        }else {
            System.out.println("not expected age");
        }

        }

    }



            



