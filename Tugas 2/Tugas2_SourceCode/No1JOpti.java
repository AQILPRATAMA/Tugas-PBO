/*
TUGAS 2
NAMA : AQIL PRATAMA
NIM : 13020220146
KELAS : A4 -TI
 */
import javax.swing.*;

public class No1JOpti {
    public static void main(String[] args) {

       // Input data mahasiswa oleh user
       String inputNim = JOptionPane.showInputDialog("Nim: ");
       String inputNama = JOptionPane.showInputDialog("Nama: ");
       String inputJurusan = JOptionPane.showInputDialog("Jurusan: ");
       String inputFakultas = JOptionPane.showInputDialog("Fakultas: ");

       // Output dari inputan oleh pengguna
       System.out.println("Data Mahasiswa");
       System.out.println("Nim      : " + inputNim);
       System.out.println("Nama     : " + inputNama);
       System.out.println("Jurusan  : " + inputJurusan);
       System.out.println("Fakultas : " + inputFakultas);
    }
}
