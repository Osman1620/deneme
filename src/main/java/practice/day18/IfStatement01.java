package practice.day18;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //  //Type a code, get age from user and decide which stage on it
        //        //0 - 4 => baby
        //        //5 - 12 => child
        //        //13 - 20 => teenager
        //        //21 - 30 => adult
        //        //else (not expected age)

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age <= 4) {
            System.out.println("Baby");
        } else if (age <= 12) {
            System.out.println("Child");
        } else if (age <= 20) {
            System.out.println("Teenager");
        } else if (age <= 30) {
            System.out.println("Adult");
        } else {
            System.out.println("Not expected age");
        }

        double d = -2.3;

        if (d < 0) {
            System.out.println("Negative");
            if (d >= 0) {
                System.out.println("Non-Negative");
            }
        }
    }
}
/*
              || means "or": If you use "||" between 2 things it means at least 1 of them is enough for you
                     For example; "tea || coffee" means just tea, or just coffee, or both
                     To get false from || operation all must be false
                     true || true ==> true
                     true || false ==> true
                     false || true ==> true
                     false || false ==> false
                  Note: "|" checks both conditions.
                          "||" does not check the second condition, if first one is true
                          "||" is faster than "|"

               && means "and":  If you use "&&" between 2 things it means you want both.
                      For example; "tea && coffee" means I want both, just one of them will not be enough
                      To get true from && operation all must be true.
                      true && true ==> true
                      true && false ==> false
                      false && true ==> false
                      false && false ==> false
            & means "and":  If you use "&" between 2 things it means you want both.
                      For example; "tea & coffee" means I want both, just one of them will not be enough
                      To get true from && operation all must be true.
                      true & true ==> true
                      true & false ==> false
                      false & true ==> false
                      false & false ==> false
            Note: "&" and "&&" do the same but
           "&&" does not check the second condition if the first condition is false.
           "&" checks both conditions every time.
         */

