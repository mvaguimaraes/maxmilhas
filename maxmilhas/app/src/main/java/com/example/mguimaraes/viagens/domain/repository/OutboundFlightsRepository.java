package com.example.mguimaraes.viagens.domain.repository;

import com.example.mguimaraes.viagens.data.remote.Api;
import com.example.mguimaraes.viagens.domain.model.Flights;

import io.reactivex.Observable;

public class OutboundFlightsRepository {

    private Api api;

    public OutboundFlightsRepository(Api api) {
        this.api = api;
    }

    public Observable<Flights> getFlights() {
        return api.fetchFlights();
    }
}
