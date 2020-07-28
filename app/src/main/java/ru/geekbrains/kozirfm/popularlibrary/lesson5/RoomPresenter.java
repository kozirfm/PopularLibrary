package ru.geekbrains.kozirfm.popularlibrary.lesson5;

import android.util.Log;

import java.util.ArrayList;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class RoomPresenter {

    private UserDao userDao;

    public RoomPresenter() {
        userDao = App.getAppDatabase().userDao();

    }

    ArrayList<User> list = new ArrayList<>();
    User user = new User("Petr", "Petrov", "22");

    public void putData() {

        Disposable disposable = userDao.insert(user).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> Log.d("ROOM", id.toString()), Throwable::printStackTrace);
    }

    public void putAllData() {

        list.add(new User("Ivan", "Ivanov", "18"));
        list.add(new User("Aleksandr", "Aleksandrov", "20"));
        list.add(user);

        Disposable disposable = userDao.insertList(list).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(longs -> Log.d("ROOM", longs.toString()), Throwable::printStackTrace);
    }

    public void getData() {
        Disposable disposable = userDao.getAll().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(users -> Log.d("ROOM", users.toString()), Throwable::printStackTrace);
    }

    public void deleteLastData() {
        Disposable disposable = userDao.delete().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(integer -> Log.d("ROOM", integer.toString()), Throwable::printStackTrace);
    }

    public void updateData(){
        Disposable disposable = userDao.update(user).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> Log.d("ROOM", id.toString()), Throwable::printStackTrace);
    }

}
