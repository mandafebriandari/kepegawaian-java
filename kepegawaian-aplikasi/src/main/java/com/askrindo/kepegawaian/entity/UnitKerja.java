package com.askrindo.kepegawaian.entity;

public class UnitKerja {
    private String kode;
    private String namaUnitKerja;
    
    public UnitKerja(){
        System.out.print("konstruktor ");
    }
    
    public UnitKerja(String kode, String namaUnitKerja){
        System.out.print("konstruktor dengan parameter");
    }
    public String getKode(){
        return kode;
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    
    public String getNamaUnitKerja(){
        return namaUnitKerja;
    }
    
    public void setNamaUnitKerja(String namaUnitKerja){
        this.namaUnitKerja = namaUnitKerja;
    }
}