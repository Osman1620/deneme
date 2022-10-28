package practice.day11_practice_session;

public class Q01_String_Manipulations {


    public static void main(String[] args) {

        /*Type code to reverse a string.
           Tom Hanks==> sknaH moT */

        String name="Tommy";

        String reversedName="";

        for(int i=name.length()-1; i>=0; i--){

            reversedName=reversedName+name.charAt(i);
        }
        System.out.println(reversedName);
    }
}
