/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan41.massajenis;

/**
 *
 * @author
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Program class untuk menghitung massa jenis dan volume
 */
class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hasilVolume(int sisi){
        int hasil = sisi*sisi*sisi;
        return hasil;
        
    }
    public int hitungMassa(int massa, int volume){
        int hitung = massa/(volume*volume*volume);
        return hitung;
    }
}
    
