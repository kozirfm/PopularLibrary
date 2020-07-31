package ru.geekbrains.kozirfm.popularlibrary.lesson6.nodi;

import android.util.Log;

public class White {

    public White() {
        Green green = new Green();
        Log.d("NO_DI_ACTIVITY_WHITE", String.format("%s %s", green.show(), green));
    }

}
