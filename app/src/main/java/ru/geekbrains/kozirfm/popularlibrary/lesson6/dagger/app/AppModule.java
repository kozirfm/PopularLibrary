package ru.geekbrains.kozirfm.popularlibrary.lesson6.dagger.app;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.geekbrains.kozirfm.popularlibrary.lesson6.dagger.Green;

@Module
public class AppModule {

    private final App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Singleton
    @Provides
    Green provideGreen() {
        return new Green();
    }

}
