/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Program ini untuk menghitung massa jenis dan volume
 */
public class PBOULANG10114504Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus1 = new Kubus();
        Scanner scn = new Scanner (System.in);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi\t: ");
        int kbs = scn.nextInt();
        System.out.print("Massa\t: ");
        int ms = scn.nextInt();
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume\t: "+kubus1.hasilVolume(kbs));
        System.out.println("Massa Jenis\t: "+kubus1.hitungMassa(ms,kbs));
    }
    }
    

