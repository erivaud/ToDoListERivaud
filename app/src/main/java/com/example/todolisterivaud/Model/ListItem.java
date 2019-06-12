package com.example.todolisterivaud.Model;

public class ListItem {

    private String elements;

    public ListItem() {
    }

    public ListItem(String elements) {
        this.elements = elements;
    }

    public String getElements() {
        return elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "ListItem{" +
                "elements='" + elements + '\'' +
                '}';
    }
}
