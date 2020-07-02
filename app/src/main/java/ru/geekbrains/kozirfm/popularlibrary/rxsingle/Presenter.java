package ru.geekbrains.kozirfm.popularlibrary.rxsingle;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class Presenter {

    public Single<String> getMessage() {
        return Single.create((SingleOnSubscribe<String>)
                emitter -> emitter.onSuccess("Message")).subscribeOn(Schedulers.io());
    }
}
