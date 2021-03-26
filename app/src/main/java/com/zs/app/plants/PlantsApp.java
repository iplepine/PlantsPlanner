package com.zs.app.plants;

import android.app.Application;

import com.zs.app.plants.di.component.AppComponent;
import com.zs.app.plants.di.component.DaggerAppComponent;
import com.zs.app.plants.di.module.AppModule;

public class PlantsApp extends Application {

    public static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this.getApplicationContext()))
                .build();
    }
}
