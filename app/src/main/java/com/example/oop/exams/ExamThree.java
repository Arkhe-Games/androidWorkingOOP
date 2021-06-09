package com.example.oop.exams;

public class ExamThree {
    // Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri döndüren metodu yazınız.
    public int faktoriyelSonuc=1;

    public int faktoriyelHesapla(int faktoriyel){
        while (faktoriyel>0){
            faktoriyelSonuc=faktoriyelSonuc*faktoriyel;
            faktoriyel--;
        }

        return faktoriyelSonuc;
    }
}
