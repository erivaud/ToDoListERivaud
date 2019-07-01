package com.example.todolisterivaud;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.todolisterivaud.Model.ToDoList;

import java.util.ArrayList;

class MyListesAdapter extends ArrayAdapter<ToDoList> {

    private Context context;
    int resource;


    public MyListesAdapter(Context context, int resource, ArrayList<ToDoList> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        ArrayList<String> items = getItem(position).getElements();

        ToDoList toDoList = new ToDoList(name, items);

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource, parent, false);

        TextView listeName = (TextView) convertView.findViewById(R.id.listeName);
        listeName.setText(name);

        TextView listeItem1 = (TextView) convertView.findViewById(R.id.listeItem1);
        listeItem1.setText(toDoList.getElements().get(0));

        TextView listeItem2 = (TextView) convertView.findViewById(R.id.listeItem2);
        listeItem2.setText(toDoList.getElements().get(1));


       /* ListView listViewItems = convertView.findViewById(R.id.listViewItems);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, toDoList.getElements());
        listViewItems.setAdapter(arrayAdapter);*/

        return convertView;
    }

    /*public MyListesAdapter(Context context, int resource) {
        super(context, resource);
    }*/


    /*public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.getContext());
        View view = inflater.inflate(R.layout.activity_liste_details, null);

        ToDoList data = this.getItem(position);

        int i = 0;
        String[] elements = new String[data.getElements().size()];
        for (String element : data.getElements()) {
            elements[i]=element;
            i++;
        }
        //elements = data.getElements().toArray(elements);

        TextView listeName = view.findViewById(R.id.listeName);
        listeName.setText(data.getName());

        ListView listViewItems = view.findViewById(R.id.listViewItems);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this.getContext(), android.R.layout.simple_list_item_1, elements);
        //arrayAdapter2.add(elements[1]);
        //arrayAdapter2.add(elements[0]);
        listViewItems.setAdapter(arrayAdapter2);
        System.out.println("RRRRRRRRRRR name " + data.getName());
         System.out.println("RRRRRRRRRRR elements " + data.getElements().size());
        System.out.println("RRRRRRRRRRR elements tableau de String " + data.toString());
        return view;
    }
    //TODO : soit implémenter cette méthode, soit trouver une autre solution de parse
    public void addAll(ArrayList<String> todoListsNames) {
    }
    */




}
