package com.example.todolisterivaud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.todolisterivaud.Model.ToDoList;

import java.util.ArrayList;

public class ShowLists extends AppCompatActivity {

    ListView listView;

    public ArrayList<String> getTitles(ToDoList[] toDoLists){
        ArrayList<String> titles = new ArrayList<>();
        for (ToDoList liste : toDoLists) {
            titles.add(liste.getName());
        }
        return titles;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lists);

        listView = (ListView) findViewById(R.id.listsList);

        Intent intent = getIntent();
        if (intent != null) {
            String intentUserName = intent.getStringExtra("userName");

            ToDoList toDoList0 = intent.getParcelableExtra("toDoListe0");
            ToDoList toDoList1 = intent.getParcelableExtra("toDoListe1");

            ToDoList[] toDoLists = new  ToDoList[]{toDoList0, toDoList1};


            ArrayList<String> titles = new ArrayList<>(getTitles(toDoLists));



            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titles);
            listView.setAdapter(arrayAdapter);


       /*Toast.makeText(this, "" + todoListsNameConcat, Toast.LENGTH_LONG).show(); */

            TextView userName = this.findViewById(R.id.showListUserName);
            userName.setText(toDoList0.getName()+ "\n"+toDoList1.getName() + "\n" + toDoLists.length);

        }
    }

}
