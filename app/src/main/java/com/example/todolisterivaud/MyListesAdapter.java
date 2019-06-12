package com.example.todolisterivaud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.todolisterivaud.Model.ToDoList;

import java.util.ArrayList;

class MyListesAdapter extends ArrayAdapter<ToDoList> {

    public MyListesAdapter(Context c) {
        super(c, 0);
    }



    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.getContext());
        View view = inflater.inflate(R.layout.activity_liste_details, null);

        ToDoList data = this.getItem(position);
        TextView listeName = view.findViewById(R.id.listeName);
//        ListView listeItems = view.findViewById(R.id.listeItems);
//
        listeName.setText(data.getName());
        return view;
    }
    //TODO : soit implémenter cette méthode, soit trouver une autre solution de parse
    public void addAll(ArrayList<String> todoListsNames) {
    }
}
