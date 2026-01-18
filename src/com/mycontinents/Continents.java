/*
 Java program to print out a continent and the largest cities there.
*/

package com.mycontinents;

/**
 *  Continents class.
 */
public class Continents {

    // main method to run java program.
    public static void main(String[] args){

        // Variable to print statement below.
        int continent = 3;

        // Switch expression with continents, cities, and countries.
        switch (continent) {
            case 1:
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 2:
                System.out.println("South America: Sau Paulo, Brazil");
                break;
            case 3:
                System.out.println("Europe: Berlin, Germany");
                break;
            case 4:
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 5:
                System.out.println("Asia: Shanghai, China");
                break;
            case 6:
                System.out.println("Australia: Sydney, Australia");
                break;
            case 7:
                System.out.println("Antarctica: McMurdo Station, US");
                break;
            default:
                System.out.println("Undefined continent!");
                break;
        }
    }
}