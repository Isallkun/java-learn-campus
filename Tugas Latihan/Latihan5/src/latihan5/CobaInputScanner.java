/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;
import java.util.Scanner;
/**
 *
 * @author isalr
 */
public class CobaInputScanner {
     public static void main(String[] args){
 
        System.out.println("Contoh Input dengan Scanner");
     
            Scanner input = new Scanner(System.in);
       
            System.out.print("Masukkan Nama : ");
            String nama = input.nextLine();
        
		System.out.println("Hallo," + nama);     
     }
}
