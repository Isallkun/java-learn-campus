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
public class InputPerkenalan {
    public static void main(String[] args){
    System.out.println("Contoh Input Perkenalan");
    Scanner input = new Scanner(System.in);
 
    System.out.print("Nama: ");
    String nama = input.nextLine();
    
    System.out.print("NIM: ");
    String nim = input.nextLine();  
     
    System.out.print("Jurusan: ");
    String jurusan = input.nextLine();
    
    System.out.print("Kelas: ");
    String kelas = input.nextLine();
    
    System.out.print("Semester: ");
    String smstr = input.nextLine();
    
    System.out.println("Hallo...ini adalah perkenalan pertama saya");
    System.out.println("=====================================");
    System.out.println("Nama             : " + nama );
    System.out.println("NIM              : " + nim );
    System.out.println("Jurusan          : " + jurusan );
    System.out.println("Semester & Kelas : " + smstr + kelas);
    System.out.println("=====================================");
    }
}
