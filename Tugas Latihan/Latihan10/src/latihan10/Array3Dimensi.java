/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan10;

/**
 *
 * @author isalr
 */
public class Array3Dimensi {
    public static void main(String[] args){
        int lapisan = 2;
        int baris = 3;
        int kolom = 4;
        
        int[][][] pixsel = new int[lapisan][baris][kolom];
        
        System.out.println(pixsel.length+" "+pixsel[0].length+" "+pixsel[0][0].length);
        
        for(int l = 0; l < pixsel.length; l++){
             int angka = 1;
             System.out.println("lapisan ke "+l);
            for(int b = 0; b < pixsel[0].length; b++){
                for(int k = 0; k < pixsel[0][0].length; k++){
                       pixsel[l][b][k] = angka++ ;
		System.out.print("nilai[" +l+ "][" +b+ "][" +k+ "] = " + pixsel[l][b][k]+"\t");
                }
                System.out.println("");
            }
             System.out.println("");
        }
    }
}
