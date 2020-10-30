/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gimli
 */
public class MyClass {

    int nbreDeStagiaires;
    String nomDelegue;

    private void methodeExempleDePortee() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        

        //System.out.println("1. Facile\n2. Intermédiaire\n3. Difficile");
        System.out.println("1. Facile");
        System.out.println("2. Intermédiaire");
        System.out.println("3. Difficile");
        System.out.println("Choisissez 1,2 ou 3 :");

        int difficulty = sc.nextInt();
        int bound = 0;

        if (difficulty == 1) {
            bound = 10;
        } else if (difficulty == 2) {
            bound = 100;
        } else {
            bound = 1000;
        }

        int mysteryNumber = rand.nextInt(bound);

        System.out.println("Essayez de deviner le nombre entier entre 0 et " + (bound - 1) + " :");
        int userNumber = sc.nextInt();

        while (userNumber != mysteryNumber) {
            if (mysteryNumber > userNumber) {
                System.out.println("Le nombre mystère est plus grand, réessayez :");
            } else {
                System.out.println("Le nombre mystère est plus petit, réessayez :");
            }
            userNumber = sc.nextInt();
        }
        System.out.println("Félicitations !");
    }
}
