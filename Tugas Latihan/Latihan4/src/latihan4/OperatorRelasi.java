/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan4;

/**
 *
 * @author isalr
 */
public class OperatorRelasi {
public static void main(String[] args) {
//a few numbers
int i = 37;
int j = 42;
int k = 42;

System.out.println("Isi Dari Variabel... ");
System.out.println(" i = " + i);
System.out.println(" j = " + j);
System.out.println(" k = " + k);

//lebih besar dari
System.out.println(" lebih besar...");
System.out.println(" i > j = " + (i > j)); //salah
System.out.println(" j > i = " + (j > i)); //benar
System.out.println(" k > j = " + (k > j)); //salah

//lebih besar atau sama dengan
System.out.println("lebih besar sama dengan...");
System.out.println(" i >= j = " + (i >= j)); //salah
System.out.println(" j >= i = " + (j >= i)); //benar
System.out.println(" k >= j = " + (k >= j)); //benar

//lebih kecil dari
System.out.println("lebih kecil...");
System.out.println(" i < j = " + (i < j)); //benar
System.out.println(" j < i = " + (j < i)); //salah
System.out.println(" k < j = " + (k < j)); //salah

//lebih kecil atau sama dengan
System.out.println("lebih kecil sama dengan...");
System.out.println(" i <= j = " + (i <= j)); //benar
System.out.println(" j <= i = " + (j <= i)); //salah
System.out.println(" k <= j = " + (k <= j)); //benar

//sama dengan
System.out.println("sama dengan...");
System.out.println(" i == j = " + (i == j)); //salah
System.out.println(" k == j = " + (k == j)); //benar

//tidak sama dengan
System.out.println("tidak sama dengan...");
System.out.println(" i != j = " + (i != j)); //benar
System.out.println(" k != j = " + (k != j)); //salah

}
}
