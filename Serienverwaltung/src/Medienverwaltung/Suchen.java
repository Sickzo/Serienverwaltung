package Medienverwaltung;

import java.util.ArrayList;
import java.util.List;
import API.Suche;
import Listenverwaltung.Liste;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.model.MovieDb;
import info.movito.themoviedbapi.model.core.MovieResultsPage;

public class Suchen {
    private static String ApiKey = "b56bf65003a2ef0bf1d79d06b858a25f";

    public static List<Film> filmSuchen(String suchbegriff) {
        API.Suche s = new API.Suche();
        List<Film> listeDerFilme = new ArrayList<>();
        List<Integer> filmIds = new ArrayList<>();
        filmIds = s.FilmenachName(suchbegriff);
        for (int i : filmIds) {
            listeDerFilme.add(new Film(i));
        }
        return listeDerFilme;
    }

    public static List<Serie> serieSuchen(String suchbegriff) {
        API.Suche s = new API.Suche();
        List<Serie> listeDerSerien = new ArrayList<>();
        List<Integer> serienIds = new ArrayList<>();
        serienIds = s.SerieNachName(suchbegriff);
        for (int i : serienIds) {
            listeDerSerien.add(new Serie(i));
        }
        return listeDerSerien;
    }

    public Liste populäreFilme() {
        TmdbMovies movies = (new TmdbApi(ApiKey).getMovies());
        MovieResultsPage popFilme = movies.getPopularMovies("de", 1);
        Liste topFilme = new Liste("populäre_Filme");
        for (MovieDb m : popFilme) {
            topFilme.add(new Film(m.getId()));

        }
        return topFilme;

    }
}
