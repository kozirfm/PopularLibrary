package ru.geekbrains.kozirfm.popularlibrary.lesson6.dagger;

import android.util.Log;

import javax.inject.Inject;

import ru.geekbrains.kozirfm.popularlibrary.lesson6.dagger.app.App;

public class Red {

    @Inject
    Green green;

    public Red() {
        App.getAppComponent().inject(this);
        Log.d("DI_ACTIVITY_RED", String.format("%s %s", green.show(), green));
    }
}
