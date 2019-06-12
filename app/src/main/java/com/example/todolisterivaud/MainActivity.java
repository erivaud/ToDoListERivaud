package com.example.todolisterivaud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.todolisterivaud.Model.Listes;

import java.io.IOException;
import java.net.HttpURLConnection;
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

    int responseStatusCode = 0;
    //WebserviceResult webserviceResult = null;

    public String getUserIDInput(){
        EditText inputUserIDET = (EditText) findViewById(R.id.userID);
        String userIDString = inputUserIDET.getText().toString();
        return userIDString;
    }

    public String getUserPasswordInput(){
        EditText inputUserPasswordET = (EditText) findViewById(R.id.userPassword);
        String userPasswordString = inputUserPasswordET.getText().toString();
        return userPasswordString;
    }

    public void goToListsView(){
        Intent intent = new Intent(this, ShowLists.class);
        startActivity(intent);
    }

    public void getUserAuth(){
        try
        {
            URL url = new URL(urlListsAcces);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            responseStatusCode = connection.getResponseCode();

            if (responseStatusCode == 200) {
                Toast.makeText(this, "code 200",Toast.LENGTH_LONG).show();
            }
           // new ListsDownloader(this)
            //        .execute(url);
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void connectUser (View view) {

        try {
            URL url = new URL(urlListsAcces);
            new ListsDownloader(this).execute(url);
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }


        /**String userIDString = getUserIDInput();
        String userPasswordString = getUserPasswordInput();
        try {
            URL url = new URL(urlListsAcces);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            responseStatusCode = connection.getResponseCode();
        }
        catch (MalformedURLException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // TODO : ici il faudra mettre la réponse récupérée du serveur et la transmettre à la prochaine view
        Listes listes = new Listes("romy","p");

        if (userIDString.equals(listes.getUtilisateur()) && userPasswordString.equals(listes.getPassword())){
            goToListsView();
            Toast.makeText(this, "connection ok " + responseStatusCode + listes.getUtilisateur(), Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "connection pas ok", Toast.LENGTH_LONG).show();
        }*/
    }



    public void createUser (View view) {
        // http://92.222.69.104/todo/create/{userID}/{userPassword}

       /** String userIDString = getUserIDInput();
        String userPasswordString = getUserPasswordInput();
        try {
            URL url = new URL(urlCreateUser + userIDString + "/" + userPasswordString);
             new ListsDownloader(new ShowLists())
                    .executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }*/
    }

    public void startActivityShowList(Listes listes) {

        Intent i = new Intent(this,ShowLists.class);
        startActivity(i);
        Toast.makeText(this,""+listes.getTodoListes().length,Toast.LENGTH_LONG).show();
        //TextView userName = this.findViewById(R.id.showListUserName);
        //userName.setVisibility(View.VISIBLE);
        //userName.setText(listes.getUtilisateur());
    }
}
