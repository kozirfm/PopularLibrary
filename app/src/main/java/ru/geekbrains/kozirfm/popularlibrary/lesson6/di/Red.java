package ru.geekbrains.kozirfm.popularlibrary.lesson6.di;

import android.util.Log;

public class Red {

    public Red(Green green) {
        Log.d("DI_ACTIVITY_RED", String.format("%s %s", green.show(), green));
    }

}
