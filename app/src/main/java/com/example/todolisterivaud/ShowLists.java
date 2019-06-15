package com.example.todolisterivaud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.todolisterivaud.Model.ToDoList;

public class ShowLists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lists);

        Intent intent = getIntent();
        if (intent != null) {
            String intentUserName = intent.getStringExtra("userName");

            ToDoList toDoList0 = intent.getParcelableExtra("toDoListe0");
            ToDoList toDoList1 = intent.getParcelableExtra("toDoListe1");


       /*Toast.makeText(this, "" + todoListsNameConcat, Toast.LENGTH_LONG).show(); */

            TextView userName = this.findViewById(R.id.showListUserName);
            userName.setText(toDoList0.getName());

          /*  if (intentUserName != null) {
                userName.setText(intentUserName);
            } else {
                userName.setText("empty UserName");
            } */
       /* if (todoListsNames !=null){
            TextView listesVides = this.findViewById(R.id.listesVides);
            listesVides.setVisibility(View.VISIBLE);
            listesVides.setText(todoListsNameConcat);
            ListView listLists = this.findViewById(R.id.listsList);
            MyListesAdapter myListesAdapter = new MyListesAdapter(this.getApplicationContext());
            //myListesAdapter.addAll(todoListsNames);
            //listLists.setAdapter(myListesAdapter);
        } else {
            TextView listesVides = this.findViewById(R.id.listesVides);
            listesVides.setVisibility(View.VISIBLE);
            listesVides.setText("Listes Vides");
        }*/
        }
    }

}
