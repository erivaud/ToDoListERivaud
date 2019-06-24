package com.example.todolisterivaud.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class Listes implements Parcelable {

    private String utilisateur;
    private String password;
    private ToDoList[] todoListes;

    public Listes() {
    }

    public Listes(String utilisateur, String password) {
        this.utilisateur = utilisateur;
        this.password = password;
    }

    public Listes(String utilisateur, String password, ToDoList[] todoListes) {
        this.utilisateur = utilisateur;
        this.password = password;
        this.todoListes = todoListes;
    }


    protected Listes(Parcel in) {
        utilisateur = in.readString();
        password = in.readString();
        todoListes = in.createTypedArray(ToDoList.CREATOR);
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

    public ToDoList[] getTodoListes() {
        return todoListes;
    }

    public void setTodoListes(ToDoList[] todoListes) {
        this.todoListes = todoListes;
    }

    @Override
    public String toString() {
        return "Listes{" +
                "utilisateur='" + utilisateur + '\'' +
                ", password='" + password + '\'' +
                ", todoListes=" + todoListes +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(utilisateur);
        dest.writeString(password);
        dest.writeParcelableArray(todoListes, 0);

    }
}
