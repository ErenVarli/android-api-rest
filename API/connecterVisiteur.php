<?php
include ("connexion.php");

$visiteurLogin = $_POST['login'];
$visiteurMdp = $_POST['mdp'];

try {
    $connexion = connexionPDO();
    $req = "SELECT * FROM visiteurs WHERE login = '$visiteurLogin' AND mdp = '$visiteurMdp'";
    $stmt = $connexion->prepare($req);
    $stmt->execute();

    if ($stmt->rowCount() > 0) {
        $result = $stmt->fetchAll();
        print ("Executé");
        print_r(json_encode($result));
    } else {
        print "Non executé";
    }
} catch (Exception $e) {
    print "Erreur: " . $e->getMessage();
    die();
}

// Ex de recherche :
// http://eren.alwaysdata.net/API/connecterVisiteur.php?login=ErenV&mdp=ErenV13
// OK
?>
