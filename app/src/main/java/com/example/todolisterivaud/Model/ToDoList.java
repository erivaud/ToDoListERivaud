package com.example.todolisterivaud.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class ToDoList implements Serializable {

    private String name;
    private ArrayList<String> elements;

    public ToDoList() {
    }

    public ToDoList(String name, ArrayList<String> elements) {
        this.name = name;
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    public void setElements(ArrayList<String> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "name='" + name + '\'' +
                ", elements=" + elements +
                '}';
    }


}
