package com.bridgelabz.generics;

public class Generics<T extends Comparable<T>>
{
    T x,y,z;

    public Generics(T x, T y, T z)
    {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum()
    {
        return Generics.testMax(x, y, z);
    }
    public static void main(String[] args)
    {

        Integer number1 = 8;
        Integer number2 = 30;
        Integer number3 = 40;

        Float num1 = 8.5f;
        Float num2 = 8.1f;
        Float num3 = 6.19f;

        String name1 = "Graphs" ;
        String name2 = "Apple";
        String name3 = "Banana";

        Generics<Integer> printMaxInteger = new Generics<Integer>(number1,number2,number3);
        printMaxInteger.maximum();
        Generics<Float> printMaxFloat = new Generics<Float>(num1,num2,num3);
        printMaxFloat.maximum();
        Generics<String> printMaxString = new Generics<String>(name1,name2,name3);
        printMaxString.maximum();

    }

    public static <T extends Comparable<T>> T testMax(T x,T y ,T z)
    {

        T maximum= x;
        if(y.compareTo(maximum) > 0 )
        {
            maximum = y;
        }
        if(z.compareTo(maximum) > 0 )
        {
            maximum = z;
        }
        printMax(x,y,z,maximum);
        return maximum;
    }
    public static <T> void printMax(T x,T y,T z,T maximum)
    {
        System.out.printf("Max of %s,%s and %s is %s \n ",x,y,z,maximum);
    }
}