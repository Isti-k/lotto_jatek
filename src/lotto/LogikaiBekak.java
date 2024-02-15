/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lotto;

import java.util.Scanner;

public class LogikaiBekak {
    
    static Scanner sc = new Scanner(System.in, "windows-1250");
    
    public static void main(String[] args) {
        String beka = "🐸";
        String level = "__";
        String[] bekak = {beka, beka, beka, level};
        for (int i = 0; i < bekak.length; i++){
            System.out.printf("%2s ",bekak[i]);
        }
        System.out.println("");
        
        int[] szamok = {1, 2, 3, 4};
        for (int i = 0; i < szamok.length; i++){
            System.out.printf("%-2s ",szamok[i]);
        }
        System.out.println("");
        
        System.out.println("Melyikkel lépsz (1..4): ");
        int hely = sc.nextInt();
        
    }
}
