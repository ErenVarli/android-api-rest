package com.api_rest.gestionvisiteurs.controleur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.api_rest.gestionvisiteurs.R;

public class PropositionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proposition);

        Button btn_ajouter = findViewById(R.id.i2_btn_ajouter);

        btn_ajouter.setOnClickListener(v->{
                    Intent i = new Intent(PropositionActivity.this , AjoutActivity.class);
                    startActivity(i);
                }
        );
    }
}