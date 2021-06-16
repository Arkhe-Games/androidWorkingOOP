package com.example.oop.mainmetodlar;

import com.example.oop.siniflar.Adresler;
import com.example.oop.siniflar.Kisiler;

public class CompositionMain {
    public static void main(String args[]){
        Adresler adresler = new Adresler("İstanbul","Fatih");
        Kisiler kisiler = new Kisiler("Ahmet",232323,adresler);

        System.out.println("Kişi ad:"+kisiler.getIsim());
        System.out.println("Kişi tel:"+kisiler.getTel());
        System.out.println("Kişi il:"+kisiler.getAdres().getIl());
        System.out.println("Kişi ilçe:"+kisiler.getAdres().getIlce());





    }

}
