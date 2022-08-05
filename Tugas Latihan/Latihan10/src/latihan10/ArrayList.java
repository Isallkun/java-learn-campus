/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan10;
import java.util.Scanner;
import java.util.ArrayList;
        
/**
 *
 * @author isalr
 */
public class ArrayList {
    public static void main(String[] args){
//  Buat Objek dari ArrayList
        ArrayList arr = new ArrayList();
         
        //  Input jumlah Data yang di inginkan oleh User
        System.out.print("Input jumlah Data : ");   
        int jlh_data = new Scanner(System.in).nextInt();
         
        //  Input Data dan masukkan ke dalam objek ArrayList yang telah Anda buat
        for(int a = 0; a < jlh_data; a++)
        {
            System.out.print("Masukkan Data ke-"+(a+1)+": ");
            arr.add(new Scanner(System.in).nextLine());
        }
         
        //  Tampilkan nilai yang di simpan di dalam ArrayList
        System.out.println("\nTampilkan Data yang di input");
        for(Object o : arr)
        {
            System.out.print("|"+o+"|");
        }
         
     //  menampilkan nilai yang di simpan di dalam ArrayList
        System.out.println("\nTampilkan kembali Data yang ada di dalam ArrayList");
        for(Object o : arr)
            System.out.println("index ke-"+arr.indexOf(o)+" berisi nilai "+o);
}
}