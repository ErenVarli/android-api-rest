package com.api_rest.gestionvisiteurs.controleur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.api_rest.gestionvisiteurs.R;
import com.api_rest.gestionvisiteurs.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_connexion = findViewById(R.id.i1_btn_connexion);

        btn_connexion.setOnClickListener(v->{
                    Intent i = new Intent( MainActivity.this , PropositionActivity.class);
                    startActivity(i);
                }
        );
    }
}