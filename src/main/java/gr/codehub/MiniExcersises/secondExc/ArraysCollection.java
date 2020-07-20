package gr.codehub.MiniExcersises.secondExc;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysCollection implements Comparable{

    //Method that find Prime Number
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

    //1. Return a list with primeNumbers
    public static List<Integer> subList(List<Integer> noPrimeList) {
        ArrayList<Integer> primeList = new ArrayList<>();
        //int size = npl.size();
        for (int i : noPrimeList) {
            if (isPrime(i)) {
                primeList.add(i);
            }

        }
        return primeList;
    }

    //2. Removing Duplicates
    public static List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> clearList = list.stream().distinct().collect(Collectors.toList());
        return clearList;
    }

    //3. Sorting list
    public static void sortingList(List<Integer> slist) {
        Collections.sort(slist);
    }



    //6. Create an add functionality for large enough numbers that cannot be represented by int, long etc (hint, use arrays or lists)
    public void longsNumber(BigInteger b1, BigInteger b2) {
        b1 = new BigInteger("20000000000");
        b2 = new BigInteger("10000000000");
        BigInteger total = b1.add(b2);

        System.out.println("The number is: " +String.valueOf(total));
    }

    //7. is Word Symmetric

    public static boolean isSymmetric(String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {


        //Testing for primenumbers
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            n.add(i);
        }
        System.out.println("The original list is: " + n);
        System.out.println("The Prime List is: " + subList(n));

        //Testing for duplicates
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5));
        System.out.println("The arraylist with duplicates is: " + list);
        System.out.println("The arraylist with no duplicates is: " + removeDuplicates(list));

        //Testing symmetric
        String s = "memem";
        System.out.println("The word" +s+ "is symmetric ? -> " +isSymmetric(s));

    }

    //Method Collection.sort
    @Override
    public int compareTo(Object o) {
        return 0;
    }

}
