/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Dell
 */
public class SaldoTabungan {
    public static void main(String[] args) {
        // Input
        double saldoAwal = 2500000;
        double bungaPersen = 15;
        int lamaBulan = 6;

        // Konversi bunga persen ke bentuk desimal
        double bungaDesimal = bungaPersen / 100;

        // Hitung saldo setiap bulan
        for (int bulan = 1; bulan <= lamaBulan; bulan++) {
            saldoAwal *= (1 + bungaDesimal);
            System.out.println("Saldo di bulan ke-" + bulan + ": Rp " + Math.round(saldoAwal));
        }
    }
}
