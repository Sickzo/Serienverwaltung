package Benutzerverwaltung;

import Listenverwaltung.Liste;
import Medienverwaltung.Medie;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Benutzer implements Serializable {

    public String name;
    private int ID;
    public static List<Liste> benutzerListen = new ArrayList<Liste>();
    private  String passwort;
    private List<Benutzer> freunde;

    public Benutzer (String Name, String passwort) {
        this.name = name;
        this.passwort = passwort;
    }
    public Liste getListe(String name){
        Liste gesuchteListe = null;
        for( Liste l :benutzerListen){
        if(l.getName() == name)
            gesuchteListe = l ;
        }
        return gesuchteListe;

    }
    // Dem Benutzer eine Liste zuordnen
    public void listebenutzerhinzufügen(Liste l){
    benutzerListen.add(l);
    }

    // Mit Angabe des Namens der Liste diese zurückerhalten
    private void listeerhalten(String name) {
        //TODO
    }

    // Alle vorhanden Listen des Benutzers erhalten
    private List<Liste> alleListenerhalten(){
        //TODO
        return null;
    }
    // Empfehlung aufgrund der Listen/Inhalte des Benutzers erhalten
    public List<Medie> empfehlungerhalten(){
        //TODO

        return null;
    }
}
