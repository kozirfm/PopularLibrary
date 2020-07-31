package ru.geekbrains.kozirfm.popularlibrary.lesson6.dagger;

import android.util.Log;

import javax.inject.Inject;

import ru.geekbrains.kozirfm.popularlibrary.lesson6.dagger.app.App;

public class White {

    @Inject
    Green green;

    public White() {
        App.getAppComponent().inject(this);
        Log.d("DI_ACTIVITY_WHITE", String.format("%s %s", green.show(), green));
    }
}
