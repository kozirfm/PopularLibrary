package ru.geekbrains.kozirfm.popularlibrary.Lesson2.observable;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.geekbrains.kozirfm.popularlibrary.R;

public class MainActivity extends AppCompatActivity {

    private Spam spam = new Spam();
    private IamObserver observer = new IamObserver();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.observable_activity);

        findViewById(R.id.subscribe).setOnClickListener((v -> spam.registerObserver(observer)));

        findViewById(R.id.unsubscribe).setOnClickListener((v -> spam.unregisterObserver(observer)));

        findViewById(R.id.spam).setOnClickListener(v -> spam.newMessage(Thread.currentThread().getName()));
    }
}
