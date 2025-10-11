package com.example.myapplication;

public class Livros {

    float tituloAt;
    String subtituloAt;

    public  Livros(float ti, String sub  ){
        this.tituloAt = ti;
        this.subtituloAt = sub;
    }

    public void setCargoAt(String sub){
        this.subtituloAt = sub;
    }

    public void setRemuneracao(float ti){
        this.tituloAt = ti;

    }

    public String getCargo(){
        return subtituloAt;
    }

    public float getRemuneracaoAt(){
        return tituloAt;
    }
}
