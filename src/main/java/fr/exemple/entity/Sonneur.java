package fr.exemple.entity;

import fr.exemple.entity.Instrument;
import fr.exemple.entity.Musicien;

public class Sonneur implements Musicien{
    private String nom;
    private Instrument cornemuse;

//    public Sonneur() {
//    }

    public Sonneur(String nom, Instrument cornemuse) {
        this.nom = nom;
        this.cornemuse = cornemuse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getCornemuse() {
        return cornemuse;
    }

    public void setCornemuse(Instrument cornemuse) {
        this.cornemuse = cornemuse;
    }

    /**
     * methode pour jouer d'un instrument
     */
    @Override
    public void jouer() {
        System.out.println(this.getNom()+" joue : "+this.getCornemuse());

    }

}
