package com.example.oop;

public class ExamFive {
    // Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen metodu yazınız.
    // Kenar sayısı (n-2)*180
    public int icAciToplami=0;
    public int aciBul(int kenarSayisi){
        icAciToplami=(kenarSayisi-2)*180;
        return icAciToplami;
    }

}
