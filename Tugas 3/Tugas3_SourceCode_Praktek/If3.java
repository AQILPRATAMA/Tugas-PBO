/* NIM : 13020220146
Nama : Aqil Pratama
Hari/Tangga : Rabu 13/03/2024
Waktu Pengerjaan : 17:00 */

import java.util.Scanner;

public class If3 {

    public static void main(String[] args) {
     
        int a;
        Scanner masukan = new Scanner(System.in);

        System.out.print("Contoh IF tiga kasus \n");
        System.out.print("Ketikkan suatu nilai integer :");
        a = masukan.nextInt();
        if (a > 0) {
            System.out.println("Nilai a positif " + a);
        } else if (a == 0) {
            System.out.println("Nilai Nol " + a);
        } else {
            System.out.println("Nilai a negatif " + a);
        }
    }
}