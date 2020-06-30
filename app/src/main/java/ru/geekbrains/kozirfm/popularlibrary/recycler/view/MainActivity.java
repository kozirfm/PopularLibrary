package ru.geekbrains.kozirfm.popularlibrary.recycler.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import ru.geekbrains.kozirfm.popularlibrary.R;
import ru.geekbrains.kozirfm.popularlibrary.recycler.adapters.ItemAdapter;
import ru.geekbrains.kozirfm.popularlibrary.recycler.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_main);
        MainPresenter mainPresenter = new MainPresenter();
        RecyclerView recyclerView = findViewById(R.id.recycler);
        GridLayoutManager layoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        ItemAdapter itemAdapter = new ItemAdapter();
        recyclerView.setAdapter(itemAdapter);
        itemAdapter.setOnItemClickListener(mainPresenter::onButtonClick);
    }

}
