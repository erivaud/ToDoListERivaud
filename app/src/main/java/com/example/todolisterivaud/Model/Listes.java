package com.example.todolisterivaud.Model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Listes implements Parcelable {

    private String utilisateur;
    private String password;
    private ArrayList<ToDoList> todoListes;

    public Listes() {
    }

    public Listes(String utilisateur, String password) {
        this.utilisateur = utilisateur;
        this.password = password;
    }

    public Listes(String utilisateur, String password, ArrayList<ToDoList> todoListes) {
        this.utilisateur = utilisateur;
        this.password = password;
        this.todoListes = todoListes;
    }


   protected Listes(Parcel in) {
        utilisateur = in.readString();
        password = in.readString();
        todoListes = in.createTypedArrayList(ToDoList.CREATOR);
    }

    public static final Creator<Listes> CREATOR = new Creator<Listes>() {
        @Override
        public Listes createFromParcel(Parcel in) {
            return new Listes(in);
        }

        @Override
        public Listes[] newArray(int size) {
            return new Listes[size];
        }
    };

    public String getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<ToDoList> getTodoListes() {
        return todoListes;
    }

    public void setTodoListes(ArrayList<ToDoList> todoListes) {
        this.todoListes = todoListes;
    }

    @Override
    public String toString() {
        return "Listes{" +
                "utilisateur='" + utilisateur + '\'' +
                ", password='" + password + '\'' +
                ", todoListes=" + todoListes.toString() +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(utilisateur);
        parcel.writeString(password);
        parcel.writeParcelable((Parcelable) todoListes,0);
    }

 /*   @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(utilisateur);
        dest.writeString(password);
        dest.writeParcelableArray(todoListes, 0);

    }*/
}
