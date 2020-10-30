/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author gimli
 */
public class Activites {

    //Un exemple pour montrer que l'on peut placer un objet Scanner en attribut
    //Mais rappelez vous, ça n'a pas de sens dans le modèle POO car ça ne définit
    //pas la Classe
    Scanner scAtt = new Scanner(System.in);

    /**
     * Ceci est la javadoc de la méthode activite1
     */
    public void activite1() {
        //Besoin d'un nombre aléatoire, cette Classe d'objet permet d'en créer
        Random rand = new Random();
        //Variable pour stocker le nombre aléatoire
        int nbreAleatoire;
        //Boucle for pour répéter 3 fois du code
        for (int i = 0; i < 3; i++) {
            //Le code à répéter
            //Création d'un nombre aléatoire entre 0 et 11 (exclu) et enregistrement
            nbreAleatoire = rand.nextInt(11);
            //Affichage dans la console du nombre enregistré
            System.out.println(nbreAleatoire);
        }
    }

    public void activite2() {
        //Besoin de récupérer des infos depuis le clavier
        Scanner sc = new Scanner(System.in);
        //Pour stocker une chaine de caractère
        String motClavier;
        //Pour enregistrer si la réponse correspond (true) ou pas (false)
        boolean reponse;

        //Affichage de la consigne
        System.out.println("Entrez le mot 'merci' à l'aide du clavier :");
        //Attente de l'écriture et enregistrement
        motClavier = sc.next();
        //Vérification de la réponse
        reponse = "merci".equalsIgnoreCase(motClavier);

        //Boucle tant que la réponse est false (donc motClavier n'est pas "merci")
        //Cela fonctionne car une boucle while continue tant que le test entre
        //parenthèses donne true. Ici si reponse vaut false, !reponse vaut true
        //et la boucle continue
        while (!reponse) {
            System.out.println("Ce n'est pas poli, réessayez :");
            motClavier = sc.next();
            reponse = "merci".equalsIgnoreCase(motClavier);
        }

        System.out.println("Merci à vous et bonne journée !");
    }

    public void activite3() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        //Pour stocker une réponse
        String bonOuPas;
        //Pour enregistrer le test de la réponse
        boolean testOuiNon;

        System.out.println("Choisissez un nombre entre 0 et 10 :");
        System.out.println("Avez-vous choisi ?");

        //Plusieurs choses en même temps : sc.next() est exécuté en premier et donne
        //une chaine de caractères, de laquelle on utilise la méthode equalsIgnoreCase
        //pour tester si l'utilisateur a écrit "oui", si ce n'est pas oui on recommence.
        //Cela permet d'avoir un temps de pause avant la suite du jeu.
        while (!sc.next().equalsIgnoreCase("oui")) {
        }

        do {
            System.out.println(rand.nextInt(11));
            System.out.println("Est-ce votre nombre ?");
            bonOuPas = sc.next();
            testOuiNon = bonOuPas.equalsIgnoreCase("oui");
        } while (!testOuiNon);
    }

    public void activite4() {
        //On prévoit un compteur qui commence à 1, pour le nombre de motif
        int compteur = 1;
        //On veut faire 5 lignes
        for (int i = 0; i < 5; i++) {
            //On veut répéter le motif "#" un nombre de fois égale à compteur
            for (int j = 0; j < compteur; j++) {
                //Noter que l'on ne saute pas de ligne ici pour controler la répétition
                //sur une seule ligne.
                System.out.print("#");
            }
            //Après la boucle interne on saute une ligne et on augmente le compteur pour l'étape suivante
            //de la 1ere boucle for.
            System.out.print("\n");
            compteur++;
        }
    }

    public void activite4bis() {
        //Autre façon, sans le compteur
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    public void activite5() {
        Scanner sc = new Scanner(System.in);
        int compteur = 1;
        int tailleDuPic = 0;
        int nbreEtapes = 0;
        //Le boolean nous permettra de savoir si on doit monter ou descendre
        boolean montee = true;

        System.out.println("Quelle taille pour la pyramide ?");
        tailleDuPic = sc.nextInt();
        //Le nombre d'étapes dépend de la taille du pic
        nbreEtapes = tailleDuPic * 2 - 1;

        for (int i = 0; i < nbreEtapes; i++) {
            for (int j = 0; j < compteur; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
            //On teste si on est arrivé au pic
            if (compteur == tailleDuPic) {
                montee = false;
            }
            //En fonction de l'état du boolean on augmente ou on diminue
            if (montee) {
                compteur++;
            } else {
                compteur--;
            }
        }
    }

    public void activite5bis() {
        //Même code, plus court car moins de variables mais plus difficile à lire
        Scanner sc = new Scanner(System.in);
        int compteur = 1;
        int maximumPic = -1;
        boolean montee = true;

        System.out.println("Choisissez la hauteur de la pyramide :");
        maximumPic = sc.nextInt();

        for (int i = 0; i < maximumPic * 2 - 1; i++) {
            for (int j = 0; j < compteur; j++) {
                System.out.print("#");
            }
            System.out.print("\n");
            if (maximumPic == compteur) {
                montee = false;
            }
            if (montee) {
                compteur++;
            } else {
                compteur--;
            }
        }
    }

    public void activite6String() {
        Scanner sc = new Scanner(System.in);
        int nombreClavier = -1;
        String nombreClavierString = "-1";

        System.out.println("Entrez un nombre entre 0 et 2147483647 au clavier :");
        //On enregistre le nombre en int
        nombreClavier = sc.nextInt();
        //On le convertit en String pour travailler sur les caractères
        nombreClavierString = "" + nombreClavier;
        //On fait l'affichage des caractères en se déplaçant avec i en même 
        //temps que les étapes défilent.
        for (int i = 0; i < nombreClavierString.length(); i++) {
            System.out.println(nombreClavierString.charAt(i));
        }
    }

    public void activite6Modulo() {
        //Travail en gardant le type int en faisant des maths, mais c'est un peu plus compliqué
        Scanner sc = new Scanner(System.in);
        int nombreClavier = -1;
        int nbrClavierDigits = 0;
        int nbrClavierCount = 0;

        System.out.println("Entrez un nombre entre 0 et 2147483647 au clavier :");
        nombreClavier = nbrClavierCount = sc.nextInt();

        while (nbrClavierCount != 0) {
            nbrClavierCount = nbrClavierCount / 10;
            ++nbrClavierDigits;
        }

        for (int i = 0; i < nbrClavierDigits; i++) {
            System.out.println(nombreClavier % 10);
            nombreClavier = nombreClavier / 10;
        }

    }

    public void activite7() {
        Scanner sc = new Scanner(System.in);
        int nombreClavier = -1;
        String nombreClavierString = "-1";
        int[] tab;

        System.out.println("Entrez un nombre entre 0 et 2147483647 au clavier :");
        nombreClavier = sc.nextInt();
        nombreClavierString = "" + nombreClavier;
        tab = new int[nombreClavierString.length()];

        for (int i = 0; i < nombreClavierString.length(); i++) {
            //On repasse en int les caractères avant de les enregistrer
            tab[i] = Integer.parseInt("" + nombreClavierString.charAt(i));
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }
        System.out.println("");
    }

    public int[] activite7modified() {  //Activité 8 a modifié void -> int[]
        Scanner sc = new Scanner(System.in);
        int nombreClavier = -1;
        String nombreClavierString = "-1";
        int[] tab;

        System.out.println("Entrez un nombre entre 0 et 2147483647 au clavier :");
        nombreClavier = sc.nextInt();
        nombreClavierString = "" + nombreClavier;
        tab = new int[nombreClavierString.length()];

        for (int i = 0; i < nombreClavierString.length(); i++) {
            tab[i] = Integer.parseInt("" + nombreClavierString.charAt(i));
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i]);
        }
        System.out.println("");

        return tab;                 //Activité 8 a ajouté "return tab;"
    }

    public int[] activite9(int[] tabParametre) {
        int temp;
        for (int i = 0; i < tabParametre.length - 1; i++) {
            for (int j = 0; j < tabParametre.length - 1; j++) {
                if (tabParametre[j] > tabParametre[j + 1]) {
                    temp = tabParametre[j];
                    tabParametre[j] = tabParametre[j + 1];
                    tabParametre[j + 1] = temp;
                }
            }
        }
        return tabParametre;
    }

    public int[] activite10(int[] tab, int nombreAjout) {
        int[] tabResult = new int[tab.length + 1];
        tabResult[0] = nombreAjout;
        for (int i = 0; i < tab.length; i++) {
            tabResult[i + 1] = tab[i];
        }
        return tabResult;
    }

    public int[] activite11Arnaud(int[] tab, int nombreAjout, int index) {
        int[] tabResult = new int[tab.length + 1];
        tabResult[index] = nombreAjout;
        for (int i = 0; i < tabResult.length; i++) {
            if (i < index) {
                tabResult[i] = tab[i];
            } else if (i > index) {
                tabResult[i] = tab[i - 1];
            }
        }
        return tabResult;
    }

    public int[] activite11Fab(int[] tab, int nombreAjout, int index) {
        int[] tabResult = new int[tab.length + 1];
        tabResult[index] = nombreAjout;
        for (int i = 0; i < tab.length; i++) {
            if (i < index) {
                tabResult[i] = tab[i];
            } else {
                tabResult[i + 1] = tab[i];
            }
        }
        return tabResult;
    }

    public ArrayList<String> activite12() {
        ArrayList<String> langages = new ArrayList();
        Scanner sc = new Scanner(System.in);
        String continuer;
        //String langage;

        do {
            System.out.println("Écrivez le nom d'un langage informatique :");
            //langage = sc.next();
            langages.add(sc.next()); //ou avec la variable langage

            System.out.println("Voulez-vous continuer ?  oui/non");
            continuer = sc.next();
        } while (continuer.equalsIgnoreCase("oui"));

        return langages;
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Activites acti = new Activites();
        //System.out.println(acti.activite12());

        //int[] tableauEntier = new int[]{23, 45, 8, 52, 1};
        //int[] tabResultat = acti.activite11Fab(tableauEntier, 65, 2);

        /*for (int i = 0; i < tabResultat.length; i++) {
            System.out.println(tabResultat[i]);
        }*/
    }
}
