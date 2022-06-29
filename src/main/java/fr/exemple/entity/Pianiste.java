package fr.exemple.entity;

public class Pianiste implements Musicien{

    private String nom;
    private Instrument piano;

    public Pianiste() {
    }

    public Pianiste(String nom, Instrument piano) {
        this.nom = nom;
        this.piano = piano;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getPiano() {
        return piano;
    }

    public void setPiano(Instrument piano) {
        this.piano = piano;
    }

    /**
     * methode pour jouer d'un instrument
     */
    @Override
    public void jouer() {
        System.out.println(this.getNom()+" joue : "+this.getPiano());

    }
}
