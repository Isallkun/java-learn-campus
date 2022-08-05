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
public class TampilanMatematika {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Menu Aplikasi Matematika : ");
    System.out.println("1. Pertambahan ");
    System.out.println("2. Pengurangan ");
    System.out.println("3. Perkalian   ");
    System.out.println("4. Pembagian   ");
    System.out.print("Pilih Menu Anda : ");
    int menu = input.nextInt();
    if( menu == 1 ) {
        System.out.print("Masukkan Angka Pertama : ");
        int prtma = input.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int kedua = input.nextInt();
        System.out.print("Hasil Pertambahan antara " + prtma + " dan " + kedua + " adalah " + (prtma + kedua));
    }
    else if( menu == 2 ) {
            System.out.print("Masukkan Angka Pertama : ");
            int prtma = input.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
            int kedua = input.nextInt();
            System.out.print("Hasil Pengurangan antara " + prtma + " dan " + kedua + " adalah " + (prtma - kedua));
    }
    else if( menu == 3 ) {
            System.out.print("Masukkan Angka Pertama : ");
            int prtma = input.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
            int kedua = input.nextInt();
            System.out.print("Hasil Perkalian antara " + prtma + " dan " + kedua + " adalah " + (prtma * kedua));
    }
    else if( menu == 4 ) {
            System.out.print("Masukkan Angka Pertama : ");
            int prtma = input.nextInt();
            System.out.print("Masukkan Angka Kedua : ");
            int kedua = input.nextInt();
            System.out.print("Hasil Pembagian antara " + prtma + " dan " + kedua + " adalah " + (prtma / kedua));
    }
    }
}
