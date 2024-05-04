package com.api_rest.gestionvisiteurs.controleur;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.api_rest.gestionvisiteurs.modele.Visiteur;
import com.api_rest.gestionvisiteurs.modele.VisiteurDAO;
import com.api_rest.gestionvisiteurs.R;
import java.util.ArrayList;
import java.util.Iterator;
import com.api_rest.gestionvisiteurs.*;

public class AjoutActivity extends AppCompatActivity {
    private Visiteur nouveauVisiteur;
    private VisiteurDAO visiteurAcces;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);
        // Récuperation des valeurs saisies

        Button btnEnregistrer = findViewById(R.id.btnValiderModif);
        btnEnregistrer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ajouter();
            }
        });

    }

    public void ajouter() {
        EditText editTextId = findViewById(R.id.editTextId);
        EditText editTextNom = findViewById(R.id.editTextNom);
        EditText editTextPrenom = findViewById(R.id.editTextPrenom);
        EditText editTextLogin = findViewById(R.id.editTextLogin);
        EditText editTextMdp = findViewById(R.id.editTextMdp);
        EditText editTextAdrRue = findViewById(R.id.editTextAdrRue);
        EditText editTextCp = findViewById(R.id.editTextAdrCp);
        EditText editTextVille = findViewById(R.id.editTextAdrVille);
        EditText editTextDateEmbauche = findViewById(R.id.editTextDateEmbauche);

        String visId = editTextId.getText().toString();
        String visNom = editTextNom.getText().toString();
        String visPrenom = editTextPrenom.getText().toString();
        String visLogin = editTextLogin.getText().toString();
        String visMdp = editTextMdp.getText().toString();
        String visAdrRue = editTextAdrRue.getText().toString();
        String visCp = editTextCp.getText().toString();
        String visVille = editTextVille.getText().toString();
        String visDateEmbauche = editTextDateEmbauche.getText().toString();

        if (visId.isEmpty() || visNom.isEmpty() || visPrenom.isEmpty() || visLogin.isEmpty() || visMdp.isEmpty() || visAdrRue.isEmpty() || visCp.isEmpty() || visVille.isEmpty() || visDateEmbauche.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Veuillez ajouter tout les champs ", Toast.LENGTH_SHORT).show();
        } else {
            visiteurAcces = new VisiteurDAO();
            nouveauVisiteur = new Visiteur(visId, visNom, visPrenom, visLogin, visMdp, visAdrRue, visCp, visVille, visDateEmbauche);
            Log.d("test", "Contenu de l'objet --> "+nouveauVisiteur);


            String result = visiteurAcces.addVisiteur(nouveauVisiteur);
            Log.d("test","Contenu de result --> "+ result);
            if (nouveauVisiteur.equals("1")){
                Context c = getApplicationContext();
                Toast msg = Toast.makeText(c, "Client ajouté :) ", Toast.LENGTH_LONG);
                msg.show();
                Intent i = new Intent(AjoutActivity.this, PropositionActivity.class);
                startActivity(i);
            }else{
                Context c = getApplicationContext();
                Toast msg = Toast.makeText(c, "Client non ajouté :( ", Toast.LENGTH_LONG);
                msg.show();
            }
        }
    }
}