package se.lexicon;


public class App 
{

    /*
        this method will print
        hello world text to the console
     */

    // this is the main method - not allow to change it
    public static void main(String[] args){
        System.out.println("Hello World!");

        byte redColorCode = 127;
        byte greenColorCode = -128;
        byte blueColorCode = 0;

        short temperature = -300;
        short groupId = 46;

        int salary = 600000;
        int tax = 450000;

        long bankBalance = 999999999999999L;

        float PIE = 3.14f;
        float GRAVITY = 9.8F;

        boolean studentStatus = true;

        char a = 'a';
        char testCharA = 'A';

        char hashtag = '\u0023';
        char omega = '\u03A9';


        System.out.println(redColorCode);
        System.out.println(studentStatus);
        System.out.println(omega);

    }


}
