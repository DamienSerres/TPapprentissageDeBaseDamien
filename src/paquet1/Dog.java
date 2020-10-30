/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquet1;

/**
 *
 * @author Damien
 */
public class Dog {

    String name;
    int age;
    String breed;
    char sex;   //'M' male or 'F' female

    /**
     *
     * @param name Le nom du chien
     * @param age L'age du chien
     * @param breed La race du chien
     * @param sex Le sexe du chien
     */
    public Dog(String name, int age, String breed, char sex) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.sex = sex;
    }

    public void bark() {
        System.out.println("Woof !");
    }

    public void bark(int nbrFois) {
        for (int i = 0; i < nbrFois; i++) {
            System.out.println("Woof !");
        }
    }

    public void afficher() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.breed);
        System.out.println("" + this.sex);
    }

    public static void main(String[] args) {
        Dog chien;
        //chien = new Dog();   
        //Dog() est le constructeur par défaut
        chien = new Dog("Medor", 12, "Colley", 'M');
        //chien.bark();
        //chien.afficher();
        chien.bark(4);
    }
}
