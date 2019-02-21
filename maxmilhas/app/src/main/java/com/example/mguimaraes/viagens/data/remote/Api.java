package com.example.mguimaraes.viagens.data.remote;

import com.example.mguimaraes.viagens.domain.model.Flights;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Api {

    @GET("search")
    Observable<Flights> fetchFlights();
}
