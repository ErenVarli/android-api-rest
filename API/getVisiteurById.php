<?php
include ("connexion.php");
$visiteurID = $_POST['id'];
try {
    $connexion = connexionPDO();
    $req = "SELECT * FROM visiteurs WHERE id = '$visiteurID'";
    $stmt = $connexion->prepare($req);
    $stmt->execute();

    $visiteur = $stmt->fetch(PDO::FETCH_ASSOC);

    if ($visiteur) {
        print (json_encode($visiteur));
    } else {
        print "Aucun visiteur trouvé avec l'ID '$visiteurID'.";
    }
} catch (Exception $e) {
    print "Erreur: " . $e->getMessage();
    die();
}

// Ex de recherche :
// http://eren.alwaysdata.net/API/getVisiteurById.php?id=b13
// OK
?>