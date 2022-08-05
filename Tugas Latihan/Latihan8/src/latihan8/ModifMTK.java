/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan8;
import java.util.Scanner;
/**
 *
 * @author isalr
 */
public class ModifMTK {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    while(true){
    System.out.println("Menu Aplikasi Matematika : ");
    System.out.println("1. Pertambahan ");
    System.out.println("2. Pengurangan ");
    System.out.println("3. Perkalian   ");
    System.out.println("4. Pembagian   ");
    System.out.println("5. Keluar Aplikasi   ");
    System.out.print("Pilih Menu Anda : ");
    int menu = input.nextInt();
        switch (menu) {
            case 1:
            {
                System.out.print("Masukkan Angka Pertama : ");
                int prtma = input.nextInt();
                System.out.print("Masukkan Angka Kedua : ");
                int kedua = input.nextInt();
                System.out.println("Hasil Pertambahan antara " + prtma + " dan " + kedua + " adalah " + (prtma + kedua));
                continue;
            }       
            case 2:
                {
                    System.out.print("Masukkan Angka Pertama : ");
                    int prtma = input.nextInt();
                    System.out.print("Masukkan Angka Kedua : ");
                    int kedua = input.nextInt();
                    System.out.println("Hasil Pengurangan antara " + prtma + " dan " + kedua + " adalah " + (prtma - kedua));
                    continue;
                }
            case 3:
                {
                    System.out.print("Masukkan Angka Pertama : ");
                    int prtma = input.nextInt();
                    System.out.print("Masukkan Angka Kedua : ");
                    int kedua = input.nextInt();
                    System.out.println("Hasil Perkalian antara " + prtma + " dan " + kedua + " adalah " + (prtma * kedua));
                    continue;
                }
            case 4:
                {
                    System.out.print("Masukkan Angka Pertama : ");
                    int prtma = input.nextInt();
                    System.out.print("Masukkan Angka Kedua : ");
                    int kedua = input.nextInt();
                    System.out.println("Hasil Pembagian antara " + prtma + " dan " + kedua + " adalah " + (prtma / kedua));
                    continue;
                }
            case 5:
                System.out.println("Anda telah keluar dari program");
                return;
            default:
                System.out.println("Menu yang anda pilih tidak ada");
                break;
        }
    }
}
}