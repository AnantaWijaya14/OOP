/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author INSTIKI
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String b1, b2;
        int b3, krg;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Nama Anda : ");
        b1 = sc.nextLine();

        System.out.print("Masukan Alamat Anda : ");
        b2 = sc.nextLine();
        
        System.out.print("Masukan Tahun Lahir Anda : ");
        b3 = sc.nextInt();
        
        krg = 2024 - b3;
        
        System.out.println(""+ b1);
        System.out.println(""+ b2);
        System.out.println(""+ b3);
        System.out.println("Umur Anda Adalah : "+ krg);
        // TODO code application logic here
    }

}
