package ru.geekbrains.kozirfm.popularlibrary.standart.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import ru.geekbrains.kozirfm.popularlibrary.R;
import ru.geekbrains.kozirfm.popularlibrary.standart.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView {

    private EditText editText;
    private TextView textView;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        mainPresenter = new MainPresenter(this);

        findViewById(R.id.button).setOnClickListener(v -> mainPresenter.onButtonClick(editText.getText().toString()));
    }

    @Override
    public void setText(String s) {
        textView.setText(s);
    }
}