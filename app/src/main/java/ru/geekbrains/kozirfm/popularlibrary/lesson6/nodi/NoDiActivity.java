package ru.geekbrains.kozirfm.popularlibrary.lesson6.nodi;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.geekbrains.kozirfm.popularlibrary.R;

public class NoDiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);

        Green green = new Green();
        White white = new White();
        Red red = new Red();

        Log.d("NO_DI_ACTIVITY_GREEN", green.toString());
        Log.d("NO_DI_ACTIVITY_WHITE", white.toString());
        Log.d("NO_DI_ACTIVITY_RED", red.toString());
    }

}
