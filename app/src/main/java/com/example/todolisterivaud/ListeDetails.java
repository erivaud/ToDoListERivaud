package com.example.todolisterivaud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.todolisterivaud.Model.ToDoList;

public class ListeDetails extends AppCompatActivity {

    TextView listeName;
    TextView listeItem1;
    TextView listeItem2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_details);

        listeName = findViewById(R.id.listeName);
        listeItem1 = findViewById(R.id.listeItem1);
        listeItem2 = findViewById(R.id.listeItem2);

        Intent intent = getIntent();
        if (intent != null){

            ToDoList recupToDoLists = (ToDoList) intent.getSerializableExtra("todoListSelected");

            listeName.setText(recupToDoLists.getName());
            listeItem1.setText(recupToDoLists.getElements().get(0));
            listeItem2.setText(recupToDoLists.getElements().get(1));
        }

    }
}
