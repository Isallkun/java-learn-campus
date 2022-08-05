/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan8;

/**
 *
 * @author isalr
 */
public class Return {
static int cube(int value) {
	return (int) Math.pow(value, 3);
    }

static int getVolume(int size) {
	return cube(size);
    }

 public static void main(String[] args) {

        int volume = getVolume(2);
        System.out.println(volume);
    }    
}
