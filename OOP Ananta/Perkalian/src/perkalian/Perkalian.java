/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perkalian;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, a, b, c;
        Scanner sc = new Scanner(System.in);
        
        System.out.print(" Masukan Perkalian :");
        a = sc.nextInt();

        System.out.print(" Masukan Bilangan awal :");
        b = sc.nextInt();

        System.out.print(" Masukan Bilangan Akhir :");
        c = sc.nextInt();

        while (b <= c) {
            int x = a * b;
            System.out.println(a + "x" + b + "=" + x);

            b++;
        }
    }

}
