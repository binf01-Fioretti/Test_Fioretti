/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_fioretti;

import java.util.Scanner;

/**
 *
 * @author Daniele
 */
public class Test_Fioretti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Digita un numero");
            String line = in.next();
            int intValue = 0;
            try{
            intValue = Integer.parseInt(line);
            }catch(NumberFormatException e){
                e.printStackTrace();
            }
            
            System.out.println("Valore : " + intValue);
        }
    }
    

