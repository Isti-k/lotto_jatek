/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lotto;

import java.util.Random;

public class LottoSzamok {
    
    static Random rnd = new Random();
    
    public static void main(String[] args) {
        final int DB = 90;
        boolean[] lotto = new boolean[DB+1];
        for (int i = 0; i < DB+1; i++) {
            lotto[i] = false;
        }
        
        int db = 0;
        while(db != 5){
            int v = (int)(Math.random()*6);
            if (!lotto[v]){
                lotto[v]=true;
                db++;
            }
        }
        
        System.out.print("A nyerő számok:\n");
        for (int i = 1; i < DB+1; i++){
            if(lotto[i])
                System.out.println(i + "");
        }
        System.out.print("");
    }
    
}
