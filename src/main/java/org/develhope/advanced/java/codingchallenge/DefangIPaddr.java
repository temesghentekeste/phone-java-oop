package org.develhope.advanced.java.codingchallenge;

public class DefangIPaddr {
    public static String defangIPaddr(String address) {

        return address.replace(".", "[.]");

    }

    public static void main(String[] args) {
        System.out.println( defangIPaddr("1.1.1.1"));
        System.out.println( defangIPaddr("255.100.50.0"));
    }
}
