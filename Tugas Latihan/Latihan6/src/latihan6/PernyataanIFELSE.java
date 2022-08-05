/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan6;
import java.util.Scanner;
/**
 *
 * @author isalr
 */
public class PernyataanIFELSE {
    public static void main(String[] args){
    
    System.out.println("Contoh pernyataan If else");
    System.out.println("  ");
    
    Scanner input = new Scanner(System.in);
        
    System.out.print("Masukkan nilai = ");
    int grade = input.nextInt();
        if( grade > 60 ) 
            System.out.println("Selamat anda lulus!");
        else
            System.out.println("maaf, anda tidak lulus!");
    }
}
