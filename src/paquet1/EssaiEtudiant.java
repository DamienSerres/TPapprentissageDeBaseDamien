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
public class EssaiEtudiant {
    public static void main(String[] args) {
        Etudiant etudiant1 = new Etudiant();
        
        etudiant1.nom = "Serres";
        etudiant1.prenom = "Damien";
        etudiant1.numeroEtudiant = "123558875";
        etudiant1.age = "34";
        
        
        System.out.println("Utilisation 1ere méthode :");
        etudiant1.afficherInfosDansLaConsole();
        
        System.out.println("Utilisation 2eme méthode :");
        int resultat = etudiant1.afficherInfosDansLaConsole(25);
        System.out.println(resultat);
    }
}
