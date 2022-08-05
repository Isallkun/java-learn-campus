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
public class PernyataanIFBersarang {
public static void main( String[] args ){
      
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nilai Anda = ");
        int grade = input.nextInt();
        
        if( grade >= 90 )
            System.out.println("Selamat anda mendapatkan Grade ' A ' " );
       
        else 
            if( grade >= 80)
                System.out.println("Selamat anda mendapatkan Grade ' B ' " );
            
            else 
                if( grade >= 70)
                    System.out.println("Selamat anda mendapatkan Grade ' C ' " );
            
                else
                    if( grade >= 50)
                        System.out.println("Maaf, anda mendapatkan Grade ' D ' " );
                    else
                         System.out.println("Maaf, anda mendapatkan Grade ' E ' " );
    }
}
