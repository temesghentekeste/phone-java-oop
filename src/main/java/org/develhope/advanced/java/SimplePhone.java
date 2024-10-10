package org.develhope.advanced.java;

import java.util.List;
import java.util.Scanner;

public abstract class SimplePhone implements Phone{
    Scanner scanner = new Scanner(System.in);
    List<String> callLogContacts;
    List<String> textlLogContacts;
    List<String> textlLogMessages;

    public SimplePhone(List<String> callLogContacts, List<String> textlLogContacts, List<String> textlLogMessages) {
        this.callLogContacts = callLogContacts;
        this.textlLogContacts = textlLogContacts;
        this.textlLogMessages = textlLogMessages;
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
        textlLogMessages.add(contactName);
    }

    public void showCallHistory() {
        if( callLogContacts.isEmpty()) {
            System.out.println("Call log is empty.");
            return;
        }

        System.out.println(this.getClass().getSimpleName() + " is showing call history");
        for (int i = 0; i < callLogContacts.size(); i++) {
            System.out.println((i+1) + ". " + callLogContacts.get(i));
        }

    }

    public void showTextHistory() {
        if( textlLogContacts.isEmpty()) {
            System.out.println("No recent messages available.");
            return;
        }

        System.out.println(this.getClass().getSimpleName() + " is showing text message history");
        for (int i = 0; i < textlLogContacts.size(); i++) {
            System.out.println((i+1) + ". " + callLogContacts.get(i));
        }
    }

}
