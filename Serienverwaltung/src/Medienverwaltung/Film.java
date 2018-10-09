package Medienverwaltung;

import Benutzerverwaltung.BenutzerVerwalt;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.model.MovieDb;


public class Film extends Medie  {

    // Um die vollständige URL des Coverbildes zu bekommen muss man diesen Wert mit dem
    //  Rückgabewert vervollständigen
    public static String filmCover = "https://image.tmdb.org/t/p/w600_and_h900_bestv2/";

    public int länge;
    public boolean gesehen;

    public Film(int ID){
        TmdbMovies movies = (new TmdbApi("b56bf65003a2ef0bf1d79d06b858a25f")).getMovies();
        this.ID = ID ;
        MovieDb movie = movies.getMovie(ID,"de");
        titel = movie.getTitle();
        genres = movie.getGenres();
        erscheinungsdatum = movie.getReleaseDate();
        schauspieler = movie.getCast();
        länge = movie.getRuntime();
        kurzbeschreibung = movie.getOverview();
        coverURL = filmCover + movie.getPosterPath();
        besitzer = BenutzerVerwalt.getmomentanerBenutzer();
    }
    public Film(String name){
        this.titel = name;
    }

    @Override
    public String toString() {
        return titel + " " + erscheinungsdatum + " " + länge + "\n";
    }

    // Länge des Films erhalten
    public int getLänge() {
        return länge;
    }

    public boolean isGesehen() {
        return gesehen;
    }
}


