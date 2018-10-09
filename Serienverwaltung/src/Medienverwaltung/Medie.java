package Medienverwaltung;

import Benutzerverwaltung.Benutzer;
import info.movito.themoviedbapi.model.Genre;
import info.movito.themoviedbapi.model.people.PersonCast;

import java.io.Serializable;
import java.util.List;

/* Eine Superklasse für Serien und Filme, da diese viele Attribute teilen,
   aber dennoch einige grundliegende Unterschiede besitzen
 */

public class Medie {


    public String titel;
    public int ID;
    public List<Genre> genres;
    public String erscheinungsdatum;
    public List<PersonCast> schauspieler;
    public int bewertung;
    public String coverURL;
    public String kurzbeschreibung;
    public Benutzer besitzer;

    public String getTitel() {
        return titel;
    }

    public int getID() {
        return ID;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public String getErscheinungsdatum() {
        return erscheinungsdatum;
    }

    public List<PersonCast> getSchauspieler() {
        return schauspieler;
    }

    public int getBewertung() {
        return bewertung;
    }

    public String getCoverURL() {
        return coverURL;
    }
}
