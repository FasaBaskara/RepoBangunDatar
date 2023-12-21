package com.mycompany.gitbangundatar;

/**
 *
 * @author baska
 */
public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi() {
    }

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public Persegi(double sisi, String nama, String jumlahSudut) {
        super(nama, jumlahSudut);
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
     return sisi*sisi;   
    }

    @Override
    public double hitungKeliling() {
        return 4*sisi;
    }
    
    
}
