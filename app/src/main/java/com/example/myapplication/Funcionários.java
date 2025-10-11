package com.example.myapplication;

public class Funcionários {

    float remuneracaoAt;
    String cargoAt;

    public  Funcionários(float r, String c ){
        this.cargoAt = c;
        this.remuneracaoAt = r;
    }

    public void setCargoAt(String c){
        this.cargoAt = c;
    }

    public void setRemuneracao(float r){
        this.remuneracaoAt = r;

    }

    public String getCargo(){
        return cargoAt;
    }

    public float getRemuneracaoAt(){
        return remuneracaoAt;
    }
}
