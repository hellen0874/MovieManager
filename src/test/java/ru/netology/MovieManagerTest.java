package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MovieManagerTest {
    @Test
// проверка создания массива без новых фильмов
    public void ShouldAddArrayWithoutMovies() {
        MovieManager movieManager = new MovieManager();
        String[] actual = movieManager.findAll();
        String[] expected = {  };

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
// проверка добавления новых фильмов
    public void ShouldAddNewMovie() {
        MovieManager movieManager = new MovieManager();
        movieManager.addFilm("Фильм 1");
        movieManager.addFilm("Фильм 2");
        String[] actual = movieManager.findAll();
        String[] expected = { "Фильм 1", "Фильм 2" };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
// проверка добавления одного нового фильма
    public void ShouldAddOneNewMovie() {            // проверка добавления одного фильмов в пустой список
        MovieManager movieManager = new MovieManager();
        movieManager.addFilm("Фильм 1");
        String[] actual = movieManager.findAll();
        String[] expected = { "Фильм 1" };

        Assertions.assertArrayEquals(expected, actual);
    }
}

