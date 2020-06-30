package ru.geekbrains.kozirfm.popularlibrary.Lesson2.observable;

import java.util.ArrayList;

public class Spam implements Observable {

    private ArrayList<Observer> list;
    private String message;

    public Spam() {
        list = new ArrayList<>();
    }

    public void newMessage(String message) {
        this.message = message;

        notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!list.contains(observer)) {
            list.add(observer);
        }

    }

    @Override
    public void unregisterObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.updateData(message);
        }

    }
}
