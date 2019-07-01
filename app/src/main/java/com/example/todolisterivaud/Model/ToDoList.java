package com.example.todolisterivaud.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.Arrays;

public class ToDoList implements Parcelable {

    private String name;
    private ArrayList<String> listItems;

    public ToDoList() {
    }

    public ToDoList(String name, ArrayList<String> listItems) {
        this.name = name;
        this.listItems = listItems;
    }
    public  ToDoList(String name, String[] listItems){
        this.name = name;
        String [] strings = new String [] {"1", "2" };
        this.listItems = new ArrayList<String>(Arrays.asList(listItems));
    }

    protected ToDoList(Parcel in) {
        name = in.readString();
        listItems = in.createStringArrayList();
    }

    public static final Creator<ToDoList> CREATOR = new Creator<ToDoList>() {
        @Override
        public ToDoList createFromParcel(Parcel in) {
            return new ToDoList(in);
        }

        @Override
        public ToDoList[] newArray(int size) {
            return new ToDoList[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getListItems() {
        return listItems;
    }

    public void setListItems(ArrayList<String> listItems) {
        this.listItems = listItems;
    }

    @Override
    public String toString() {
        return "ToDoList{" +
                "name='" + name + '\'' +
                ", listItems=" + listItems.toString() +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(name);
        parcel.writeStringList(listItems);

    }
}
