package ru.geekbrains.kozirfm.popularlibrary.lesson6.dagger;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import ru.geekbrains.kozirfm.popularlibrary.R;
import ru.geekbrains.kozirfm.popularlibrary.lesson6.dagger.app.App;

public class DaggerActivity extends AppCompatActivity {

    @Inject
    Green green;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);

        App.getAppComponent().inject(this);

        White white = new White();
        Red red = new Red();

        Log.d("DI_ACTIVITY_GREEN", green.toString());
        Log.d("DI_ACTIVITY_WHITE", white.toString());
        Log.d("DI_ACTIVITY_RED", red.toString());

    }

}
