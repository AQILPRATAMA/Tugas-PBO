/* NIM : 13020220146
Nama : Aqil Pratama
Hari/Tangga : Rabu 13/03/2024
Waktu Pengerjaan : 17:00 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.*;

public class BacaString {

    public static void main(String[] args) throws IOException {

        String str;
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nBaca string dan Integer: \n");
        System.out.print("masukkan sebuah string: ");
        str = datAIn.readLine();
        System.out.print("String yang dibaca : " + str);
    }
}