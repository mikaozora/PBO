/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class luaspermukaan {
    public static void main(String[] args) {
        Scanner mika = new Scanner(System.in);
        
        System.out.print("Masukkan nilai jari-jari : ");
        int x = mika.nextInt();
        System.out.print("Masukkan nilai panjang : ");
        int y = mika.nextInt();
        System.out.print("Masukkan nilai lebar : ");
        int z = mika.nextInt();
        System.out.print("Masukkan nilai tinggi : ");
        int a = mika.nextInt();
        Bola(x);
        Balok(y,z,a);
    }
    public static void Bola(int a){
        System.out.println("=====LUAS PERMUKAAN BOLA=====");
        System.out.println("Rumus = 4 * phi * r * r");
        double phi = 3.14;
        double rumus = 4*phi*a*a;
        System.out.println("Luas permukaan bola : "+rumus);
    }
    public static void Balok(int a,int b,int c){
        System.out.println("=====LUAS PERMUKAAN BALOK======");
        System.out.println("Rumus = (2*p*l)+(2*p*t)+(2*l*t)");
        System.out.println("Luas permukaan balok : "+((2*a*b)+(2*b*c)+(2*a*c)));
    }
    
}
