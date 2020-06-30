package ru.geekbrains.kozirfm.popularlibrary.Lesson2.rxjava;

import java.util.concurrent.TimeUnit;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Presenter {
    public Observable<String> getMessage() {

        return Observable.create((ObservableOnSubscribe<String>) emitter -> {
            try {
                for (int i = 0; i < 100; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    emitter.onNext("MESSAGE" + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).subscribeOn(Schedulers.io());
    }
}
