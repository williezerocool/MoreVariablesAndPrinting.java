/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morevariablesandprinting;

/**
 *
 * @author kendrabooker
 */
public class MoreVariablesAndPrinting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Name, Eyes, Teeth, Hair;
        int Age, Height, Weight;

        Name = "Will The Developer";
        Age = 31;     // not a lie
        Height = 1 + (12 * 6);  // inches
        Weight = 220; // lbs
        Eyes = "Brown";
        Teeth = "White";
        Hair = "Brown";

        System.out.println( "Let's talk about " + Name + "." );
        System.out.println( "He's " + Height +   " inches tall "  +  " or " + (73 * 2.54) + "cm. ");
        System.out.println( "He's " + Weight + " pounds heavy " + " or " + (220 / 2.2) + "kg");
        System.out.println( "Actually, that's not too heavy." );
        System.out.println( "He's got " + Eyes + " eyes and " + Hair + " hair." );
        System.out.println( "His teeth are usually " + Teeth + " depending on the coffee." );

        // This line is tricky; try to get it exactly right.
        System.out.println( "If I add " + Age + ", " + Height + ", and " + Weight
            + " I get " + (Age + Height + Weight) + "." );
    }
    
}
