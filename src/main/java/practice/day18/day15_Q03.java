package practice.day18;

public class day15_Q03{

    public static void main(String[] args) {

        //Type code the check if a given integer is palindrome or not
        //Palindrome: 121<==>121 1233321<==>123321 nalan<==>nalan

        String str1="nalan";
        String reversed="";

        int idx=str1.length()-1;

        while (idx>-1){

            reversed=reversed+str1.charAt(idx);

            idx--;
        }
        if(str1.equals(reversed)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    System.out.println("===========================================================");

        String str12="Ey Edip Adana da pide ye";
        String reversed2= "";

        int idx2=str12.length()-1;
        while(idx2>-1){
            reversed2=reversed+ str12.charAt(idx2);
            idx2--;
        }
    if(str12.equals(reversed2)) {
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }


    }


}
