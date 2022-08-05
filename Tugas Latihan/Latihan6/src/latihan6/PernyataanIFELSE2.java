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
public class PernyataanIFELSE2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Total Belanja = ");
        int bayar = input.nextInt();
        
        int diskon = 0;
        if (bayar >= 100000 )
            diskon = bayar/10;
	else
	     diskon = 0;
        
        System.out.println("diskon = " +diskon);
    }    
}
