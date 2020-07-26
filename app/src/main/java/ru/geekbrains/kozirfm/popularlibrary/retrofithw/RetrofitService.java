package ru.geekbrains.kozirfm.popularlibrary.retrofithw;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface RetrofitService {
    @GET("/users/kozirfm")
    Single<User> getUser();
}
