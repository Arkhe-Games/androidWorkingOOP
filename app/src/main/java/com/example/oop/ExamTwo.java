package com.example.oop;

public class ExamTwo {
    // Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan bir metod yazınız.
    public int cevre=0;
    public int cevreHesapla(int kisaKenar,int uzunKenar){
        cevre=(kisaKenar+uzunKenar)*2;
        return cevre;
    }
}
