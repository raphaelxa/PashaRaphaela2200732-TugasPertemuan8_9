/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritancepolymorphism;

import java.util.Scanner;

/**
 *
 * @author pasha
 */
public class testmain {
 
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi ke 1: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan sisi ke 2: ");
        double side2 = input.nextDouble();

        System.out.print("Masukkan sisi ke 3: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna: ");
        String color = input.next();

        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean filled = input.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getColor());
        System.out.println("Terisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());

        input.close();
    }
}


