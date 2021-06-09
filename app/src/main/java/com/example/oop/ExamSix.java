package com.example.oop;

public class ExamSix {
    /* Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri geri
    döndüren metodu yazın.
    - 1 günde 8 saat çalışabilir
    - Çalışma saati ücreti 10tl
    - Mesai saat ücreti 20 tl
    - 160 saat üzeri mesaiye girer.
    */
    public int maasSonucu=0;
    public int maasHesapla(int gunSayisi){
        int calismaSaati=gunSayisi*8;
        if(calismaSaati>160){
            int mesaiSaat=calismaSaati-160;
            maasSonucu=(160*10)+(mesaiSaat*20);

        }else {
            maasSonucu=calismaSaati*10;
        }
        return maasSonucu;
    }
}
