package com.example.mguimaraes.viagens.ui.viewmodels;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.example.mguimaraes.viagens.data.remote.Response.Response;
import com.example.mguimaraes.viagens.domain.model.Flights;
import com.example.mguimaraes.viagens.domain.repository.OutboundFlightsRepository;
import com.example.mguimaraes.viagens.util.schedulers.BaseScheduler;

import javax.inject.Inject;

public class OutboundFlightsViewModel extends ViewModel {

    private OutboundFlightsRepository outboundFlightsRepository;

    private BaseScheduler scheduler;

    private MutableLiveData<Boolean> loadingStatus = new MutableLiveData<>();

    private MutableLiveData<Response<Flights>> response = new MutableLiveData<>();

    @Inject
    OutboundFlightsViewModel(OutboundFlightsRepository outboundFlightsRepository, BaseScheduler scheduler) {
        this.outboundFlightsRepository = outboundFlightsRepository;
        this.scheduler = scheduler;
    }

    public void loadData() {
        outboundFlightsRepository.getFlights()
                .subscribeOn(scheduler.io())
                .observeOn(scheduler.ui())
                .doOnSubscribe(s -> loadingStatus.setValue(true))
                .doAfterTerminate(() -> loadingStatus.setValue(false))
                .subscribe(
                        flighstResponse -> response.setValue(Response.success(flighstResponse)),
                        throwable -> response.setValue(Response.error(throwable))
                );
    }
}
