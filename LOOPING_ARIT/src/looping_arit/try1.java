/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping_arit;

import java.util.Scanner;

/**
 *
 * @author rafig
 */
public class try1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a,b,c;
        
        System.out.print("Masukkan Suku pertama : ");
        a=sc.nextInt();
        System.out.print("Masukkan Kelipatan : ");
        b=sc.nextInt();
        System.out.print("Masukkan Jumlah Deret : ");
        c=sc.nextInt();
        
       
        
        for (int i = 1; i <=c; i++) {
            if (i%1==1){
                // ganjil = 1
                // genap = 0
                System.out.print(a+"\t");
            }else{
                System.out.print(a+"\t");
            }
            a+=b;
        }
        System.out.println("");
    }
}

    
    

