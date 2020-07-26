package ru.geekbrains.kozirfm.popularlibrary.retrofithw;

import com.google.gson.Gson;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitApi {

    public Single<User> requestServer() {

        Gson gson = new Gson();

        GsonConverterFactory gsonConverterFactory = GsonConverterFactory.create(gson);

        RetrofitService service = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .addConverterFactory(gsonConverterFactory)
                .build()
                .create(RetrofitService.class);

        return service.getUser().subscribeOn(Schedulers.io());

    }
}
