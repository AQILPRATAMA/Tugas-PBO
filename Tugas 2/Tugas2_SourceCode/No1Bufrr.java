/*
TUGAS 2
NAMA : AQIL PRATAMA
NIM : 13020220146
KELAS : A4 -TI
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1Bufrr {
    public static void main(String[] args) throws IOException {

        BufferedReader inputdata = new BufferedReader(new InputStreamReader(System.in));
        
        // Input data mahasiswa oleh user
        System.out.println("Input Data Mahasiswa");
        System.out.print("Nim      : ");
        String inputnim = inputdata.readLine();
        System.out.print("Nama     : ");
        String inputnama = inputdata.readLine();
        System.out.print("Jurusan  : ");
        String inputjurusan = inputdata.readLine();
        System.out.print("Fakultas : ");
        String inputfakultas = inputdata.readLine();

        // Output dari inputan oleh pengguna
        System.out.println("\nData Mahasiswa");
        System.out.println("Nim      : " + inputnim);
        System.out.println("Nama     : " + inputnama);
        System.out.println("Jurusan  : " + inputjurusan);
        System.out.println("Fakultas : " + inputfakultas);

        inputdata.close();
    }
}
