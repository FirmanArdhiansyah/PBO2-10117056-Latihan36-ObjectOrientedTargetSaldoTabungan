/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author  Nama : Firman Ardhiansyah
 *          Kelas : IF-2 (PB02)
 *          NIM : 10117056
 * Deskripsi Program : Menghitung pada bulan ke berapa saldo target terpenuhi
 * dari saldo awal yang terus berbunga setiap bulannya hingga mencapai target saldo
 *
 */
public class main {

    public static void main(String[] args) {
        Tabungan tab = new Tabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo, saldoTarget);

    }

}
