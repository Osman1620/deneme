package practice.day18;

public class Q01_StringManipulations {
    /*
    Type code to reverse a string.
    Tom Hanks==> sknaH moT
     */

    public static void main(String[] args) {

        String str="Tom Hanks";
        String reversed= "";

        for(int i=str.length()-1;  i>=0; i--){

           reversed=reversed+ str.charAt(i);
        }
              System.out.println(reversed);


        //Get the initial from full name.(Middle name is out of scape)
        //Tom Hanks ==>TH

        String fullName="      Tom Hanks     ";

        //trim() removes the spaces just from the beginning and from the end.It does not touch spaces in the middle.
        //substring(startİngIndex,endIndex) method is used to get a specific part of a string.
        //starting ındex is ınclusive, ending ındex is exclusive.

        String initialFirstName=fullName.trim().substring(0, 1).toUpperCase();
        System.out.println("Initial of first name is: " + initialFirstName);

        String initialLastName=fullName.trim().split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println("Initial of last name:" + initialLastName);

    }
}
