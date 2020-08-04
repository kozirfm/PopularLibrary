package ru.geekbrains.kozirfm.popularlibrary.unit;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.geekbrains.kozirfm.popularlibrary.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);

        findViewById(R.id.button).setOnClickListener(v -> textView.setText("Hello"));

    }

}
