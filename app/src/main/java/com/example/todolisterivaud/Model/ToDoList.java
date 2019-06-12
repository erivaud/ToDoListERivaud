package com.example.todolisterivaud.Model;

import java.io.Serializable;
import java.util.Arrays;

public class ToDoList implements Serializable {

    private String name;
    private ListItem[] listItems;

    public ToDoList() {
    }

    public ToDoList(String name, ListItem[] listItems) {
        this.name = name;
        this.listItems = listItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListItem[] getListItems() {
        return listItems;
    }

    public void setListItems(ListItem[] listItems) {
        this.listItems = listItems;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "name='" + name + '\'' +
                ", listItems=" + Arrays.toString(listItems) +
                '}';
    }

}
