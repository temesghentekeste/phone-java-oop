package org.develhope.advanced.java;

public abstract class SimplePhone implements Phone{
    public void call() {
        System.out.println(this.getClass().getSimpleName() + " is making a call");
    }

    public void text() {
        System.out.println(this.getClass().getSimpleName() + " is writing a text");
    }

    public void showCallHistory() {
        System.out.println(this.getClass().getSimpleName() + " is showing call history");
    }

    public void showTextHistory() {
        System.out.println(this.getClass().getSimpleName() + " is showing text history");
    }

}
