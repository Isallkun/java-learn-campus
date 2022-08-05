/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan8;

/**
 *
 * @author isalr
 */
public class Return2 {
 public static void main(String[] args)
   {
      yahoo(true);
      System.out.println("hallo");
   }
   public static void yahoo(boolean a)
   {
      System.out.println("1");
      if (a)
      {
         return;
      }
      System.out.println("2");
      System.out.println("3");
   }
}
