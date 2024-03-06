/*
TUGAS 2
NAMA : AQIL PRATAMA
NIM : 13020220146
KELAS : A4 -TI
 */
import java.util.Scanner;

public class No1Scan {
    public static void main(String[] args) {

        Scanner inputdata = new Scanner(System.in);

        // Input data mahasiswa oleh pengguna
        System.out.println("Input Data Mahasiswa");
        System.out.print("Nim      : ");
        String inputnim = inputdata.nextLine();
        System.out.print("Nama     : ");
        String inputnama = inputdata.nextLine();
        System.out.print("Jurusan  : ");
        String inputjurusan = inputdata.nextLine();
        System.out.print("Fakultas : ");
        String inputfakultas = inputdata.nextLine();

        System.out.println("\n");

        // Output dari inputan oleh pengguna
        System.out.println("Data Mahasiswa");
        System.out.println("Nim      : " + inputnim);
        System.out.println("Nama     : " + inputnama);
        System.out.println("Jurusan  : " + inputjurusan);
        System.out.println("Fakultas : " + inputfakultas);

        inputdata.close();
    }
}
