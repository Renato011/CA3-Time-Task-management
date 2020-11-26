/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dividingnumbers;

import java.util.Scanner;

/**
 *
 * @author renat
 */
public class DividingNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numbers = new Scanner(System.in);
        System.out.println("I will read two numbers and divide the fist by the second.");
        
        System.out.println("Tell me the divided number: ");
        try{
            float n1 = numbers.nextFloat();

            System.out.println("Tell me the divisor number: ");
            float n2 = numbers.nextFloat();

            double n3 = n1 / n2;

            if (n2 == 0){
                System.out.println(" ERROR!! You have put the number 0 as divisor, put just number abouve 0.");
            }

            else{
                System.out.printf("The quotient is %.2f. \n", n3 );
            }
        }
        catch(Exception e){
            System.out.println("ERROR!\nPlease inset a number.");
            
        }
    }
    
}
