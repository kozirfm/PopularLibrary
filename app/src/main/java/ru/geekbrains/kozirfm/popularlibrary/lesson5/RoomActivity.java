package ru.geekbrains.kozirfm.popularlibrary.lesson5;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.geekbrains.kozirfm.popularlibrary.R;

public class RoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        RoomPresenter roomPresenter = new RoomPresenter();

        findViewById(R.id.insertButton).setOnClickListener(v -> roomPresenter.putData());

        findViewById(R.id.insertAllButton).setOnClickListener(v -> roomPresenter.putAllData());

        findViewById(R.id.getDataButton).setOnClickListener(v -> roomPresenter.getData());

        findViewById(R.id.deleteButton).setOnClickListener(v -> roomPresenter.deleteLastData());

        findViewById(R.id.updateButton).setOnClickListener(v -> roomPresenter.updateData());

    }
}
