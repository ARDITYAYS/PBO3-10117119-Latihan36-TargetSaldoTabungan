/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan36targetsaldotabungan;

/**
 *
 * @author Yogaputra
 * NAMA : ARDITYA YOGAPUTRA S
 * NIM : 10117119
 * KELAS : PBO3 / IF-3
 * Deskripsi Program : Program ini dapat melihat target 
 */
public class PBO310117119Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Target tar = new Target();

        tar.saldo = 3500000;
        tar.bunga = 8;
        int saldoTarget = 6000000;

        tar.HitungSaldoTarget(tar.saldo,saldoTarget);
    }
    
}
