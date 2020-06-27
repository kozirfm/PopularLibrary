package ru.geekbrains.kozirfm.popularlibrary.moxy.view;


import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import ru.geekbrains.kozirfm.popularlibrary.R;
import ru.geekbrains.kozirfm.popularlibrary.moxy.presenter.MainPresenter;

public class MainActivity extends MvpAppCompatActivity implements MainView {

    private EditText editText;
    private TextView textView;

    @InjectPresenter
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        findViewById(R.id.button).setOnClickListener(v -> mainPresenter.onButtonClick(editText.getText().toString()));
    }

    @Override
    public void setText(String s) {
        textView.setText(s);
    }
}