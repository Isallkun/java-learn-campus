/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan8;

/**
 *
 * @author isalr
 */
public class Continue {
    public static void main(String args[]){  
        int [] id = {999, 888, 777, 666, 555};  
        for(int x : id ) {  
        if( x == 777 )  
        {  
          continue;  
        }  
        System.out.print( x );  
        System.out.print("\n");  
     }  
  }  
}
