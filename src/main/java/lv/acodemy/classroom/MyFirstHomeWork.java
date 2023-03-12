package lv.acodemy.classroom;

import java.util.Arrays;

public class MyFirstHomeWork {
    public static void main(String[] args) {
        byte myCurrentAge = 33;
        System.out.println(myCurrentAge);
        byte myDrivingExpirence = 7;
        System.out.println(myDrivingExpirence);


        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);
        short rentPerMonth = 500;
        System.out.println(rentPerMonth);


        char firstNameLetter = 'J';
        System.out.println(firstNameLetter);
        char secondNameLetter = 'F';
        System.out.println(secondNameLetter);


        int dateOfBirth = 270490;
        System.out.println(dateOfBirth);
        int dateOfStartWork = 11072010;
        System.out.println(dateOfStartWork);


        long populationOfAmerica = 331000000;
        System.out.println(populationOfAmerica);
        long populationOfEurope = 746000000;
        System.out.println(populationOfEurope);


        float worldRecordOfRunning100m = 9.58f;
        System.out.println(worldRecordOfRunning100m);
        float worldRecordOfSwimming100m = 46.91f;
        System.out.println(worldRecordOfSwimming100m);


        double weightOfMyCar = 1800;
        System.out.println(weightOfMyCar);
        double weightOfGoldenChain = 10.3;
        System.out.println(weightOfGoldenChain);


        boolean isMonday = false;
        boolean isFriday = true;
        boolean hasApples = true;
        System.out.printf("%s %s %s", isMonday, isFriday, hasApples);


        String name = "Jevgenijs";
        String surName = "Fomins";
        String fullName = name + " " + surName;
        System.out.println(fullName);


        String fullNameWithAge = fullName + myCurrentAge;
        System.out.printf("My full name is: %s. I am %d years old.", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.", fullName, myCurrentAge);


        int a = 100;
        int b = 20;
        int c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);


        double result = (double) a / b;
        System.out.println(c);


        int number = 10 % 5;
        System.out.println(number);
        int number2 = 10 % 9;
        System.out.println(number2);


        int [] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));









    }
}
