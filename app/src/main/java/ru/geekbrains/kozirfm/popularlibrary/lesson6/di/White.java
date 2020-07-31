package ru.geekbrains.kozirfm.popularlibrary.lesson6.di;

import android.util.Log;

public class White {

    public White(Green green) {
        Log.d("DI_ACTIVITY_WHITE", String.format("%s %s", green.show(), green));
    }

}
