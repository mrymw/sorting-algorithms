package com.mrymw.lab;

public class Homework {
    public static int factorial(int n) {
        //base case
        if(n==1) {
            return 1;
        }
        // recursive case
        else {
            return n * factorial(n-1);
        }
    }
    public static int bunnyEars(int bunnies){
        if (bunnies ==0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnies-1);
        }
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n -2);
        }
    }
    public static int bunnyEars2(int bunnies){
        if (bunnies ==0) {
            return 0;
        } else if (bunnies%2 ==0){
            return 3 + bunnyEars2(bunnies-1);
        } else {
            return 2  + bunnyEars2(bunnies-1);
        }
    }
    public static int triangle(int triangle) {
        if (triangle ==0) {
            return 0;
        } else if (triangle == 1){
            return 1;
        } else {
            //2 -> 3
            return triangle + triangle(triangle-1);
        }
    }
    public static int sumOfDigits(int n) {
        if (n<0) {
            return -1;
        } else if( n==0) {
            return 0;
        } else {
            return n%10 + sumOfDigits(n/10);

        }
    }
    public static int count7(int n){
        if (n<0) {
            return -1;
        } else if( n==0) {
            return 0;
        } else {
            int lastDigit = n % 10;
            int count = (lastDigit == 7) ? 1 : 0;
            return count + count7(n / 10);

        }
    }
    public static int count8(int n){
        if (n<0) {
            return -1;
        } else if( n==0) {
            return 0;
        } else {
            int lastDigit = n % 10;
            int count = (lastDigit == 8) ? 1 : 0;
            int nextDigit = (n / 10) % 10;

            if (lastDigit == 8 && nextDigit == 8) {
                count++;
            }

            return count + count8(n / 10);
        }
    }
    public static int countHi(String n){
        if (n.length() <2) {
            return 0;
        } else if (n.substring(0,2).equals("hi")) {
            return 1+ countHi(n.substring(2));
        } else {
            return countHi(n.substring(1));
        }
    }
    public static String changeXToY(String x) {
        if (x.isEmpty()) {
            return x;
        } else {
            char firstChar = x.charAt(0);
            String restOfString = changeXToY(x.substring(1));
            if(firstChar == 'x') {
                return 'y' + restOfString;
            } else {
                return firstChar + restOfString;
            }
        }
    }
    public static String removeX(String n) {
        if (n.isEmpty()) {
            return "";
        } else {
            char firstChar = n.charAt(0);
            String restOfString = removeX(n.substring(1));
            if (firstChar == 'x') {
                return restOfString;
            } else {
                return firstChar + restOfString;
            }
        }
    }
    public static String pairStar(String x) {
        if (x.length() < 2) {
            return x;
        } else if (x.charAt(0) == x.charAt(1)) {
            return x.charAt(0) + "*" + pairStar(x.substring(1));
        } else  {
            return x.charAt(0) + pairStar(x.substring(1));
        }
    }
    public static String stringClean(String s) {
        if(s.length() <2) {
            return s;
        } else if (s.charAt(0) == s.charAt(1)) {
            return stringClean(s.substring(1));
        }
        else {
            return s.charAt(0) + stringClean(s.substring(1));
        }
    }
    public static int countHii(String n){
        if (n.length() <2) {
            return 0;
        } else if (n.length() >= 3 && n.charAt(0) == 'x' && n.substring(1,3).equals("hi")) {
            return countHii(n.substring(3));
        } else if (n.substring(0,2).equals("hi")){
            return 1 + countHii(n.substring(2));
        } else {
            return countHii(n.substring(1));
        }
    }
    public static int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.startsWith(sub) && str.endsWith(sub)) {
            return str.length(); // Valid substring
        } else if (str.startsWith(sub)) {
            return strDist(str.substring(0, str.length() - 1), sub);
        } else if (str.endsWith(sub)) {
            return strDist(str.substring(1), sub);
        } else {
            return strDist(str.substring(1, str.length() - 1), sub);
        }
    }


}
