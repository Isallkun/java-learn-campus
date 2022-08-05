/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan7;
import java.util.Scanner;
/**
 *
 * @author isalr
 */
public class PerulanganWhile {
    public static void main(String[] args){
        boolean ulang = true;
        int hitung = 0;
        String jawab;
        
        Scanner input = new Scanner(System.in);
        
        while( ulang ) {
            System.out.println("Apakah anda ingin keluar?");
            System.out.print("Jawab [Y/N] > ");
            
        jawab = input.nextLine();
        
        if( jawab.equalsIgnoreCase("Y") ){
            ulang = false;
        }
        
        hitung++;
    }
        System.out.println("Anda sudah melakukan perulangan sebanyak " + hitung + " kali");
    }
}
