/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan5;
import java.io.*;
/**
 *
 * @author isalr
 */
public class BacaKeyboard {
        public static String bacaString() {
        int karakter;
        String str = "";
        Boolean selesai = false;
        
        while (!selesai){
            try {
                karakter = System.in.read();
                if (karakter < 0 || (char) karakter == '\n' )
                    selesai = true;
                else if ((char) karakter != '\r')
                    str = str + (char) karakter;
            }
            catch(java.io.IOException e){
                System.err.println("ada kesalahan");
                selesai = true ;
                        }
                      }
      return str;
    }
}
