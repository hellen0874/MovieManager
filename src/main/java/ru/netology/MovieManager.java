package ru.netology;

public class MovieManager {
    private String[] films = new String[0];
    private int amount;

    public MovieManager() {
        this.amount = 5;
    }

    public MovieManager(int amount) {
        this.amount = amount;
    }

    public void addFilm(String filmName) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = filmName;
        this.films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < amount) {
            resultLength = films.length;
        } else {
            resultLength = amount;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
