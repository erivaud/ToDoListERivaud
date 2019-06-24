package com.example.todolisterivaud.Model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class ToDoList implements Parcelable {

    private String name;
    private ListItem[] listItems;

    public ToDoList() {
    }

    public ToDoList(String name, ListItem[] listItems) {
        this.name = name;
        this.listItems = listItems;
    }

    protected ToDoList(Parcel in) {
        name = in.readString();
        listItems = in.createTypedArray(ListItem.CREATOR);
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(name);
        parcel.writeParcelableArray(listItems,0);
    }
}
