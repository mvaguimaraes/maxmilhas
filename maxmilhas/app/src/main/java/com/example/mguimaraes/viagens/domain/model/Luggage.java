package com.example.mguimaraes.viagens.domain.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Luggage implements Serializable {

    @SerializedName("carryOn")
    private SingleLuggage carryOn;
    @SerializedName("checked")
    private SingleLuggage checked;

    public Luggage(SingleLuggage carryOn, SingleLuggage checked) {
        this.carryOn = carryOn;
        this.checked = checked;
    }

    public SingleLuggage getCarryOn() {
        return carryOn;
    }

    public void setCarryOn(SingleLuggage carryOn) {
        this.carryOn = carryOn;
    }

    public SingleLuggage getChecked() {
        return checked;
    }

    public void setChecked(SingleLuggage checked) {
        this.checked = checked;
    }
}
