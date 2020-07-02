package ru.geekbrains.kozirfm.popularlibrary.rxobserver;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import ru.geekbrains.kozirfm.popularlibrary.R;

public class MainActivity extends AppCompatActivity {

    private Observable<String> observable;
    private Disposable disposable;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rxobserver_activity);

        ButterKnife.bind(this);

        Presenter presenter = new Presenter();
        observable = presenter.getMessage();

    }

    @OnClick(R.id.startMsg)
    public void onStartButtonClick(View view) {
        disposable = observable.observeOn(AndroidSchedulers.mainThread()).subscribe(
                s -> Log.d("ON_NEXT", s),
                throwable -> Log.d("ON_ERROR", "Error"),
                () -> Log.d("ON_COMPLETE", "Complete"));
    }

    @OnClick(R.id.stopMsg)
    public void onStopButtonClick(View view) {
        if (disposable != null) disposable.dispose();
    }
}
