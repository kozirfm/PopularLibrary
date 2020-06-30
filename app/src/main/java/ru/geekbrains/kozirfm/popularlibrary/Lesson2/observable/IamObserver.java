package ru.geekbrains.kozirfm.popularlibrary.Lesson2.observable;

import android.util.Log;

public class IamObserver implements Observer {
    @Override
    public void updateData(String message) {
        Log.d("NEW_MESSAGE", message);
    }
}
