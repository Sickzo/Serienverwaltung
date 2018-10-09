package Medienverwaltung;

import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbTV;
import info.movito.themoviedbapi.model.tv.TvSeries;

import java.io.Serializable;

public class Serie extends Medie implements Serializable {

    public int anzahlStaffeln;
    public int anzahlEpisoden;
    public int längeProEpisode;

    public Serie(int ID){
        TmdbTV seriensammlung = (new TmdbApi("b56bf65003a2ef0bf1d79d06b858a25f")).getTvSeries();
        this.ID = ID ;
        TvSeries serie = seriensammlung.getSeries(ID,"de");
        titel = serie.getName();
        genres = serie.getGenres();
        erscheinungsdatum = serie.getFirstAirDate();
        kurzbeschreibung = serie.getOverview();
        längeProEpisode = serie.getEpisodeRuntime().get(0);
        längeProEpisode = (int)Math.ceil(längeProEpisode);
        anzahlStaffeln = serie.getNumberOfSeasons();
        anzahlEpisoden = serie.getNumberOfEpisodes();
    }

}
