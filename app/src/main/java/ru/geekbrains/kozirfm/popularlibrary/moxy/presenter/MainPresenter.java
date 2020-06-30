package ru.geekbrains.kozirfm.popularlibrary.moxy.presenter;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.geekbrains.kozirfm.popularlibrary.moxy.model.Model;
import ru.geekbrains.kozirfm.popularlibrary.moxy.view.MainView;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {

    private Model model;

    public MainPresenter() {
        model = new Model();
    }

    public void onButtonClick(String s) {
        String oldString = model.getS();
        String newString = oldString + s;
        model.setS(newString);
        getViewState().setText(newString);
    }

}
