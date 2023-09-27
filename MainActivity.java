package com.example.easyblood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    CardView cardDoante;
    CardView cardSearchDonor;
    CardView cardDonationField;
    CardView cardDonationCertificate;
    CardView cardProfile;
    CardView cardLogout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();

        cardDoante = findViewById(R.id.card_donate);
        cardSearchDonor = findViewById(R.id.card_search_donor);
        cardDonationField = findViewById(R.id.card_donation_field);
        cardDonationCertificate = findViewById(R.id.card_donation_certificate);
        cardProfile = findViewById(R.id.card_profile);
        cardLogout = findViewById(R.id.card_logout);


        cardLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(MainActivity.this, "Logged out successfully", Toast.LENGTH_SHORT).show();
            }
        });


    }


}