package ru.geekbrains.kozirfm.popularlibrary.recycler.model;

import android.util.Log;

public class Model {
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
        Log.d("MODEL_COUNT", String.valueOf(count));
    }
}
