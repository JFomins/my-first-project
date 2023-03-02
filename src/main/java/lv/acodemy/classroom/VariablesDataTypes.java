package lv.acodemy.classroom;

import java.util.Arrays;
import java.util.List;

public class VariablesDataTypes {
    public static void main(String[] args) {

       // byte data type
        byte myCurrentAge = 33;
        System.out.println(myCurrentAge);

        // short data type
        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

       // char short data type
        char firstNameLetter = 74; // 'J'
        System.out.println(firstNameLetter);

        // int data type
        int dateOfBirth = 270490;
        System.out.println(dateOfBirth);

        // long data type
        long populationOfLatvia = 1800000;
        System.out.println(populationOfLatvia);

        // float data type
        float lapTime = 32.30f;
        System.out.println(lapTime);

       // double data type
       double weight = 77.5;
        System.out.println(weight);

        //boolean is; has;
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;

        // String
        String name = "Jevgenijs";
        String Surname = "Fomins";

        //Concatenation
        String fullName = name + " " + Surname;
        System.out.println(fullName);

        String fullNameWithAge = fullName + myCurrentAge;
        //System.out.printIn("Jevgenijs Fomins33")
        // Jevgenijs Fomins33

        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);

        // *
        int a = 100;
        int b = 20;
        int c = a * b;
        System.out.println(c);

        // / division
        c = a / b;
        System.out.println(c);

        // %
        int number = 10 % 4;
        System.out.println(number);

        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));


        {
        }
    }
}
