package practice;

import java.util.Scanner;

public class Q02IfElseStatement {
    /*Ask user to enter his weight and height.Calculate body mass index of the user.
    To calculate body mass index use "bodyMassIdx=weight/squareOfHeight" formula.
    ** 1)body mass idx less than 18.5 ==> "You are weak"
    ** 2)bodyMassIdx between 18.5-25 ==> "Your weight is ıdeal"
    ** 3)bodyMassIdx between 25-30 ==> "You are fat"
    ** 4)bodyMassIdx greater than 30 ==> "Obese"
     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your height");

        double height=input.nextDouble();
        double squareOfHeight=height*height;

        System.out.println("Enter your weight");

        double weight=input.nextDouble();
        double bodyMassIndex=weight/squareOfHeight; //Your IBM is: 30.5908599242834

        System.out.println("Your IBM is: " +bodyMassIndex);

        if (bodyMassIndex>=0 && bodyMassIndex<18.5) {
            System.out.println("You are weak");
        } else if (bodyMassIndex>=18.5 && bodyMassIndex<25) {
            System.out.println("Your weight is ıdeal");
        } else if (bodyMassIndex>=25 && bodyMassIndex<30) {
            System.out.println("You are fat");
        } else if (bodyMassIndex>30) {
            System.out.println("Obese");

        }
    }


    }






