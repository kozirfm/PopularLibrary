package ru.geekbrains.kozirfm.popularlibrary;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GsonActivity extends AppCompatActivity {


    public static final String GSON = "GSON";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        String json = "{\"time_of_year\": \"summer\", \"year\": 2019}";

        Gson gson = new Gson();
        GsonPractice gsonPractice = gson.fromJson(json, GsonPractice.class);

        Log.d(GSON, gsonPractice.time_of_year);
        Log.d(GSON, gsonPractice.year);

    }

}

class GsonPractice {
    @Expose
    @SerializedName("time_of_year")
    public String time_of_year;

    @Expose
    @SerializedName("year")
    public String year;
}
