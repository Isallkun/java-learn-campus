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
public class InputLuasSegitiga {
     public static void main(String[] args){
     System.out.println("Contoh Input Luas Segitiga");
     Scanner input = new Scanner(System.in);
 
     System.out.print("Masukkan nilai alas: ");
     double alas = input.nextDouble();
     
     System.out.print("Masukkan nilai tinggi: ");
     double tinggi = input.nextDouble();  
     
     System.out.print("Luas segitiga: " + (alas * tinggi)/2);
  }
}
