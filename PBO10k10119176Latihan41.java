import java.util.Scanner;

import java.util.Scanner;
/**
 * Latihan41
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Massa Jenis
 */
public class PBO10k10119176Latihan41 {
    public static void main(String[] args) {
        int volume,parMassa;
        kubus jenis = new kubus();
        System.out.println("======Massa Jenis Kubus======");
        System.out.println("Sisi\t = " + jenis.getSisi());
        System.out.println("Massa\t = " + jenis.getMassa());

        System.out.println("======Hasil Perhitungan======");
        parMassa = jenis.getMassa();
        volume = jenis.hitungVolume(jenis.getSisi());
        System.out.println("Volume\t = " + jenis.hitungVolume(jenis.getSisi()));
        System.out.println("Massa\t = " + jenis.hitungMassaJenis(parMassa, volume));
        

    }
}
