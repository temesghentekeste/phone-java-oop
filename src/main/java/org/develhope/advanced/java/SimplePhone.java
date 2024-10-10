package org.develhope.advanced.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class SimplePhone implements Phone{
    Scanner scanner = new Scanner(System.in);
    List<String> callLogContacts = new ArrayList<>();
    List<String> textlLogContacts = new ArrayList<>();
    List<String> textlLogMessages = new ArrayList<>();

    private String brand;
    private String model;
    private int year;
    private double price;

    public SimplePhone(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void call() {
        System.out.print("Who do you want to call? ");
        String contactName = scanner.nextLine().trim();
        callLogContacts.add(contactName);
    }

    public void text() {
        System.out.print("Who do you want to text? ");
        String contactName = scanner.nextLine().trim();
        System.out.print("Enter your message: ");
        String message = scanner.nextLine().trim();
        textlLogContacts.add(contactName);
        textlLogMessages.add(message);
    }

    public void showCallHistory() {
        if( callLogContacts.isEmpty()) {
            System.out.println("Call log is empty.");
            return;
        }

        System.out.println(this + " is showing call history");
        for (int i = 0; i < callLogContacts.size(); i++) {
            System.out.println((i+1) + ". " + callLogContacts.get(i));
        }

    }

    public void showTextHistory() {
        if( textlLogContacts.isEmpty()) {
            System.out.println("No recent messages available.");
            return;
        }

        System.out.println(this + " is showing text message history");
        for (int i = 0; i < textlLogContacts.size(); i++) {
            System.out.println((i+1) + ". To: " + textlLogContacts.get(i) + ", Message: " + textlLogMessages.get(i));
        }
    }

    public void printInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Year: " + year + ", Price: $" + price );
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }
}
