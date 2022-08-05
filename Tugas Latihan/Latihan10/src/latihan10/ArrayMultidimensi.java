/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan10;

/**
 *
 * @author isalr
 */
public class ArrayMultidimensi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] piksel = new int[5][3];
        piksel[0][1] = 65;
        piksel[1][1] = 40;
        piksel[2][2] = 45;
        piksel[3][2] = 90;
        piksel[3][0] = 46;
        piksel[4][2] = 52;
        
        int i, j;
        for (i=0;i<5;i++){
            for (j=0;j<3;j++)
                System.out.print(piksel[i][j]+" ");
             System.out.println(" ");
    }
    }
}
