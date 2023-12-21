/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gitbangundatar;

/**
 *
 * @author user
 */
public class segitiga extends BangunDatar {
     private double alas;
     private double tinggi;

    public segitiga() {
    }

    public segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
     
     
    @Override
    public double hitungLuas() {
            return 1/2 * alas * tinggi;
    }

    @Override
    public double hitungKeliling() {
         return 0;
    }
    
}
