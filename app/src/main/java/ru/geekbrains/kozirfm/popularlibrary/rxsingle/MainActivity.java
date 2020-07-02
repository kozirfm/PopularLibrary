package ru.geekbrains.kozirfm.popularlibrary.rxsingle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;
import ru.geekbrains.kozirfm.popularlibrary.R;

public class MainActivity extends AppCompatActivity {

    private Single<String> single;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rxsingle_activity);

        ButterKnife.bind(this);

        Presenter presenter = new Presenter();
        single = presenter.getMessage();

    }

    public void onSingleButtonClick(View view) {
        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(
                s -> Log.d("ON_SUCCESS", s),
                throwable -> Log.d("ON_ERROR", "Error"));
    }
}
