<?php
include ("connexion.php");

$visiteurId = $_POST['id'];
$visiteurNom = $_POST['nom'];
$visiteurPrenom = $_POST['prenom'];
$visiteurLogin = $_POST['login'];
$visiteurMdp = $_POST['mdp'];
$visiteurAdresse = $_POST['adresse'];
$visiteurCp = $_POST['cp'];
$visiteurVille = $_POST['ville'];

try {
    $connexion = connexionPDO();
    $req = "UPDATE visiteurs SET nom = '$visiteurNom', prenom = '$visiteurPrenom', login = '$visiteurLogin', mdp = '$visiteurMdp', adresse = '$visiteurAdresse', cp = '$visiteurCp', ville = '$visiteurVille' WHERE id = '$visiteurId'";
    $stmt = $connexion->prepare($req);
    $stmt->execute();

    if ($stmt->rowCount() > 0) {
        print ("Modifié");
    } else {
        print "Not modifié";
    }
} catch (Exception $e) {
    print "Erreur: " . $e->getMessage();
    die();
}

// Ex de recherche :
// http://eren.alwaysdata.net/API/modifVisiteurByIdV.php?id=b23&nom=NewName&prenom=NewFirstName&login=NewLogin&mdp=NewPassword&adresse=NewAddress&cp=NewPostalCode&ville=NewCity
// OK
?>