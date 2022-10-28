package practice.day07practise02;

public class Q04 {

    // Type code to find the number of punctuation marks used in a String.

    public static void main(String[] args) {

        String str="Wow!...Ali is 13 years old,and he is a university student.";

        int totalNumOfChar=str.length();
        System.out.println(totalNumOfChar);

        String strWithoutPunct= str.replaceAll("\\p{Punct}","");

        //regular expression for All punctuations can be typed "\\p" ==>By replaceAll() punctuation will be replaced with nothing.
        //So,we can find the number of characters in the statement.

        System.out.println(strWithoutPunct.length());

        //easier way

        System.out.println(str.replaceAll("\\P{Punct}","").length());


    }

}
