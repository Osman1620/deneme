package practice;

public class Q03StringManipulations {
    /*
       String shirtPrice="$ 12.99";
       String bookPrice="$ 35.99";

       Type code to find the sum of the shirt and book prices.
     */
    public static void main(String[] args) {

        String shirtPrice="$ 12.99";
        String bookPrice="$ 35.99";

        String shirt=shirtPrice.replace("$" , "");  //"12.99"
        String book=bookPrice.replace("$" ,"");    //"35.99"

        //How can convert String to "Double" ==> I should use double wrapper class and put dot
        //We can convert Strings to double numeric values because it is not possible operate math operations with strings

        double sd=Double.valueOf(shirt); //12.99
        double bd=Double.valueOf(book);

        System.out.println(sd+bd);//48.98000000
    }




}
