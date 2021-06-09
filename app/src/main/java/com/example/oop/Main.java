package com.example.oop;

public class Main {
    public static void main(String args[]){
        ExamOne derece=new ExamOne();
        derece.dereceHesapla(30.0);
        System.out.println("Derece sonucu="+derece.fahrenheit);


        ExamTwo cevre=new ExamTwo();
        cevre.cevreHesapla(5,3);
        System.out.println("Cevre sonucu="+cevre.cevre);

        ExamThree fakto=new ExamThree();
        fakto.faktoriyelHesapla(3);
        System.out.println("Faktoriyel sonucu="+fakto.faktoriyelSonuc);

        ExamFour kelime= new ExamFour();
        kelime.harfSayısıHesapla("burak");
        System.out.println("Harf sayısı="+kelime.harfSayısı);

        ExamFive aci= new ExamFive();
        aci.aciBul(3);
        System.out.println("İç açıları toplamı="+aci.icAciToplami);

        ExamSix maas=new ExamSix();
        maas.maasHesapla(40);
        System.out.println("Maaşınız ="+maas.maasSonucu);



    }
}
