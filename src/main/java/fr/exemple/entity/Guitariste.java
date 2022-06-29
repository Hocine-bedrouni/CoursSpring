package fr.exemple.entity;

/**
 * Classe Guitariste qui implement Musicien
 */

public class Guitariste implements Musicien{


    private String nom;
    private Instrument guitare;

    public Guitariste() {
    }

    public Guitariste(String nom, Instrument guitare) {
        this.nom = nom;
        this.guitare = guitare;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getGuitare() {
        return guitare;
    }

    public void setGuitare(Instrument guitare) {
        this.guitare = guitare;
    }

    /**
     * methode pour jouer d'un instrument
     */
    @Override
    public void jouer() {
        System.out.println(this.getNom()+" joue : "+this.getGuitare());

    }
}
