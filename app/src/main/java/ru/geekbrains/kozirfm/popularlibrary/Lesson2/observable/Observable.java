package ru.geekbrains.kozirfm.popularlibrary.Lesson2.observable;

public interface Observable {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyAllObservers();

}
