package ru.geekbrains.kozirfm.popularlibrary.Lesson2.rxjava;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import ru.geekbrains.kozirfm.popularlibrary.R;

public class MainActivity extends AppCompatActivity {

    private Observable<String> observable;
    private Disposable disposable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rxjava_activity);

        Presenter presenter = new Presenter();
        observable = presenter.getMessage();

        findViewById(R.id.start).setOnClickListener(v ->
                observable
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<String>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                MainActivity.this.disposable = d;
            }

            @Override
            public void onNext(@NonNull String s) {
                Log.d("MESSAGE", s);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {

            }
        }));

        findViewById(R.id.stop).setOnClickListener(v -> disposable.dispose());

    }
}
