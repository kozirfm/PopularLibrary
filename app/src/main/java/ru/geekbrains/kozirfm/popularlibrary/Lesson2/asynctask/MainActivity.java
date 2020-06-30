package ru.geekbrains.kozirfm.popularlibrary.Lesson2.asynctask;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

import ru.geekbrains.kozirfm.popularlibrary.R;

public class MainActivity extends AppCompatActivity {

    private MyAsyncTask asyncTask;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.async_task_activity);

        findViewById(R.id.asyncButton).setOnClickListener(v -> {
            asyncTask = new MyAsyncTask();
            asyncTask.execute();
            Log.d("ASYNC_TASK", "On button click" );
        });
    }

    private static class MyAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                for (int i = 0; i < 5; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    Log.d("ASYNC_TASK", Thread.currentThread().getName() + " " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }
    }
}
