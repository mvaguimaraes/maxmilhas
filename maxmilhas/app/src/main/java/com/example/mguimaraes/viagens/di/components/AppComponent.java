package com.example.mguimaraes.viagens.di.components;

import com.example.mguimaraes.viagens.App;
import com.example.mguimaraes.viagens.di.modules.ActivityBuildersModule;
import com.example.mguimaraes.viagens.di.modules.AppModule;
import com.example.mguimaraes.viagens.di.modules.NetworkModule;
import com.example.mguimaraes.viagens.di.modules.ViewModelModule;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityBuildersModule.class,
        AppModule.class,
        NetworkModule.class})

interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<App> {}

}
