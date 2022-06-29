package fr.exemple.entity.factory;

import fr.exemple.entity.Guitariste;
import fr.exemple.entity.Musicien;
import fr.exemple.entity.Pianiste;

/**
 * Factory qui a pour role d'instancier des musiciens
 * @author Hoc Bed
 */

public class MusicienFactory {

    public static Musicien getPianiste() {
        return new Pianiste();
    }

    public static Musicien getPianiste(String nom) {
        return new Pianiste(nom, InstrumentFactory.getPiano());
    }

    public static Musicien getPianiste(String nom, String piano) {
        return new Pianiste(nom, InstrumentFactory.getPiano());
    }

    public static Musicien getGuitariste() {
        return new Guitariste();
    }

    public static Musicien getGuitariste(String nom) {
        return new Guitariste(nom, InstrumentFactory.getGuitare());
    }

    public static Musicien getGuitariste(String nom, String model) {
        return new Guitariste(nom, InstrumentFactory.getGuitare(model));
    }




}
