package ru.geekbrains.kozirfm.popularlibrary.lesson6.di;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.geekbrains.kozirfm.popularlibrary.R;

public class DiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);

        Green green = new Green();
        White white = new White(green);
        Red red = new Red(green);

        Log.d("DI_ACTIVITY_GREEN", green.toString());
        Log.d("DI_ACTIVITY_WHITE", white.toString());
        Log.d("DI_ACTIVITY_RED", red.toString());
    }

}
