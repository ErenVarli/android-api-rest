<?php
include("connexion.php");

// Vérifiez que tous les paramètres requis sont présents, y compris 'id'
if (isset($_GET['id']) && isset($_GET['nom']) && isset($_GET['prenom']) && isset($_GET['login']) && isset($_GET['mdp']) && isset($_GET['adresse']) && isset($_GET['cp']) && isset($_GET['ville']) && isset($_GET['dateEmbauche'])) {
    $visiteurId      = $_GET['id'];
    $visiteurNom     = $_GET['nom'];
    $visiteurPrenom  = $_GET['prenom'];
    $visiteurLogin   = $_GET['login'];
    $visiteurMdp     = $_GET['mdp'];
    $visiteurAdresse = $_GET['adresse'];
    $visiteurCp      = $_GET['cp'];
    $visiteurVille   = $_GET['ville'];
    $visiteurDateEmbauche   = $_GET['dateEmbauche'];

    try {
        $connexion = connexionPDO();
        $req = "INSERT INTO visiteurs (id, nom, prenom, login, mdp, adresse, cp, ville, dateEmbauche) VALUES (:id, :nom, :prenom, :login, :mdp, :adresse, :cp, :ville, :dateEmbauche)";
        $stmt = $connexion->prepare($req);
        
        // Paramétrez les valeurs pour la requête préparée, y compris l'ID
        $stmt->bindParam(':id', $visiteurId);
        $stmt->bindParam(':nom', $visiteurNom);
        $stmt->bindParam(':prenom', $visiteurPrenom);
        $stmt->bindParam(':login', $visiteurLogin);
        $stmt->bindParam(':mdp', $visiteurMdp);
        $stmt->bindParam(':adresse', $visiteurAdresse);
        $stmt->bindParam(':cp', $visiteurCp);
        $stmt->bindParam(':ville', $visiteurVille);
        $stmt->bindParam(':dateEmbauche', $visiteurDateEmbauche);

        // Exécution de la requête
        if ($stmt->execute()) {
            print("1");
        } else {
            print "Non exécuté";
        }
    } catch (PDOException $e) {
        print "Erreur: " . $e->getMessage();
        die();
    }
} else {
    print "Les paramètres nécessaires ne sont pas définis.";
}