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
public class UKLARIT2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          int a,b,c,d,e;
        
         System.out.print("bil 1 : ");
        a=input.nextInt();
        System.out.print("selisih : ");
        b=input.nextInt();
        System.out.print("deret : ");
        c=input.nextInt();

        int u=a;
        int s=a; 
        
        for (int i = c; i >= a ; i--) {
            System.out.print(i*b+"\t");
        }
              System.out.println(""); 
              System.out.println("===============================================");
              d= a+(7-1)*b;
              System.out.println("suku ke 7 adalah: "+d);
    }
}