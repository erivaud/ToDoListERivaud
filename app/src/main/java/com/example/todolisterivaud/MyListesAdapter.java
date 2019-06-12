package com.example.todolisterivaud;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.example.todolisterivaud.Model.Listes;

class MyListesAdapter extends ArrayAdapter<Listes> {

    public MyListesAdapter(Context c) {
        super(c, 0);
    }

//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = LayoutInflater.from(this.getContext());
//        View v = inflater.inflate(R.layout.activity_liste_details, null);
//
//        Listes data = this.getItem(position);
//        ToDoList toDoLists = data.getTodoListes();
//        TextView listeName = v.findViewById(R.id.listeName);
//        ListView listeItems = v.findViewById(R.id.listeItems);
//
//        listeName.setText(toDoLists.getName());
//    }
}
