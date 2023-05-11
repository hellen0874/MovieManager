package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MovieManagerTest {
    @Test
// проверка создания массива без новых фильмов
    public void ShouldAddArrayWithoutMovies() {
        MovieManager movieManager = new MovieManager();
        String[] actual = movieManager.findAll();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
// проверка добавления 2 новых фильмов
    public void ShouldAddNewMovie() {
        MovieManager movieManager = new MovieManager();
        movieManager.addFilm("Фильм 1");
        movieManager.addFilm("Фильм 2");
        String[] actual = movieManager.findAll();
        String[] expected = {"Фильм 1", "Фильм 2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
// проверка добавления одного нового фильма
    public void ShouldAddOneNewMovie() {
        MovieManager movieManager = new MovieManager();
        movieManager.addFilm("Фильм 1");
        String[] actual = movieManager.findAll();
        String[] expected = {"Фильм 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
// проверка выдачи последних 5 фильмов из 5, конструктор без параметра
    public void ShouldFindLastIf5From5() {
        MovieManager movieManager = new MovieManager();
        movieManager.addFilm("Фильм 1");
        movieManager.addFilm("Фильм 2");
        movieManager.addFilm("Фильм 3");
        movieManager.addFilm("Фильм 4");
        movieManager.addFilm("Фильм 5");
        String[] actual = movieManager.findLast();
        String[] expected = {"Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
// проверка выдачи последних 5 фильмов из 4, конструктор без параметра
    public void ShouldFindLastIf5From4() {
        MovieManager movieManager = new MovieManager();
        movieManager.addFilm("Фильм 1");
        movieManager.addFilm("Фильм 2");
        movieManager.addFilm("Фильм 3");
        movieManager.addFilm("Фильм 4");
        String[] actual = movieManager.findLast();
        String[] expected = {"Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // выдача последних фильмов из 0, конструктор без параметра
    public void ShouldFindLastIf5From0() {
        MovieManager movieManager = new MovieManager();
        String[] actual = movieManager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
// проверка выдачи последних 5 фильмов из 6, конструктор без параметра
    public void ShouldFindLastIf5From6() {
        MovieManager movieManager = new MovieManager();
        movieManager.addFilm("Фильм 1");
        movieManager.addFilm("Фильм 2");
        movieManager.addFilm("Фильм 3");
        movieManager.addFilm("Фильм 4");
        movieManager.addFilm("Фильм 5");
        movieManager.addFilm("Фильм 6");
        String[] actual = movieManager.findLast();
        String[] expected = {"Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
// проверка выдачи последних x фильмов из x, конструктор c параметром
    public void ShouldFindLastIfХFromХ() {
        MovieManager movieManager = new MovieManager(7);
        movieManager.addFilm("Фильм 1");
        movieManager.addFilm("Фильм 2");
        movieManager.addFilm("Фильм 3");
        movieManager.addFilm("Фильм 4");
        movieManager.addFilm("Фильм 5");
        movieManager.addFilm("Фильм 6");
        movieManager.addFilm("Фильм 7");
        String[] actual = movieManager.findLast();
        String[] expected = {"Фильм 7", "Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
// проверка выдачи последних x фильмов из x+1, конструктор c параметром
    public void ShouldFindLastIfХFromХPlus1() {
        MovieManager movieManager = new MovieManager(7);
        movieManager.addFilm("Фильм 1");
        movieManager.addFilm("Фильм 2");
        movieManager.addFilm("Фильм 3");
        movieManager.addFilm("Фильм 4");
        movieManager.addFilm("Фильм 5");
        movieManager.addFilm("Фильм 6");
        movieManager.addFilm("Фильм 7");
        movieManager.addFilm("Фильм 8");
        String[] actual = movieManager.findLast();
        String[] expected = {"Фильм 8", "Фильм 7", "Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // проверка выдачи последних x фильмов из x-1, конструктор c параметром
    public void ShouldFindLastIfХFromХMinus1() {
        MovieManager movieManager = new MovieManager(7);
        movieManager.addFilm("Фильм 1");
        movieManager.addFilm("Фильм 2");
        movieManager.addFilm("Фильм 3");
        movieManager.addFilm("Фильм 4");
        movieManager.addFilm("Фильм 5");
        movieManager.addFilm("Фильм 6");
        String[] actual = movieManager.findLast();
        String[] expected = {"Фильм 6", "Фильм 5", "Фильм 4", "Фильм 3", "Фильм 2", "Фильм 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    // выдачи последних x фильмов из 0, конструктор c параметром
    public void ShouldFindLastIfХFrom0() {
        MovieManager movieManager = new MovieManager(7);
        String[] actual = movieManager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

}

