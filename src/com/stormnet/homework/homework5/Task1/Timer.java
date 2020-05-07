package com.stormnet.homework.homework5.Task1;

public class Timer {

    CaseInspector inspector;

    Timer(CaseInspector operation) {

        this.inspector = operation;
    }

    public void printTime() {
        while (true) {
            try {
                Thread.sleep(10 * 1000);
                System.out.println("10 second has passed!");
                inspector.execute();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
