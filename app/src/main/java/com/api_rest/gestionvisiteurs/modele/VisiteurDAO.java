package com.api_rest.gestionvisiteurs.modele;
import java.util.concurrent.ExecutionException;
import com.api_rest.gestionvisiteurs.modele.HttpPostRequest;
import com.api_rest.gestionvisiteurs.modele.Visiteur;
import android.util.Log;

public class VisiteurDAO {

    public VisiteurDAO() {
    }

    public String addVisiteur(Visiteur unVisiteur) {
        String result = "";
        // adresse de l'URL de l'API à interroger et fichier php permettant d'ajouter le visiteur
        String myUrl = "https://serverapi.alwaysdata.net/API/addVisiteur.php";
        // informations à transmettre pour effectuer l'ajout
        String params ="id="+ unVisiteur.getId() +
                "&nom=" +unVisiteur.getNom() +
                "&prenom=" +unVisiteur.getPrenom() +
                "&login=" + unVisiteur.getLogin() +
                "&mdp=" + unVisiteur.getMdp() +
                "&adresse=" + unVisiteur.getAdresse() +
                "&cp=" + unVisiteur.getCp() +
                "&ville=" + unVisiteur.getVille() +
                "&dateEmbauche=" + unVisiteur.getDateEmbauche();
        Log.d("test","parametres retournés --> "+params);

        HttpPostRequest postRequest = new HttpPostRequest();
        try{
            result = postRequest.execute(new String []{myUrl, params}).get();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Log.d("TAG", "resultat "+ result);
        return result;
    }

}