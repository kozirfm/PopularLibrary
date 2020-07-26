package ru.geekbrains.kozirfm.popularlibrary.retrofithw;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @Expose
    @SerializedName("avatar_url")
    String avatar_url;
}
