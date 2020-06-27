package ru.geekbrains.kozirfm.popularlibrary.recycler.presenter;

import ru.geekbrains.kozirfm.popularlibrary.recycler.model.Model;

public class MainPresenter {
    private Model model;

    public MainPresenter() {
        model = new Model();
    }

    public void onButtonClick() {
        model.setCount(model.getCount() + 1);
    }
}
