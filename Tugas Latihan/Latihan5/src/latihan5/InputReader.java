/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
/**
 *
 * @author isalr
 */
public class InputReader {
        public static void main(String[] args) throws Exception {
        InputStreamReader inputreader = new InputStreamReader(System.in);

        BufferedReader inReader = new BufferedReader(inputreader);

        System.out.println("Contoh Input dengan Stream Reader ");
     
                 
        System.out.print("Masukkan Nama : ");
            String nama = inReader.readLine();
        
        System.out.println("Hallo," + nama);   
    }
}
