package fr.exemple.entity;


import org.springframework.stereotype.Component;

/**
 * Classe guitare qui implement instrument
 */
@Component
public class Guitare implements Instrument{
    private String model;

    public Guitare(String model) {
        this.model = model;
    }

    public Guitare() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "glink glink glink";
    }
}


