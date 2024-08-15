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
public class UKLARIT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        
        System.out.print(" bil 1 : ");
        a = input.nextInt();
        System.out.print(" selisih : ");
        b = input.nextInt();
        System.out.print(" deret : ");
        c = input.nextInt();
        
        int u=a,s=a,d=a,f=a;
        
        for (int i = 0; i < c; i++) {
            System.out.print(u+"\t");
            u=u+b;
            s=s+u;
        }
        System.out.println("");
        System.out.println("===================================");
        
        for (int i = 0; i < c; i++) {
            if(d%2==1){
            System.out.print(d+"\t");}
            d=d+b;
            f=f+d;
        }
        System.out.println("");
        System.out.println("===================================");
        
        for (int i = 0; i < c; i++) {
            if(d%2==1){
            System.out.print(d+5+"\t");}
            d=d+b;
            f=f+d;
        }
        System.out.println("");
    }
}
