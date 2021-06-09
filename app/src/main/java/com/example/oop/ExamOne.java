package com.example.oop;

public class ExamOne {
    // parametere olarak girilen dereceyi fahrenheit'a dönüştürdükten sonra geri döndüren metodu yazınız.T=T*1,8+32
    public double fahrenheit=0.0;


    public double dereceHesapla(double derece){
        fahrenheit=(derece*1.8)+32;
        return fahrenheit;
    }

}
