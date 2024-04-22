/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilangka;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class TampilAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int  i,a,n;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Bilangan Awal : ");
        a = sc.nextInt();
        
        System.out.print("Masukan Bilangan Akhir: ");
        n = sc.nextInt();
        
        for(i=a;i<n;i++)
        {
        System.out.println(i);}
        
//        int  i=0;
//        int x, y;
//        Scanner sc = new Scanner(System.in);
//        System.out.print(" Masukan Bilangan awal :");
//        x = sc.nextInt();
//        
//        System.out.print(" Masukan Bilangan Akhir :");
//        y = sc.nextInt();
//        
//        while(x < y){
//        System.out.println(x);
//        x++;
//        // TODO code application logic here
//    }
    }
}
