package fr.istic.master1.sir;

public class Personne 
{ 
    protected String nom; 
    protected String prenom; 
    protected int age; 

    /**
     * Objet personne
     * @param n le nom
     * @param p le prénom
     * @param a l'age
     */
    public Personne(String n, String p, int a) {
        this.nom = n; 
        this.prenom = p; 
        this.age = a; 
    } 

    
    /**
     * Fonction pour afficher la personne
     */
    public void afficher() {
        System.out.println("Nom : "+nom+" prenom : "+prenom+" age : "+age);
    } 

}