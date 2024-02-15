/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lotto;

import java.util.Random;
import java.util.Scanner;
import javax.print.DocFlavor;

public class Amoba {
    
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in, "windows-1250");
    
    public static void main(String[] args) {
        System.out.println("Az ekső jel (x/o): ");
        String elso = sc.nextLine();
        
        final int Meret = 3;
        String[] amoba = new String[Meret*Meret];
        amoba[0] = elso;
        
        for (int i = 0; i < Meret*Meret; i++) {
            amoba[i] = (Math.random()>.5 ? "x" : "o");
        }
        
        for (int i = 0; i < Meret*Meret; i++) {
            if(i != 0 && i % Meret == 0){
                System.out.println("");
            }
            System.out.println(amoba[i]);
        }
        System.out.println("");
    }
}
