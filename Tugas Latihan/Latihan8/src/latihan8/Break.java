/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan8;

/**
 *
 * @author isalr
 */
public class Break
{  
   public static void main (String args[])  
   {  
      boolean a=true;  
      m:  
      {  
         n:  
         {  
            o:  
            {  
               System.out.println("Before break");  
               if(a)  
               break n;  
               System.out.println("This will not execute");  
            }  
         }  
         System.out.println("After break");  
      }  
   }  
}  