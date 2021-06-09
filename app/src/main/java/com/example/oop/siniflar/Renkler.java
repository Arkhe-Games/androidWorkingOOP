package com.example.oop.siniflar;

public class Renkler {
    public static final int Beyaz=1111;
    public static final int Siyah=0000;
    public static final int Kirmizi=3333;

    public void renkTercih(int renkTerci){
        if (renkTerci==1111){
            System.out.println("Beyaza boyandı");
        }
        if (renkTerci==0000){
            System.out.println("Siyaha boyandı");
        }
        if (renkTerci==3333){
            System.out.println("Kırmızıya boyandı");
        }


    }


}
