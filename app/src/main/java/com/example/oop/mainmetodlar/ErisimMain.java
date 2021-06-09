package com.example.oop.mainmetodlar;

import com.example.oop.siniflar.Ogrenci;

public class ErisimMain {
    public static void main(String args[]){
        Ogrenci o1=new Ogrenci("Burak",123123);
        System.out.println("Ogr isim="+o1.getIsim());
        System.out.println("Ogr no="+o1.getOkulNo());
        o1.setIsim("Mehmet");
        o1.setOkulNo(14);
        System.out.println("Ogr ismi="+o1.getIsim());
        System.out.println("Ogr no="+o1.getOkulNo());



    }
}
