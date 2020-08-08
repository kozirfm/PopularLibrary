package ru.geekbrains.kozirfm.popularlibrary.Lesson8;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.geekbrains.kozirfm.popularlibrary.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start();
    }

    private void start(){
        new AsyncTask<Void, Void, Void>(){

            @Override
            protected Void doInBackground(Void... voids) {
                for (int i = 0; i < 30; i++) {
                    Log.d("TAG", "doInBackground: " + MainActivity.this);
                    SystemClock.sleep(1000);
                }

                return null;
            }
        }.execute();
    }

}
