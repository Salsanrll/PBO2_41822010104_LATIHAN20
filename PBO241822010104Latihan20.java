/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo2.pkg41822010104.latihan20;
/**
 *
 * @author SALSA NURUL LAELI
 * Nama : Salsa Nurul Laeli
 * NIM  : 41822010104
 */
public class PBO241822010104Latihan20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Format Tugas PBO");
        double saldoAwal = 3500000;
        double bungaPerBulan = 0.08; // 8% bunga per bulan
        double saldoTarget = 6000000;
        int bulan = 0;

        while (saldoAwal < saldoTarget) {
            bulan++;
            saldoAwal += saldoAwal * bungaPerBulan;
            System.out.println("Saldo di bulan ke-" + bulan + " Rp. " + saldoAwal);
            
        }
    System.out.println("\nDeveloped by: Salsa Nurul Laeli");
    }
    }
    
