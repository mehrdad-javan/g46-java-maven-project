package se.lexicon;


public class App
{

    /*
        this method will print
        hello world text to the console
     */

    // this is the main method - not allow to change it
    public static void main(String[] args){

        /*

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


        int number1 = 10;
        int number2 = 5;

        number1 = number2; // number1 = 5

        System.out.println(number2); // 5
        System.out.println(number1); // 5

        int result = 42 + 10;
        System.out.println(result); // 52

        int result2 = number1 - number2; // 0

        // sout + tab
        System.out.println("Result2 : " + result2);

        System.out.println(10 * 2); //20
        System.out.println(10 / 2); //5

        int num1 = 5;
        //System.out.println(num1++); // num1 = 5 + 1;
        System.out.println(num1); // num1 = 5 + 1;

        int n1 = 10;
        int n2 = 5;

        int result3 = n1 / n2; // 2
        System.out.println(result3);
        int result4 = n1 % n2; // 0
        System.out.println(result4);



        boolean result5 = n1 >= n2; // true


        int age = 10;


        */


        /*if(age >= 18){
            System.out.println("You can have a beer!");
        } else {
            System.out.println("You cannot have a beer!");
        }*/


        /*
        if (age >= 18){
            System.out.println("You can have a beet!");
        } else if(age < 18 && age >=15){
            System.out.println("You can drive a moped but not drink beer!");
        } else {
            System.out.println("You are to young to drive a moped and drink beer!");
        }



        int dayOfWeek = 5;
        switch (dayOfWeek){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }


        String name = "Erik";
        System.out.println(name); // Erik
        //name = name.concat(" Svensson"); // Erik Svensson
        name = name + " Svensson";

        System.out.println(name);


        String firsName = "Erik";
        String lastName = "Svensson";
        String name2 = firsName + lastName;
        String name3 = firsName.concat(lastName);

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

         */



        Person erik = new Person();
        erik.firstName = "Erik";
        erik.lastName = "Svensson";
        erik.age = 42;
        erik.hobby = "programming";

        Person mehrdad = new Person();
        mehrdad.firstName = "Mehrdad";
        mehrdad.lastName = "Javan";
        mehrdad.age = 34;
        mehrdad.hobby = "programming";



    }


}
