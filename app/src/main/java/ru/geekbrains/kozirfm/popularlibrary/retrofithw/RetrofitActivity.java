package ru.geekbrains.kozirfm.popularlibrary.retrofithw;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import ru.geekbrains.kozirfm.popularlibrary.R;

public class RetrofitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);

        ImageView imageView = findViewById(R.id.imageView);

        new RetrofitApi().requestServer().observeOn(AndroidSchedulers.mainThread()).subscribe(user ->
                        Glide
                                .with(getApplicationContext())
                                .load(user.avatar_url)
                                .into(imageView)
                , Throwable::printStackTrace);
    }

}
