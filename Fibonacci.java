/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;

/**
 * @author praktikum
 */

public class Fibonacci {
 
   
    public static void main(String args[]) {
        int [] num = new int [50];
        num[0] = 1;
        num[1] = 1;
        int urut;
        int sum = 0;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan angka : ");
        String data = input.nextLine();
        
        urut = Integer.parseInt(data);
        
        for (int i=0; i<urut; i++){
            System.out.println(num[i]+" ");
            num[i+2] = num[i] + num[i+1];
            sum += num[i];
        }
        
    }
}
