package com.example.mguimaraes.viagens.util.schedulers;

import android.support.annotation.NonNull;

import io.reactivex.Scheduler;

public interface BaseScheduler {

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();

}
