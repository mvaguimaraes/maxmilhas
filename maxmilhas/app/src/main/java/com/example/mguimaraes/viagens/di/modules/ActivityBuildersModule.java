package com.example.mguimaraes.viagens.di.modules;

import com.example.mguimaraes.viagens.ui.activities.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface ActivityBuildersModule {

    @ContributesAndroidInjector(modules = {FragmentBuildersModule.class})
    MainActivity contributeMainActivity();

}
