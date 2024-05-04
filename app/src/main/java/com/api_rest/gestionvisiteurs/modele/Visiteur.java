package com.api_rest.gestionvisiteurs.modele;

public class Visiteur {
    private String id;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;
    private String adresse;
    private String cp;
    private String ville;
    private String dateEmbauche;

    // Constructeur sans argument
    public Visiteur() {}

    // Constructeur complet
    public Visiteur(String id, String nom, String prenom, String login, String mdp, String adresse, String cp, String ville, String dateEmbauche) {
        this.id = id; this.nom = nom; this.prenom = prenom; this.login = login; this.mdp = mdp; this.adresse = adresse; this.cp = cp; this.ville = ville; this.dateEmbauche = dateEmbauche;
    }

    // Getters
    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getLogin() { return login; }
    public String getMdp() { return mdp; }
    public String getAdresse() { return adresse; }
    public String getCp() { return cp; }
    public String getVille() { return ville; }
    public String getDateEmbauche() { return dateEmbauche; }

    // Setters
    public Visiteur setId(String id) { this.id = id; return this; }
    public Visiteur setNom(String nom) { this.nom = nom; return this; }
    public Visiteur setPrenom(String prenom) { this.prenom = prenom; return this; }
    public Visiteur setLogin(String login) { this.login = login; return this; }
    public Visiteur setMdp(String mdp) { this.mdp = mdp; return this; }
    public Visiteur setAdresse(String adresse) { this.adresse = adresse; return this; }
    public Visiteur setCp(String cp) { this.cp = cp; return this; }
    public Visiteur setVille(String ville) { this.ville = ville; return this; }
    public Visiteur setDateEmbauche(String dateEmbauche) { this.dateEmbauche = dateEmbauche; return this; }

    // toString
    @Override
    public String toString() {
        return "Visiteur{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", login='" + login + '\'' +
                ", mdp='" + mdp + '\'' +
                ", adresse='" + adresse + '\'' +
                ", cp='" + cp + '\'' +
                ", ville='" + ville + '\'' +
                ", dateEmbauche='" + dateEmbauche + '\'' +
                '}';
    }
}