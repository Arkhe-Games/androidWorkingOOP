package com.example.oop.siniflar;

public class Filmler {
    private int filmId;
    private String filmAd;
    private int filmYil;
    private Kategoriler kategoriId;
    private Yonetmenler yonetmenId;

    public Filmler() {
    }

    public Filmler(int filmId, String filmAd, int filmYil, Kategoriler kategoriId, Yonetmenler yonetmenId) {
        this.filmId = filmId;
        this.filmAd = filmAd;
        this.filmYil = filmYil;
        this.kategoriId = kategoriId;
        this.yonetmenId = yonetmenId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmAd() {
        return filmAd;
    }

    public void setFilmAd(String filmAd) {
        this.filmAd = filmAd;
    }

    public int getFilmYil() {
        return filmYil;
    }

    public void setFilmYil(int filmYil) {
        this.filmYil = filmYil;
    }

    public Kategoriler getKategoriId() {
        return kategoriId;
    }

    public void setKategoriId(Kategoriler kategoriId) {
        this.kategoriId = kategoriId;
    }

    public Yonetmenler getYonetmenId() {
        return yonetmenId;
    }

    public void setYonetmenId(Yonetmenler yonetmenId) {
        this.yonetmenId = yonetmenId;
    }
}
