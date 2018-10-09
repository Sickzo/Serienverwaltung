package Tests;

import Benutzerverwaltung.Benutzer;
import Benutzerverwaltung.BenutzerVerwalt;
import Listenverwaltung.Liste;
import Medienverwaltung.Film;
import Medienverwaltung.Suchen;

import java.util.List;

public class TestV2 {
    public static void main(String[] args) {
        Benutzer b = new Benutzer("admin","1234");
        BenutzerVerwalt.momentanerBenutzer = b;
        Liste l = new Liste("ErsteListe");
        List<Film> filmListe = Suchen.filmSuchen("Transformers");
        for( Film f : filmListe)
            l .add(f);
        System.out.println(filmListe);
    }

}
