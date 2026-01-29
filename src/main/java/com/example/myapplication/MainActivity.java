package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.activity.EdgeToEdge;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView txtFact;
    Button btnNext;
    ArrayList<String> facts = new ArrayList<>();
    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtFact = findViewById(R.id.txtFact);
        btnNext = findViewById(R.id.btnNext);

        facts.add("The honeybee can recognize human faces.");
        facts.add("Bananas are berries, but strawberries are not.");
        facts.add("Octopuses have three hearts.");
        facts.add("Sharks existed before trees.");
        facts.add("Some cats are allergic to humans.");
        facts.add("There is a species of jellyfish that is immortal.");
        facts.add("A day on Venus is longer than a year on Venus.");
        facts.add("Sloths can hold their breath longer than dolphins.");
        facts.add("Wombat poop is cube-shaped.");
        facts.add("The Eiffel Tower can be 15 cm taller during summer.");

        Collections.shuffle(facts);

        txtFact.setText(facts.get(currentIndex));

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentIndex++;
                if (currentIndex < facts.size()) {
                    txtFact.setText(facts.get(currentIndex));
                } else {
                    btnNext.setEnabled(false);
                    btnNext.setText("No more Facts");
                }
            }
        });
    }
}
