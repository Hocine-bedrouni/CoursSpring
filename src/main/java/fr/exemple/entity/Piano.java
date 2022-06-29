package fr.exemple.entity;



/**
 * Classe Piano qui implement l'interface Instrument
 */
public class Piano implements Instrument{

    private String piano;

    public Piano(String piano) {
        this.piano = piano;
    }

    public Piano() {
    }

    public String getPiano() {
        return piano;
    }

    public void setPiano(String piano) {
        this.piano = piano;
    }

    public String toString() {
        return " lalalalala";
    }
}

