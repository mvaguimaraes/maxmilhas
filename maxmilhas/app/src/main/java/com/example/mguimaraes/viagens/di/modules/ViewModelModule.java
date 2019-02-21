package com.example.mguimaraes.viagens.di.modules;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.mguimaraes.viagens.di.keys.ViewModelKey;
import com.example.mguimaraes.viagens.ui.common.ViewModelFactory;
import com.example.mguimaraes.viagens.ui.viewmodels.OutboundFlightsViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public interface ViewModelModule {

    @Binds
    ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(OutboundFlightsViewModel.class)
    ViewModel bindOutboundFlightsViewModel(OutboundFlightsViewModel viewModel);
}
