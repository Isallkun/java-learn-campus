/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan7;
import java.util.Scanner;
/**
 *
 * @author isalr
 */
public class PerulanganFor {
        public static void main(String[] args){
        int total = 0; 
       
      Scanner input = new Scanner(System.in);
      System.out.print("Masukan jumlah barang: ");
      int psn = input.nextInt();
            for (int x = 1; x <= psn; x++ ){
                    System.out.print("harga barang ke "+x+" = ");
                    int hrg = input.nextInt();
                    total = total+hrg;
            }
        System.out.println("---------------------------");
        System.out.println("total belanja anda = "+total);
        }
}
