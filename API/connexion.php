<?php
function connexionPDO()
{
    $login = "serverapi";
    $password = "4092571258";
    $bd = "serverapi_visiteurs";
    $serveur = "mysql-serverapi.alwaysdata.net";

    try {
        $cnx = new PDO("mysql:host=$serveur;dbname=$bd", $login, $password);
        return $cnx;
    } catch (PDOException $e) {
        print "E1001: Connexion à la base echoué";
        die();
    }
}
// OK
?>