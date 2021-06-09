package com.example.oop.siniflar;

public class  Ogrenci {
    private String isim;
    private int okulNo;

    public Ogrenci(){

    }
    public Ogrenci(String isim,int okulNo){
        this.isim=isim;
        this.okulNo=okulNo;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public void bilgiAl(){

        System.out.println("Ogrenci ismi=" +isim);
        System.out.println("Ogrenci no="+okulNo);
    }
}
