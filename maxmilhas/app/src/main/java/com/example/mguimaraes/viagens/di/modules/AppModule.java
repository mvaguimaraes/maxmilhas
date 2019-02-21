package com.example.mguimaraes.viagens.di.modules;

import com.example.mguimaraes.viagens.data.remote.Api;
import com.example.mguimaraes.viagens.domain.repository.OutboundFlightsRepository;
import com.example.mguimaraes.viagens.util.schedulers.BaseScheduler;
import com.example.mguimaraes.viagens.util.schedulers.SchedulerProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module(includes = ViewModelModule.class)
public class AppModule {

    @Provides
    @Singleton
    Api provideApi(Retrofit retrofit) {
        return retrofit.create(Api.class);
    }

    @Provides
    @Singleton
    OutboundFlightsRepository provideOutboundFlightsRepository(Api api) {
        return new OutboundFlightsRepository(api);
    }

    @Provides
    @Singleton
    BaseScheduler provideSchedulerProvider() {
        return new SchedulerProvider();
    }

}
