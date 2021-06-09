package com.example.oop.exams;

public class ExamFour {
    //Parametre olarak girilen kelime ve harf için harfin kelime içinde kaç adet olduğunu gösteren bir method yazınız.
    public int harfSayısı=0;
    public int harfSayısıHesapla(String kelime){
        harfSayısı=kelime.length();
        return harfSayısı;
    }
}
