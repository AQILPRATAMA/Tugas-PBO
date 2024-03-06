/*
TUGAS 2
NAMA : AQIL PRATAMA
NIM : 13020220146
KELAS : A4 -TI
 */
import java.util.Scanner;

public class No2Konverswktu {
    public static void main(String[] args) {
        Scanner inputDetik = new Scanner(System.in);

        // Input detik dari pengguna
        System.out.print("Masukkan Total Detik : ");
        long totalDetik = inputDetik.nextLong();

        // Menghitung jam, menit, dan detik
        long jamSekarang = (totalDetik / 3600) % 24;
        long menitSekarang = (totalDetik % 3600) / 60;
        long detikSekarang = totalDetik % 60;

        // Format hasil konversi (jam:menit:detik)
        String hasilKonversi = String.format("%02d:%02d:%02d", jamSekarang, menitSekarang, detikSekarang);

        // Output hasil konversi
        System.out.println("Tampil Waktu         : " + hasilKonversi);

        inputDetik.close();
    }
}
