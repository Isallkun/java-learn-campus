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
public class PerulanganDoWhile {
    public static void main(String[] args){
    int total = 0; 
    Scanner input = new Scanner(System.in);
    System.out.print ("Masukan jumlah barang belanja : ");
    
    int jml = input.nextInt();
    int x = 1;
do {
    System.out.print("harga barang ke "+x+" = ");
    
    int hrg = input.nextInt();
    total = total+hrg;
    
    x++;
}
while (x <=jml);
    System.out.println("===========================");
    System.out.println("total belanja anda = "+total);
}
}
