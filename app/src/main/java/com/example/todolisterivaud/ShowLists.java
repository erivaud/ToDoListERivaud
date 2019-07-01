package com.example.todolisterivaud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.todolisterivaud.Model.Listes;
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

        listView = findViewById(R.id.listsList);

        Intent intent = getIntent();
        if (intent != null) {
            String intentUserName = intent.getStringExtra("userName");
            ArrayList<String> titles = intent.getStringArrayListExtra("titres");
            ArrayList<String> toDoLists = intent.getStringArrayListExtra("perso");
            //Toast.makeText(this, "" + titles.toString(), Toast.LENGTH_LONG).show();
            Toast.makeText(this, "" + toDoLists.toString(), Toast.LENGTH_LONG).show();

            Listes listes = new Listes();
            ArrayList<ToDoList> toDoListes = new ArrayList<>();
            if(titles !=null ) {
                for (String title : titles) {
                    ToDoList tdl = new ToDoList();
                    tdl.setName(title);
                    ArrayList<String> it = intent.getParcelableExtra(title);
                    if (it != null) {
                        tdl.setListItems(it);
                        toDoListes.add(tdl);
                    }
                    else {
                        ArrayList<String> st = new ArrayList<String>(){{
                            add("tout");
                            add("est");
                            add("vide");}};
                        toDoListes.add(new ToDoList(title, st));
                    }
                }
            }

            listes.setTodoListes(toDoListes);
            System.out.println("Mes listes items : " + listes.getTodoListes().toString());
           // Toast.makeText(this, "" + toDoListes.toString(), Toast.LENGTH_LONG).show();
           // ToDoList toDoList0 = intent.getParcelableExtra("toDoListe0");
           // ToDoList toDoList1 = intent.getParcelableExtra("toDoListe1");

            /*ListItem[] listItems0 = intent.getParcelableArrayListExtra("items0").toArray(new ListItem[0]);
            ListItem[] listItems1 = intent.getParcelableArrayListExtra("items1").toArray(new ListItem[0]);
             toDoList0.setListItems(listItems0);
            toDoList1.setListItems(listItems1);*/

           // ToDoList[] toDoLists = new  ToDoList[]{toDoList0, toDoList1};

           // ArrayList<String> titles = new ArrayList<>(getTitles(toDoLists));


          //  System.out.println("Mes listes items : " +listItems0.length);
            //Toast.makeText(this, "" + listItems0.length, Toast.LENGTH_LONG).show();

            TextView userName = this.findViewById(R.id.showListUserName);
            userName.setText("Bienvenue "+ intentUserName + " ! Restez organisé(e) !\n"
                    + "Ici vous pouvez consulter, modifier et supprimer vos ToDoLists :");

            /*myListesAdapter = new MyListesAdapter(toDoLists);
            recyclerView.setAdapter(myListesAdapter);*/


            /*ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, titles);
            listView.setAdapter(arrayAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                       @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            Toast.makeText(getApplicationContext(), "Position : " +position, Toast.LENGTH_SHORT).show();
                        }
                    });*/

        }
    }

}
