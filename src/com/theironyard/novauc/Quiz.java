package com.theironyard.novauc;

public class Quiz {

    /*
    (1) warmup1 missingChar
    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
    The value of n will be a valid index of a char in the original string
    (i.e. n will be in the range 0..str.length()-1 inclusive).
    */
    public String missingChar(String str, int n) {
        StringBuilder building = new StringBuilder(str);
        building.deleteCharAt(n);
        return building.toString();
    }

    /*
    (2) warmup1 nearhundred
    Given an int n, return true if it is within 10 of 100 or 200.
    Note: Math.abs(num) computes the absolute value of a number.
     */
    public boolean nearHundred(int n) {
        if ( n >= 90 && (n <= 110) ) {
            return true;
        }
        else if ( n >= 190 && (n <= 210) ) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    (3) warmup1 frontback
    Given a string, return a new string where the first and last chars have been exchanged.
     */
    public String frontBack(String str) {
        int n;
        StringBuilder building = new StringBuilder(str);
        n = building.length();

        if (n < 2) {
            return str;
        }
        else {
            return building.charAt(n-1) + building.substring(1,n-1)
                    + building.charAt(0);
        }
    }

    /*
    (4) warmup1 backaround
    Given a string, take the last char and return a new string with
    the last char added at the front and back, so "cat" yields "tcatt".
    The original string will be length 1 or more.
     */
    public String backAround(String str) {
        int n;
        StringBuilder building = new StringBuilder(str);
        n = building.length();
        return building.substring(n-1) + building.substring(0) + building.substring(n-1);
    }

    /*
    (5) warmup1 starthi
    Given a string, return true if the string starts with "hi" and false otherwise.
     */
    public boolean startHi(String str) {
        if(str.startsWith("hi")) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    (6) warmup1 hasteen
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen.
     */
    public boolean hasTeen(int a, int b, int c) {
        if ( ((a > 12) && (a < 20)) || ((b > 12)  && (b < 20)) || ((c > 12) && (c < 20))  ) {
            return true;
        }
        return false;
    }

    /*
    (7) warmup1 mixstart
    Return true if the given string begins with "mix", except the 'm'
    can be anything, so "pix", "9ix" .. all count.
     */
    public boolean mixStart(String str) {
        if (str.matches(".*ix.*")) {
            return true;
        }
        return false;
    }

    /*
    (8) warmup1 close10
    Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
     */
    public int close10(int a, int b) {
        if ((Math.abs(10-a)) == (Math.abs(10-b))) {
            return 0;
        }
        else if( (Math.abs(10-a)) < (Math.abs(10-b))) {
           return a;
        }
        else {
            return b;
        }
    }

    /*
    (9) warmup1 stringe
    Return true if the given string contains between 1 and 3 'e' chars.
     */
    public boolean stringE(String str) {
        int count = str.length() - str.replace("e", "").length();
        if ((count < 4) && (count >= 1)) {
            return true;
        }
        else {
            return false;
        }
    }

    /*
    (10) warmup1 everynth
    Given a non-empty string and an int N, return the string made starting with char 0,
    and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on.
    N is 1 or more.
     */
    public String everyNth(String str, int n) {
        String spelling = String.valueOf(str.charAt(0));
        for (int i=n;i<str.length();i+=n) {
            spelling += str.charAt(i);
        }
        return spelling;
    }
}
