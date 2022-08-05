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
public class Motifjmlbarang {
    public static void main(String[] args){
        int total = 0;
        int pot = 0;
        
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan jumlah barang yang dibeli = ");
      int psn = input.nextInt();
            for (int x = 1; x <= psn; x++ ){
                    System.out.print("harga barang yang ke "+x+" = ");
                    int hrg = input.nextInt();
                    total = total+hrg;
            if ( total >= 500000) {
                pot = 50000;
            }
            else if ( total >= 300000) {
                pot = 15000; 
            }
            else if ( total >= 100000) {
                pot = 5000; 
            }
        }
    System.out.println("===============================");
    System.out.println("total belanja anda     = "+total);
    System.out.println("potongan harga sebesar = "+pot);
    System.out.println("-------------------------------");
    System.out.println("total yang harus bayar = "+(total - pot));
    System.out.println("-------------------------------");
    System.out.print  ("anda membayar sebesar  = ");
    int duid = input.nextInt();
    System.out.println("jumlah kembalian       = "+ (duid - (total - pot)));
    }
}