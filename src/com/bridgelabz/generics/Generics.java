package com.bridgelabz.generics;

public class Generics {
    public static void main(String[] args) {

    Integer number1 = 8;
    Integer number2 = 30;
    Integer number3 = 40;
    Integer maximumNum = testMax(number1, number2, number3);
    System.out.println("Maximum number is : "+maximumNum);
}

    public static Integer testMax(Integer number1, Integer number2, Integer number3) {

        Integer maximumNumber = number1;
        if(number2.compareTo(maximumNumber) > 0 )
        {
            maximumNumber = number2;
        }
        if(number3.compareTo(maximumNumber) > 0 )
        {
            maximumNumber = number3;
        }
        return maximumNumber;
    }
}
