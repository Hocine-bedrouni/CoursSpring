package fr.exemple.entity.factory;

import fr.exemple.entity.Guitare;
import fr.exemple.entity.Instrument;
import fr.exemple.entity.Piano;

/**
 * Factory qui pour role d'instancier des instruments
 * @author Hoc Bed
 */

public class InstrumentFactory {

    // toute les methodes de mes factory sont static

    public static Instrument getGuitare() {
        return new Guitare();
    }

    public static Instrument getGuitare(String model) {
        return new Guitare(model);
    }

    public static Instrument getPiano() {
        return new Piano();
    }

    public static Instrument getPiano(String piano) {
        return new Piano(piano);
    }



}
