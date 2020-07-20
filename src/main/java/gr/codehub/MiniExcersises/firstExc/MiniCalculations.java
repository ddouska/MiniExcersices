package gr.codehub.MiniExcersises.firstExc;

import java.math.BigDecimal;

public class MiniCalculations {
    //1. Factorial Calculation
    public static long calcFactorial(int n) {
        long returnValue = 1;
        for (int i = 1; i <= n; i++) {
            returnValue *= i;
        }
        return returnValue;
    }

    //1. Factorial Calculation using recursion (no good performance)
//    public static long calcFactorial(int n) {
//        if(n >= 1)  {
//            return n * calcFactorial(n-1);
//        }
//          else return 1;
//    }

    //2. Maximum value of n as int
    public static int calcMaximum(int n) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(max + 1);
        return 0;
    }

    //3. Prime Number
    public static boolean isPrime(int n) {

        int halfN = (int) (Math.sqrt(n) + 1);
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int j = 3; j <= halfN; j += 2) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    //4. Harmonic Sum
    public static double harmonicSum(int n) {
        double returnValue = 0;
        for (int i = 1; i <= n; i++) {
            returnValue += 1 / (double) i;
        }
        return returnValue;
    }

    //5. Counts the digits of a long number
    public static int calcDigits(long n) {
        int counter = 0;
        while (n != 0) {
            n = n / 10;
            ++counter;
        }
        return counter;
    }

    //6. Decimal part of float number
    public static float calDecimalPart(float n) {
        BigDecimal floatNumber = new BigDecimal(String.valueOf(n));
        BigDecimal integerNumber = new BigDecimal(floatNumber.intValue());
        return floatNumber.subtract(integerNumber).floatValue();
    }


    public static void main(String[] args) {

        //1. Factorial Calculation
        System.out.println("**** Exercise 1 -> Factorial ****");
        int x = 12;
        System.out.println("The factorial of" +x+  "is : " + calcFactorial(x) + "\n");

        //2. Maximum value of n as int
        System.out.println("**** Exercise 2 -> Max Value ****");
        int a = 8;
        System.out.println("Maximum value of 356 is : " + calcMaximum(a) + "\n");


        //3. Prime Number
        System.out.println("**** Exercise 3 -> Prime Number ****");
        int c = 2;
        System.out.println("Is" + c + "prime number? --> " + isPrime(c)+ "\n");

        //4. Harmonic Sum
        System.out.println("**** Exercise 4 -> Harmonic Sum ****");
        int b = 5;
        System.out.println("The harmonic sum of "+ b + "is: " + harmonicSum(b)+ "\n");


        //5. Counts the digits of a long number
        System.out.println("**** Exercise 5 -> Digit Counter ****");
        long k = 345289467;
        System.out.println("Number of digits at" + k + " are: " + calcDigits(k) + "\n");

        //6. Decimal part of float number
        System.out.println("**** Exercise 6 -> Decimal Part ****");
        float d = (float) 4.24;
        System.out.println("The decimal part of" + d + " is :" + calDecimalPart(Float.parseFloat(String.valueOf(d)))+ "\n");

    }
}
