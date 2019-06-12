package com.example.todolisterivaud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShowLists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_lists);
        TextView userName = this.findViewById(R.id.showListUserName);
        Intent intent = getIntent();
        ArrayList<String> todoListsNames = intent.getStringArrayListExtra("listesNamesArrayList");
        String todoListsNameConcat="";
        for (String todoListsName: todoListsNames) {
            todoListsNameConcat+=todoListsName+", ";
        }
        Toast.makeText(this, "" + todoListsNameConcat, Toast.LENGTH_LONG).show();

        String intentUserName = intent.getStringExtra("userName");

        if (intentUserName != null){
            userName.setText(intentUserName);
        } else {
            userName.setText("empty UserName");
        }


    }

}
