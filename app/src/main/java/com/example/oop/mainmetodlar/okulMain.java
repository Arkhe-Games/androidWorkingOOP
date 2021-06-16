package com.example.oop.mainmetodlar;

import com.example.oop.siniflar.Mudur;
import com.example.oop.siniflar.Ogretmen;
import com.example.oop.siniflar.Personel;
import com.example.oop.siniflar.İsci;

public class okulMain {
    public static void main(String args[]){

        Mudur mudur = new Mudur();
        Personel ogretmen = new Ogretmen();
        Personel isci = new İsci();
        mudur.iseAl(ogretmen);
        mudur.iseAl(isci);
        mudur.terfiAl(ogretmen);
        mudur.terfiAl(isci);
    }
}
