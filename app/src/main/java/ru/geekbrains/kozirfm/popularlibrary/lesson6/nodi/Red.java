package ru.geekbrains.kozirfm.popularlibrary.lesson6.nodi;

import android.util.Log;

public class Red {

    public Red() {
        Green green = new Green();
        Log.d("NO_DI_ACTIVITY_RED", String.format("%s %s", green.show(), green));
    }

}
