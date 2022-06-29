package fr.exemple.entity;

public class Cornemuse implements Instrument{



    private String cornemuse;

    public Cornemuse(String cornemuse) {
        this.cornemuse = cornemuse;
    }

    public Cornemuse() {
    }

    public String getCornemuse() {
        return cornemuse;
    }

    public void setCornemuse(String cornemuse) {
        this.cornemuse = cornemuse;
    }

    public String toString() {
        return " lalalalala";
    }
}

