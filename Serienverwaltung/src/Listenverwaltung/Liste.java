package Listenverwaltung;

import Benutzerverwaltung.Benutzer;
import Benutzerverwaltung.BenutzerVerwalt;
import Medienverwaltung.Medie;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Liste implements Serializable {

    public String name;
    Benutzer besitzer;
    public List<Medie> inhalt;


    /*Wenn die Liste angelegt wird, der momenate Benutzer als Besitzer registriert und die Liste
        seiner Bibliothek hinzugefügt
     */

    public Liste(String name) {
        this.name = name;
        inhalt = new ArrayList<>();
        BenutzerVerwalt.getmomentanerBenutzer().listebenutzerhinzufügen(this);
        this.besitzer = BenutzerVerwalt.getmomentanerBenutzer();
    }

    public String getName() {
        return name;
    }

    public Benutzer getBesitzer() {
        return besitzer;
    }

    public Medie get(int i){
     return inhalt.get(i);
    }

    public void add(Medie me){
    inhalt.add(me);
    }

    public void delete (int i){
        inhalt.remove(i);
    }

    @Override
    public String toString() {
    String übersicht =name + "\n";
    for(Medie me: inhalt){
    übersicht += me.titel + " " + me.erscheinungsdatum + " " + me.genres;
    übersicht += "\n";
    }
    return übersicht;
    }
}
