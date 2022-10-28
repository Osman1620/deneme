package practice;

public class Q04_IfStatement03 {

    public static void main(String[] args) {

        System.out.println(5 > 4);
        System.out.println(5 > 4 || 4 > 5);
        System.out.println(5 > 4 && 4 > 5);
        System.out.println(5 < 4 || 3 + 4 == 7);
        System.out.println(5 < 4 && 3 + 4 == 7);


        boolean cash = false;
        boolean creditCard = true;

        if (cash || creditCard) {
            System.out.println("I can buy a PC");

        } else {

            System.out.println("I can not buy a PC");


        }

        // I want to learn Java
        //I have PC and I watch videos

        boolean havingPC = true;
        boolean watchingVideos = false;

        if (havingPC && watchingVideos) {
            System.out.println("I can learn Java");
        } else {
            System.out.println("I cannot learn Java");

        }
    }
}

