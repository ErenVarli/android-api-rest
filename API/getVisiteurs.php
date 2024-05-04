<?php
include ("connexion.php");

try {
    $connexion = connexionPDO();
    $req = "SELECT * from visiteurs";
    $stmt = $connexion->prepare($req);
    $stmt->execute();

    while ($ligne = $stmt->fetch(PDO::FETCH_ASSOC)) {
        $res[] = $ligne;
    }
    print (json_encode($res));
} catch (Exception $e) {
    print "Erreur: " . $e->getMessage();
    die();
}
// OK
?>