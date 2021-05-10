/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

public class PersegiPanjangBalok implements BangunDatar, BangunRuang {
    double panjang, lebar, tinggi;

    public PersegiPanjangBalok (double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas() {
        return panjang*lebar;
    }

    @Override
    public double keliling() {
        return 2*(panjang+lebar);
    }

    @Override
    public double volume() {
        return panjang*lebar*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
}
