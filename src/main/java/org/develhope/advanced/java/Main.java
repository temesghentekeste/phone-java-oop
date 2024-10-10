package org.develhope.advanced.java;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone temesghenPhone = new TemesghenPhone("Samsung", "Galaxy S24 Ultra", 2024, 400);
        temesghenPhone.printInfo();
        temesghenPhone.call();
        temesghenPhone.call();
        temesghenPhone.showCallHistory();
        temesghenPhone.text();
        temesghenPhone.text();
        temesghenPhone.showTextHistory();
    }
}