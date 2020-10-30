/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

/**
 *
 * @author gimli
 */
public class Etudiant {

    String nom;
    String prenom;
    String age;
    String numeroEtudiant;

    public void afficherInfosDansLaConsole() {
        System.out.println(nom + " " + prenom + " " + age + " " + numeroEtudiant);
    }

    public int afficherInfosDansLaConsole(int nombreARetourner) {
        System.out.println(nom + " " + prenom + " " + age + " " + numeroEtudiant);
        return nombreARetourner;
    }

    
    
    
    
    
    
    public static int addition(int i, int j) {
        return i + j;

    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Etudiant testEtudiant;
        testEtudiant = new Etudiant();
        testEtudiant.nom = "Françis";
        System.out.println(testEtudiant.nom);
    }
}
