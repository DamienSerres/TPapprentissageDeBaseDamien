//Le paquet
package paquet1;

//Les imports
import java.util.Scanner;

//L'ouverture de Classe
public class Chien {

    //Les attributs
    int age;
    String name;
    String breed;

    //Les méthodes
    ////Constructeur(s)
    public Chien(int age, String name, String breed) {
        this.age = age;
        this.name = name;
        this.breed = breed;
    }

    ////Méthode(s)
    public void aboyer(int nbreDeFois) {
        for (int i = 0; i < nbreDeFois; i++) {
            System.out.print("Woof");
            if (i != nbreDeFois - 1) {
                System.out.print(" ");
            } else {
                System.out.println("");
            }
        }
    }

    ////Méthode main
    public static void main(String[] args) {
        Chien monToutou = new Chien(9, "Gustave", "Boubou");
        System.out.println("Il a " + monToutou.age
                + " ans, s'appelle " + monToutou.name
                + " et c'est un " + monToutou.breed + ".");
        System.out.println("Dites lui quelque chose : ");
        Scanner sc = new Scanner(System.in);
        sc.next();
        monToutou.aboyer(3);
    }
}
