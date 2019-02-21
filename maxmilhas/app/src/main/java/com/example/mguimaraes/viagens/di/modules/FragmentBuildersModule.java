package com.example.mguimaraes.viagens.di.modules;

import com.example.mguimaraes.viagens.ui.fragments.InboundFlightsFragment;
import com.example.mguimaraes.viagens.ui.fragments.OutboundFlightsFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public interface FragmentBuildersModule {

    @ContributesAndroidInjector
    OutboundFlightsFragment contributeOutboundFlightsFragment();

    @ContributesAndroidInjector
    InboundFlightsFragment contributeInboundFlightsFragment();

}
