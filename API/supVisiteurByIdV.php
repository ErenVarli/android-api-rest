<?php
include ("connexion.php");
$visiteurID = $_POST['id'];
try {
    $connexion = connexionPDO();
    $req = "DELETE FROM visiteurs WHERE id = '$visiteurID'";
    $stmt = $connexion->prepare($req);
    $stmt->execute();

    if ($stmt) {
        print ("Supprimé");
    } else {
        print "Non executé";
    }
} catch (Exception $e) {
    print "Erreur: " . $e->getMessage();
    die();
}

// Ex de recherche :
// http://eren.alwaysdata.net/API/supVisiteurByIdV.php?id=b13
// OK
?>