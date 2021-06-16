package com.example.oop.siniflar;

public class Mudur extends Personel {
    public void iseAl(Personel p){
        p.iseAlindi();
    }
    public void terfiAl(Personel p){
        ((Ogretmen)p).maasArttir();
    }
}
