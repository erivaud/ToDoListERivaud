package com.example.todolisterivaud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.todolisterivaud.Model.ToDoList;

import java.util.ArrayList;

public class ShowLists extends AppCompatActivity {

     ListView listView;

 /*   public ArrayList<String> getTitles(ToDoList[] toDoLists){
        ArrayList<String> titles = new ArrayList<>();
        for (ToDoList liste : toDoLists) {
            titles.add(liste.getName());
        }
        return titles;
    } */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lists);

        listView = findViewById(R.id.listsList);

        Intent intent = getIntent();
        if (intent != null) {
            // Récupérer le nom d'utilisateur
            String intentUserName = intent.getStringExtra("userName");
            // Récupérer les titres des listes (la liste des listes)
            ArrayList<String> titles = intent.getStringArrayListExtra("titres");
            // Récupérer les todoListes
            ArrayList<ToDoList> recupToDoLists = new ArrayList<>();
            if (titles != null) {
                for (String titre : titles) {
                    ArrayList<String> elements = intent.getStringArrayListExtra(titre);
                    ToDoList tdl = new ToDoList(titre, elements);
                    recupToDoLists.add(tdl);
                }
            }
            System.out.println("BEEEEEEEEEEEE " + recupToDoLists.toString());



            TextView userName = this.findViewById(R.id.showListUserName);
            userName.setText("Bienvenue "+ intentUserName + " ! Restez organisé(e) !\n"
                    + "Ici vous pouvez consulter, modifier et supprimer vos ToDoLists :");

            /*myListesAdapter = new MyListesAdapter(toDoLists);
            recyclerView.setAdapter(myListesAdapter);*/


            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titles);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                       @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            Toast.makeText(getApplicationContext(), "Position : " +position, Toast.LENGTH_SHORT).show();
                        }
                    });

        }
    }

}
