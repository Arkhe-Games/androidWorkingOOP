package com.example.oop.mainmetodlar;

import com.example.oop.siniflar.Filmler;
import com.example.oop.siniflar.Kategoriler;
import com.example.oop.siniflar.Yonetmenler;

public class compositonOrnek {
    public static void main(String args[]) {
        Yonetmenler yonet = new Yonetmenler(1, "Nuri Bilge Ceylen");
        Yonetmenler yonet2 = new Yonetmenler(2, "Quetin Tarantino");
        Yonetmenler yonet3 = new Yonetmenler(3, "Christopher Nolan");
        Kategoriler kato = new Kategoriler(1, "Dram");
        Kategoriler kato2 = new Kategoriler(2, "Komedi");
        Kategoriler kato3 = new Kategoriler(3, "Bilim Kurgu");
        Filmler film = new Filmler(1, "Django", 2013, kato, yonet2);
        Filmler film2 = new Filmler(2, "Inception", 2016, kato3, yonet3);

        System.out.println("Film Id:"+film.getFilmId());
        System.out.println("Film Ad:"+film.getFilmAd());
        System.out.println("Film Yıl:"+film.getFilmYil());
        System.out.println("Film Kategori:"+film.getKategoriId().getKategoriAd());
        System.out.println("Film Yonetmeni:"+film.getYonetmenId().getYonetmenAd());


    }


}
