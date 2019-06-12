package com.example.todolisterivaud.Model;

public class ToDoList {

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


}
