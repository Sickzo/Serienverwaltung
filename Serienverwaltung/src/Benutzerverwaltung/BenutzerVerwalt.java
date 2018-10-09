package Benutzerverwaltung;

import java.util.ArrayList;
import java.util.List;

public class BenutzerVerwalt  {

    public int Benutzernummer = 0;

    public static Benutzer momentanerBenutzer ;
    private List<Benutzer> benutzerDaten  = new ArrayList<>();

    public void add (Benutzer b){
        benutzerDaten.add(b);
    }

    public void delete (Benutzer b){
      for (Benutzer be : benutzerDaten)
          if( be==b )
              benutzerDaten.remove(be);
    }


    public int getBenutzernummer() {
        return Benutzernummer;
    }

    public void setBenutzernummer(int benutzernummer) {
        Benutzernummer = benutzernummer;
    }

    public static Benutzer getmomentanerBenutzer() {
        return momentanerBenutzer;
    }

    public void setmomentanerBenutzer(Benutzer momentanerBenutzer) {
        this.momentanerBenutzer = momentanerBenutzer;
    }

    public void setBenutzerDaten(List<Benutzer> benutzerDaten) {
        this.benutzerDaten = benutzerDaten;
    }
    public List<Benutzer> getBenutzerDaten() {
        return benutzerDaten;
    }

}

