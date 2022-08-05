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
public class Konversi {
    public static void main(String[] args) {
    System.out.println("Contoh konversi");
        Scanner input = new Scanner(System.in);
    System.out.print("Masukkan Nilai 1 : ");
        String nilai1 = input.nextLine();
    System.out.print("Masukkan Nilai 2 : ");
        String nilai2 = input.nextLine();
    int bilInt = Integer.valueOf(nilai1).intValue();
    double bilReal = Double.valueOf(nilai2).doubleValue();
            
    System.out.println("bilangan bulat : " + bilInt); 
    System.out.println("bilangan real  : " + bilReal);
    System.out.println("=================================");
    System.out.println("variabel bilInt + bilReal : " + (bilInt + bilReal));
    System.out.println("variabel nilai1 + nilai2 :  " + (nilai1 + nilai2));
    }   
}
