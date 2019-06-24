package com.example.todolisterivaud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.todolisterivaud.Model.Listes;
import com.example.todolisterivaud.Model.ToDoList;

import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private static final String urlCreateUser = "http://92.222.69.104/todo/create/";
    private static final String urlListsAcces = "http://92.222.69.104/todo/listes";

    public String getUserIDInput(){
        EditText inputUserIDET = findViewById(R.id.userID);
        String userIDString = inputUserIDET.getText().toString();
        return userIDString;
    }

    public String getUserPasswordInput(){
        EditText inputUserPasswordET = findViewById(R.id.userPassword);
        String userPasswordString = inputUserPasswordET.getText().toString();
        return userPasswordString;
    }

    public void connectUser (View view) {
        try {
            URL url = new URL(urlListsAcces);
            new ListsDownloader(this).execute(url);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public void createUser (View view) {
        try {
            URL url = new URL(urlCreateUser + getUserIDInput() + "/" + getUserPasswordInput());
            new ListsDownloader(this).execute(url);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void goToListsView(Listes listes){

        ToDoList[] toDoLists = listes.getTodoListes();

        Intent intent = new Intent(this, ShowLists.class);
        intent.putExtra("userName", listes.getUtilisateur());

       // intent.putParcelableArrayListExtra("listes", toDoLists);
        // ArrayList<String> toDoListesNames = new ArrayList<>();
        // ArrayList<String> toDoListesItems = new ArrayList<>();

        int i = 0;
        for (ToDoList toDoList : toDoLists) {
           intent.putExtra("toDoListe" + i , toDoList);
           i++;

        }

       // Toast.makeText(this,""+i,Toast.LENGTH_LONG).show();

        startActivity(intent);

    }

}
