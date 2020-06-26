package ru.geekbrains.kozirfm.popularlibrary.standart.presenter;

import ru.geekbrains.kozirfm.popularlibrary.standart.model.Model;
import ru.geekbrains.kozirfm.popularlibrary.standart.view.MainView;

public class MainPresenter {

    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        model = new Model();
    }

    public void onButtonClick(String s) {
        String oldString = model.getS();
        String newString = oldString + s;
        model.setS(newString);
        mainView.setText(newString);
    }

}
